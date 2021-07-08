package FORM;

public class DialogAkurasiData extends javax.swing.JDialog {
    
    private int[] COUNT_PREDICT, COUNT_KALIMAT;
    
    public DialogAkurasiData(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    public DialogAkurasiData(java.awt.Frame parent, boolean modal, int[] COUNT_PREDICT, int[] COUNT_KALIMAT) {
        super(parent, modal);
        initComponents();
        
        this.COUNT_PREDICT = COUNT_PREDICT;
        this.COUNT_KALIMAT = COUNT_KALIMAT;
    }

    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlHeader = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        lbl_3_3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        lbl_0_0 = new javax.swing.JLabel();
        lbl_1_0 = new javax.swing.JLabel();
        lbl_2_0 = new javax.swing.JLabel();
        lbl_3_0 = new javax.swing.JLabel();
        lbl_0_1 = new javax.swing.JLabel();
        lbl_1_1 = new javax.swing.JLabel();
        lbl_2_1 = new javax.swing.JLabel();
        lbl_3_1 = new javax.swing.JLabel();
        lbl_0_2 = new javax.swing.JLabel();
        lbl_1_2 = new javax.swing.JLabel();
        lbl_2_2 = new javax.swing.JLabel();
        lbl_3_2 = new javax.swing.JLabel();
        lbl_0_3 = new javax.swing.JLabel();
        lbl_1_3 = new javax.swing.JLabel();
        lbl_2_3 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        lbl_accuracy = new javax.swing.JLabel();
        lbl_precission = new javax.swing.JLabel();
        lbl_recall = new javax.swing.JLabel();
        lbl_fmeasure = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Akurasi Data");

        pnlHeader.setBackground(new java.awt.Color(22, 160, 133));

        jLabel1.setBackground(new java.awt.Color(80, 133, 173));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(254, 254, 254));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon("/media/ndong/DATA/PROJECT/NETBEANS/Multinomial/src/IMAGES/test.png")); // NOI18N
        jLabel1.setText("AKURASI DATA");
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

        jLabel2.setBackground(new java.awt.Color(254, 254, 254));
        jLabel2.setFont(new java.awt.Font("Lohit Devanagari", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(1, 1, 1));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Recall");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel2.setOpaque(true);

        jLabel3.setBackground(new java.awt.Color(254, 254, 254));
        jLabel3.setFont(new java.awt.Font("Lohit Devanagari", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(1, 1, 1));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Accuracy");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel3.setOpaque(true);

        jLabel4.setBackground(new java.awt.Color(254, 254, 254));
        jLabel4.setFont(new java.awt.Font("Lohit Devanagari", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(1, 1, 1));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("F-Measure");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel4.setOpaque(true);

        jLabel5.setBackground(new java.awt.Color(254, 254, 254));
        jLabel5.setFont(new java.awt.Font("Lohit Devanagari", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(1, 1, 1));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Precision");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel5.setOpaque(true);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);

        lbl_3_3.setBackground(new java.awt.Color(254, 254, 254));
        lbl_3_3.setFont(new java.awt.Font("Lohit Devanagari", 0, 14)); // NOI18N
        lbl_3_3.setForeground(new java.awt.Color(1, 1, 1));
        lbl_3_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_3_3.setText("1.000");
        lbl_3_3.setOpaque(true);

        jLabel7.setBackground(new java.awt.Color(254, 254, 254));
        jLabel7.setFont(new java.awt.Font("Lohit Devanagari", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(1, 1, 1));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Sedih");
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel7.setOpaque(true);

        jLabel8.setBackground(new java.awt.Color(254, 254, 254));
        jLabel8.setFont(new java.awt.Font("Lohit Devanagari", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(1, 1, 1));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Sensitif");
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel8.setOpaque(true);

        jLabel10.setBackground(new java.awt.Color(254, 254, 254));
        jLabel10.setFont(new java.awt.Font("Lohit Devanagari", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(1, 1, 1));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Lelah");
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel10.setOpaque(true);

        jLabel9.setBackground(new java.awt.Color(254, 254, 254));
        jLabel9.setFont(new java.awt.Font("Lohit Devanagari", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(1, 1, 1));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Depresi");
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel9.setOpaque(true);

        lbl_0_0.setBackground(new java.awt.Color(254, 254, 254));
        lbl_0_0.setFont(new java.awt.Font("Lohit Devanagari", 0, 14)); // NOI18N
        lbl_0_0.setForeground(new java.awt.Color(1, 1, 1));
        lbl_0_0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_0_0.setText("1.000");
        lbl_0_0.setOpaque(true);

        lbl_1_0.setBackground(new java.awt.Color(254, 254, 254));
        lbl_1_0.setFont(new java.awt.Font("Lohit Devanagari", 0, 14)); // NOI18N
        lbl_1_0.setForeground(new java.awt.Color(1, 1, 1));
        lbl_1_0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_1_0.setText("1.000");
        lbl_1_0.setOpaque(true);

        lbl_2_0.setBackground(new java.awt.Color(254, 254, 254));
        lbl_2_0.setFont(new java.awt.Font("Lohit Devanagari", 0, 14)); // NOI18N
        lbl_2_0.setForeground(new java.awt.Color(1, 1, 1));
        lbl_2_0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_2_0.setText("1.000");
        lbl_2_0.setOpaque(true);

        lbl_3_0.setBackground(new java.awt.Color(254, 254, 254));
        lbl_3_0.setFont(new java.awt.Font("Lohit Devanagari", 0, 14)); // NOI18N
        lbl_3_0.setForeground(new java.awt.Color(1, 1, 1));
        lbl_3_0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_3_0.setText("1.000");
        lbl_3_0.setOpaque(true);

        lbl_0_1.setBackground(new java.awt.Color(254, 254, 254));
        lbl_0_1.setFont(new java.awt.Font("Lohit Devanagari", 0, 14)); // NOI18N
        lbl_0_1.setForeground(new java.awt.Color(1, 1, 1));
        lbl_0_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_0_1.setText("1.000");
        lbl_0_1.setOpaque(true);

        lbl_1_1.setBackground(new java.awt.Color(254, 254, 254));
        lbl_1_1.setFont(new java.awt.Font("Lohit Devanagari", 0, 14)); // NOI18N
        lbl_1_1.setForeground(new java.awt.Color(1, 1, 1));
        lbl_1_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_1_1.setText("1.000");
        lbl_1_1.setOpaque(true);

        lbl_2_1.setBackground(new java.awt.Color(254, 254, 254));
        lbl_2_1.setFont(new java.awt.Font("Lohit Devanagari", 0, 14)); // NOI18N
        lbl_2_1.setForeground(new java.awt.Color(1, 1, 1));
        lbl_2_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_2_1.setText("1.000");
        lbl_2_1.setOpaque(true);

        lbl_3_1.setBackground(new java.awt.Color(254, 254, 254));
        lbl_3_1.setFont(new java.awt.Font("Lohit Devanagari", 0, 14)); // NOI18N
        lbl_3_1.setForeground(new java.awt.Color(1, 1, 1));
        lbl_3_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_3_1.setText("1.000");
        lbl_3_1.setOpaque(true);

        lbl_0_2.setBackground(new java.awt.Color(254, 254, 254));
        lbl_0_2.setFont(new java.awt.Font("Lohit Devanagari", 0, 14)); // NOI18N
        lbl_0_2.setForeground(new java.awt.Color(1, 1, 1));
        lbl_0_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_0_2.setText("1.000");
        lbl_0_2.setOpaque(true);

        lbl_1_2.setBackground(new java.awt.Color(254, 254, 254));
        lbl_1_2.setFont(new java.awt.Font("Lohit Devanagari", 0, 14)); // NOI18N
        lbl_1_2.setForeground(new java.awt.Color(1, 1, 1));
        lbl_1_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_1_2.setText("1.000");
        lbl_1_2.setOpaque(true);

        lbl_2_2.setBackground(new java.awt.Color(254, 254, 254));
        lbl_2_2.setFont(new java.awt.Font("Lohit Devanagari", 0, 14)); // NOI18N
        lbl_2_2.setForeground(new java.awt.Color(1, 1, 1));
        lbl_2_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_2_2.setText("1.000");
        lbl_2_2.setOpaque(true);

        lbl_3_2.setBackground(new java.awt.Color(254, 254, 254));
        lbl_3_2.setFont(new java.awt.Font("Lohit Devanagari", 0, 14)); // NOI18N
        lbl_3_2.setForeground(new java.awt.Color(1, 1, 1));
        lbl_3_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_3_2.setText("1.000");
        lbl_3_2.setOpaque(true);

        lbl_0_3.setBackground(new java.awt.Color(254, 254, 254));
        lbl_0_3.setFont(new java.awt.Font("Lohit Devanagari", 0, 14)); // NOI18N
        lbl_0_3.setForeground(new java.awt.Color(1, 1, 1));
        lbl_0_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_0_3.setText("1.000");
        lbl_0_3.setOpaque(true);

        lbl_1_3.setBackground(new java.awt.Color(254, 254, 254));
        lbl_1_3.setFont(new java.awt.Font("Lohit Devanagari", 0, 14)); // NOI18N
        lbl_1_3.setForeground(new java.awt.Color(1, 1, 1));
        lbl_1_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_1_3.setText("1.000");
        lbl_1_3.setOpaque(true);

        lbl_2_3.setBackground(new java.awt.Color(254, 254, 254));
        lbl_2_3.setFont(new java.awt.Font("Lohit Devanagari", 0, 14)); // NOI18N
        lbl_2_3.setForeground(new java.awt.Color(1, 1, 1));
        lbl_2_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_2_3.setText("1.000");
        lbl_2_3.setOpaque(true);

        jLabel26.setFont(new java.awt.Font("Lohit Devanagari", 1, 18)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("PERSENTASE");

        lbl_accuracy.setBackground(new java.awt.Color(254, 254, 254));
        lbl_accuracy.setFont(new java.awt.Font("Lohit Devanagari", 1, 14)); // NOI18N
        lbl_accuracy.setForeground(new java.awt.Color(1, 1, 1));
        lbl_accuracy.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_accuracy.setText("ACCURACY : 100 %");
        lbl_accuracy.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbl_accuracy.setOpaque(true);

        lbl_precission.setBackground(new java.awt.Color(254, 254, 254));
        lbl_precission.setFont(new java.awt.Font("Lohit Devanagari", 1, 14)); // NOI18N
        lbl_precission.setForeground(new java.awt.Color(1, 1, 1));
        lbl_precission.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_precission.setText("PRECISSION : 100 %");
        lbl_precission.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbl_precission.setOpaque(true);

        lbl_recall.setBackground(new java.awt.Color(254, 254, 254));
        lbl_recall.setFont(new java.awt.Font("Lohit Devanagari", 1, 14)); // NOI18N
        lbl_recall.setForeground(new java.awt.Color(1, 1, 1));
        lbl_recall.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_recall.setText("RECALL : 100 %");
        lbl_recall.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbl_recall.setOpaque(true);

        lbl_fmeasure.setBackground(new java.awt.Color(254, 254, 254));
        lbl_fmeasure.setFont(new java.awt.Font("Lohit Devanagari", 1, 14)); // NOI18N
        lbl_fmeasure.setForeground(new java.awt.Color(1, 1, 1));
        lbl_fmeasure.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_fmeasure.setText("F-MEASURE : 100 %");
        lbl_fmeasure.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbl_fmeasure.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(473, 473, 473)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(lbl_2_2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_0_3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(320, 320, 320)
                        .addComponent(lbl_3_1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(lbl_2_0, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(313, 313, 313)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(320, 320, 320)
                        .addComponent(lbl_0_1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(320, 320, 320)
                        .addComponent(lbl_1_1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(640, 640, 640)
                        .addComponent(lbl_2_3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(lbl_0_0, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(640, 640, 640)
                        .addComponent(lbl_3_3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(320, 320, 320)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(480, 480, 480)
                        .addComponent(lbl_0_2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(lbl_3_0, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(320, 320, 320)
                        .addComponent(lbl_2_1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(480, 480, 480)
                        .addComponent(lbl_3_2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(480, 480, 480)
                        .addComponent(lbl_1_2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(480, 480, 480)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(640, 640, 640)
                        .addComponent(lbl_1_3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(lbl_1_0, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 8, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator8)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_accuracy, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_precission, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_recall, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_fmeasure, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(lbl_2_2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(lbl_0_3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addComponent(lbl_3_1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(lbl_2_0, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(lbl_0_1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(lbl_1_1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(lbl_2_3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(lbl_0_0, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addComponent(lbl_3_3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(lbl_0_2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addComponent(lbl_3_0, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(lbl_2_1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addComponent(lbl_3_2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(lbl_1_2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(lbl_1_3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(lbl_1_0, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_accuracy, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_precission, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_recall, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_fmeasure, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(818, 612));
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
            java.util.logging.Logger.getLogger(DialogAkurasiData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(() -> {
            DialogAkurasiData dialog = new DialogAkurasiData(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JLabel lbl_0_0;
    private javax.swing.JLabel lbl_0_1;
    private javax.swing.JLabel lbl_0_2;
    private javax.swing.JLabel lbl_0_3;
    private javax.swing.JLabel lbl_1_0;
    private javax.swing.JLabel lbl_1_1;
    private javax.swing.JLabel lbl_1_2;
    private javax.swing.JLabel lbl_1_3;
    private javax.swing.JLabel lbl_2_0;
    private javax.swing.JLabel lbl_2_1;
    private javax.swing.JLabel lbl_2_2;
    private javax.swing.JLabel lbl_2_3;
    private javax.swing.JLabel lbl_3_0;
    private javax.swing.JLabel lbl_3_1;
    private javax.swing.JLabel lbl_3_2;
    private javax.swing.JLabel lbl_3_3;
    private javax.swing.JLabel lbl_accuracy;
    private javax.swing.JLabel lbl_fmeasure;
    private javax.swing.JLabel lbl_precission;
    private javax.swing.JLabel lbl_recall;
    private javax.swing.JPanel pnlHeader;
    // End of variables declaration//GEN-END:variables
}
