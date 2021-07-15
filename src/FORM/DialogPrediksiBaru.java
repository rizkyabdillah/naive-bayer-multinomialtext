package FORM;

import LIBRARY.Message;
import MODEL.FrekuensiModel;
import java.util.List;

public class DialogPrediksiBaru extends javax.swing.JDialog {

    private final Message MSG = new Message();
    private List<FrekuensiModel> list;
    private double[] count;

    public DialogPrediksiBaru(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public DialogPrediksiBaru(java.awt.Frame parent, boolean modal, String title, List<FrekuensiModel> list, double[] count) {
        super(parent, modal);

        this.setTitle(title);
        initComponents();

        this.list = list;
        this.count = count;

//        this.list.add(new FrekuensiModel("", 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0));
    }

    private FrekuensiModel getFrekuensiModel(List<FrekuensiModel> model, String key) {
        int index = 0;
        for (int i = 0; i < model.size(); i++) {
            if (model.get(i).getKata().equals(key)) {
                index = i;
            }
        }

        if (index == 0) {
            return null;
        }

        return model.get(index);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlHeader = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        boxKalimat = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        btnPrediksiBaru = new javax.swing.JLabel();
        textPrediksi = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        pnlHeader.setBackground(new java.awt.Color(22, 160, 133));

        jLabel1.setBackground(new java.awt.Color(80, 133, 173));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(254, 254, 254));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon("/media/ndong/DATA/PROJECT/NETBEANS/Multinomial/src/IMAGES/test.png")); // NOI18N
        jLabel1.setText("PREDIKSI DATA BARU");
        jLabel1.setInheritsPopupMenu(false);

        javax.swing.GroupLayout pnlHeaderLayout = new javax.swing.GroupLayout(pnlHeader);
        pnlHeader.setLayout(pnlHeaderLayout);
        pnlHeaderLayout.setHorizontalGroup(
            pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlHeaderLayout.setVerticalGroup(
            pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        boxKalimat.setColumns(20);
        boxKalimat.setLineWrap(true);
        boxKalimat.setRows(5);
        boxKalimat.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jScrollPane1.setViewportView(boxKalimat);

        jLabel2.setFont(new java.awt.Font("Lohit Devanagari", 0, 13)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Masukkan Kalimat Dikolom Bawah Ini!");

        btnPrediksiBaru.setBackground(new java.awt.Color(22, 160, 133));
        btnPrediksiBaru.setForeground(new java.awt.Color(254, 254, 254));
        btnPrediksiBaru.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnPrediksiBaru.setIcon(new javax.swing.ImageIcon("/media/ndong/DATA/PROJECT/NETBEANS/Multinomial/src/IMAGES/a_check.png")); // NOI18N
        btnPrediksiBaru.setText("Hitung Prediksi");
        btnPrediksiBaru.setBorder(null);
        btnPrediksiBaru.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPrediksiBaru.setOpaque(true);
        btnPrediksiBaru.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                onHitungPrediksi(evt);
            }
        });

        textPrediksi.setFont(new java.awt.Font("Lohit Devanagari", 0, 20)); // NOI18N
        textPrediksi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textPrediksi.setText("PREDIKSI : _ _ _ _ _ _");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textPrediksi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnPrediksiBaru, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE))
                        .addGap(135, 135, 135)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPrediksiBaru, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(textPrediksi, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(613, 499));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void onHitungPrediksi(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onHitungPrediksi
        if (boxKalimat.getText().isEmpty()) {
            MSG.msgWarning("Mohon isi kolom kalimat!");
        } else {
            double product_depresi = count[0];
            double product_sedih = count[1];
            double product_sensitif = count[2];
            double product_lelah = count[3];

            final String KALIMAT = boxKalimat.getText().replaceAll("[^\\dA-Za-z ]", " ").replaceAll("\\s{2,}", " ").toLowerCase();
            final String[] KATA = KALIMAT.split(" ");

            for (String kata : KATA) {
                final FrekuensiModel MODEL = getFrekuensiModel(list, kata);
                if (MODEL != null) {
                    product_depresi *= MODEL.getProb_depresi();
                    product_sedih *= MODEL.getProb_sedih();
                    product_sensitif *= MODEL.getProb_sensitif();
                    product_lelah *= MODEL.getProb_lelah();
                }
                System.out.println("Kata : " + kata + ", (" + MODEL.getProb_depresi() + "),(" + MODEL.getProb_sedih() + "),(" + MODEL.getProb_sensitif() + "),(" + MODEL.getProb_lelah() + ")");
            }

            System.out.println(String.format("%,.12f|%,.12f|%,.12f|%,.12f", product_depresi, product_sedih, product_sensitif, product_lelah));

            final double SUM_PRODUCT = product_depresi + product_lelah + product_sedih + product_sensitif;

            final double PREDICTED_DEPRESI = product_depresi / SUM_PRODUCT;
            final double PREDICTED_SEDIH = product_sedih / SUM_PRODUCT;
            final double PREDICTED_SENSITIF = product_sensitif / SUM_PRODUCT;
            final double PREDICTED_LELAH = product_lelah / SUM_PRODUCT;

            System.out.println(String.format("%,.12f", SUM_PRODUCT));
            System.out.println(String.format("%,.5f|%,.5f|%,.5f|%,.5f", PREDICTED_DEPRESI, PREDICTED_SEDIH, PREDICTED_SENSITIF, PREDICTED_LELAH));

            final double MAX = Math.max(Math.max(PREDICTED_DEPRESI, PREDICTED_SEDIH), Math.max(PREDICTED_SENSITIF, PREDICTED_LELAH));
            String prediction = null;

            if (PREDICTED_DEPRESI == MAX) {
                prediction = "DEPRESI";
            } else if (PREDICTED_SEDIH == MAX) {
                prediction = "SEDIH";
            } else if (PREDICTED_SENSITIF == MAX) {
                prediction = "SENSITIF";
            } else if (PREDICTED_LELAH == MAX) {
                prediction = "LELAH";
            }

            System.out.println(KALIMAT);
            textPrediksi.setText("PREDIKSI : " + prediction + " (" + String.format("%.3f", MAX) + ")");
        }

    }//GEN-LAST:event_onHitungPrediksi

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("GTK+".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DialogPrediksiBaru.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            DialogPrediksiBaru dialog = new DialogPrediksiBaru(new javax.swing.JFrame(), true);
            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent e) {
                    System.exit(0);
                }
            });
            dialog.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea boxKalimat;
    private javax.swing.JLabel btnPrediksiBaru;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlHeader;
    private javax.swing.JLabel textPrediksi;
    // End of variables declaration//GEN-END:variables
}
