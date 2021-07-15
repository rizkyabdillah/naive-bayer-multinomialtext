package FORM;

import MODEL.FrekuensiModel;
import java.util.List;

public class DialogFrekuensiKata extends javax.swing.JDialog {
    
    
    
    public DialogFrekuensiKata(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    public DialogFrekuensiKata(java.awt.Frame parent, boolean modal, String title, List<FrekuensiModel> list) {
        super(parent, modal);
        this.setTitle(title);
        initComponents();
        
        final String BANYAK_KATA = "=> Total kata unik : " + list.size() + "\n\n";
        final String PEMBATAS =  "+================+=========+=========+=========+=========+\n";
        final String PEMBATAS1 =  "+================+=========+=========+=========+=========+";
        
        String header = "";
        header += BANYAK_KATA;
        header += PEMBATAS;
        header += String.format("|%-16s|%9s|%9s|%9s|%9s|%n", "Kata Unik", "Depresi", "Sedih", "Sensitif", "Lelah");
        header += PEMBATAS1;
        boxHeader.setText(header);
        
        String texts = "";
        
        for(FrekuensiModel v : list) {
            texts +=  String.format("|%-16s|%9s|%9s|%9s|%9s|%n", v.getKata(), toString(v.getDepresi()), toString(v.getSedih()), toString(v.getSensitif()), toString(v.getLelah()));
        }
        final String FULL = texts.concat(PEMBATAS);
        boxResult.setText(FULL);
        
    }

    
    private static String toString(double value) {
        return String.valueOf(value);
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlHeader = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        boxResult = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        boxHeader = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnlHeader.setBackground(new java.awt.Color(22, 160, 133));

        jLabel1.setBackground(new java.awt.Color(80, 133, 173));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(254, 254, 254));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon("/media/ndong/DATA/PROJECT/NETBEANS/Multinomial/src/IMAGES/test.png")); // NOI18N
        jLabel1.setText("FREKUENSI KATA");
        jLabel1.setInheritsPopupMenu(false);

        javax.swing.GroupLayout pnlHeaderLayout = new javax.swing.GroupLayout(pnlHeader);
        pnlHeader.setLayout(pnlHeaderLayout);
        pnlHeaderLayout.setHorizontalGroup(
            pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlHeaderLayout.setVerticalGroup(
            pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        boxResult.setEditable(false);
        boxResult.setColumns(8);
        boxResult.setFont(new java.awt.Font("Monospaced", 0, 13)); // NOI18N
        boxResult.setRows(10);
        boxResult.setBorder(null);
        jScrollPane1.setViewportView(boxResult);

        boxHeader.setEditable(false);
        boxHeader.setColumns(8);
        boxHeader.setFont(new java.awt.Font("Monospaced", 0, 13)); // NOI18N
        boxHeader.setRows(5);
        boxHeader.setBorder(null);
        jScrollPane2.setViewportView(boxHeader);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(514, 597));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("GTK+".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DialogFrekuensiKata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(() -> {
            DialogFrekuensiKata dialog = new DialogFrekuensiKata(new javax.swing.JFrame(), true);
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
    private javax.swing.JTextArea boxHeader;
    private javax.swing.JTextArea boxResult;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel pnlHeader;
    // End of variables declaration//GEN-END:variables
}
