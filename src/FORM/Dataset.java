package FORM;

import LIBRARY.Koneksi;
import LIBRARY.Message;
import MODEL.DiprediksiModel;
import MODEL.FrekuensiModel;
import MODEL.PrediksiModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;

public class Dataset extends javax.swing.JFrame {

    private final Message MSG = new Message();
    private final Koneksi CON = new Koneksi();

    private final String HEADER[] = {"ID Dataset", "Kalimat", "Kategori"};
    private final String KATEGORI[] = {"", "Depresi", "Sedih", "Sensitif", "Lelah"};

    public Dataset() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        showTable("");
    }

    private void showTable(String key) {
        try {
            final String SQL = "SELECT * FROM DATASET WHERE "
                    + "kalimat LIKE '%" + key + "%' AND "
                    + "kategori LIKE '%" + KATEGORI[getSelectedFilter()] + "%'";
            CON.showTabel(table, HEADER, SQL);
            table.getColumnModel().getColumn(0).setMinWidth(60);
            table.getColumnModel().getColumn(1).setMinWidth(840);
            table.getColumnModel().getColumn(2).setMinWidth(100);
        } catch (Exception e) {
            MSG.msgError("Error show tabel : " + e.getMessage());
        }
    }

    private int getSelectedFilter() {
        return filterKategori.getSelectedIndex();
    }

    private FrekuensiModel getFrekuensiModel(List<FrekuensiModel> model, String key) {
        int index = 0;
        for (int i = 0; i < model.size(); i++) {
            if (model.get(i).getKata().equals(key)) {
                index = i;
            }
        }

        return model.get(index);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlHeader = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnTambah = new javax.swing.JLabel();
        btnHapus = new javax.swing.JLabel();
        btnReload = new javax.swing.JLabel();
        btnUbah = new javax.swing.JLabel();
        btnFrekuensi = new javax.swing.JLabel();
        btnPrediksi = new javax.swing.JLabel();
        btnAkurasi = new javax.swing.JLabel();
        edtCari = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        filterKategori = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        btnPrediksiBaru = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Form Dataset");

        pnlHeader.setBackground(new java.awt.Color(22, 160, 133));

        jLabel1.setBackground(new java.awt.Color(80, 133, 173));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(254, 254, 254));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon("/media/ndong/DATA/PROJECT/NETBEANS/Multinomial/src/IMAGES/files.png")); // NOI18N
        jLabel1.setText("FORM DATASET");
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
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnTambah.setBackground(new java.awt.Color(22, 160, 133));
        btnTambah.setForeground(new java.awt.Color(254, 254, 254));
        btnTambah.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnTambah.setIcon(new javax.swing.ImageIcon("/media/ndong/DATA/PROJECT/NETBEANS/Multinomial/src/IMAGES/a_tambah.png")); // NOI18N
        btnTambah.setText("Tambah");
        btnTambah.setToolTipText("Tambah Dataset");
        btnTambah.setBorder(null);
        btnTambah.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTambah.setOpaque(true);
        btnTambah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                onTambah(evt);
            }
        });

        btnHapus.setBackground(new java.awt.Color(22, 160, 133));
        btnHapus.setForeground(new java.awt.Color(254, 254, 254));
        btnHapus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnHapus.setIcon(new javax.swing.ImageIcon("/media/ndong/DATA/PROJECT/NETBEANS/Multinomial/src/IMAGES/a_hapus.png")); // NOI18N
        btnHapus.setText("Hapus");
        btnHapus.setBorder(null);
        btnHapus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHapus.setOpaque(true);
        btnHapus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                onHapus(evt);
            }
        });

        btnReload.setBackground(new java.awt.Color(22, 160, 133));
        btnReload.setForeground(new java.awt.Color(254, 254, 254));
        btnReload.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnReload.setIcon(new javax.swing.ImageIcon("/media/ndong/DATA/PROJECT/NETBEANS/Multinomial/src/IMAGES/a_segarkan.png")); // NOI18N
        btnReload.setBorder(null);
        btnReload.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReload.setOpaque(true);
        btnReload.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                onRefresh(evt);
            }
        });

        btnUbah.setBackground(new java.awt.Color(22, 160, 133));
        btnUbah.setForeground(new java.awt.Color(254, 254, 254));
        btnUbah.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnUbah.setIcon(new javax.swing.ImageIcon("/media/ndong/DATA/PROJECT/NETBEANS/Multinomial/src/IMAGES/a_edit.png")); // NOI18N
        btnUbah.setText("Ubah");
        btnUbah.setBorder(null);
        btnUbah.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUbah.setOpaque(true);
        btnUbah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                onUbah(evt);
            }
        });

        btnFrekuensi.setBackground(new java.awt.Color(22, 160, 133));
        btnFrekuensi.setForeground(new java.awt.Color(254, 254, 254));
        btnFrekuensi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnFrekuensi.setIcon(new javax.swing.ImageIcon("/media/ndong/DATA/PROJECT/NETBEANS/Multinomial/src/IMAGES/a_frekuensi.png")); // NOI18N
        btnFrekuensi.setText("Frekuensi Kata");
        btnFrekuensi.setBorder(null);
        btnFrekuensi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFrekuensi.setOpaque(true);
        btnFrekuensi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                onFrekuensiData(evt);
            }
        });

        btnPrediksi.setBackground(new java.awt.Color(22, 160, 133));
        btnPrediksi.setForeground(new java.awt.Color(254, 254, 254));
        btnPrediksi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnPrediksi.setIcon(new javax.swing.ImageIcon("/media/ndong/DATA/PROJECT/NETBEANS/Multinomial/src/IMAGES/a_prediksi.png")); // NOI18N
        btnPrediksi.setText("Prediksi");
        btnPrediksi.setBorder(null);
        btnPrediksi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPrediksi.setOpaque(true);
        btnPrediksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                onPrediksi(evt);
            }
        });

        btnAkurasi.setBackground(new java.awt.Color(22, 160, 133));
        btnAkurasi.setForeground(new java.awt.Color(254, 254, 254));
        btnAkurasi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAkurasi.setIcon(new javax.swing.ImageIcon("/media/ndong/DATA/PROJECT/NETBEANS/Multinomial/src/IMAGES/a_akurasi.png")); // NOI18N
        btnAkurasi.setText(" Akurasi");
        btnAkurasi.setBorder(null);
        btnAkurasi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAkurasi.setOpaque(true);
        btnAkurasi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                onAkurasi(evt);
            }
        });

        edtCari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                onCari(evt);
            }
        });

        table.setBorder(null);
        table.setFont(new java.awt.Font("Lohit Devanagari", 0, 14)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(table);

        filterKategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Filter Semua", "Depresi", "Sedih", "Sensitif", "Lelah" }));
        filterKategori.setBorder(null);
        filterKategori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onFilter(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        btnPrediksiBaru.setBackground(new java.awt.Color(22, 160, 133));
        btnPrediksiBaru.setForeground(new java.awt.Color(254, 254, 254));
        btnPrediksiBaru.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnPrediksiBaru.setIcon(new javax.swing.ImageIcon("/media/ndong/DATA/PROJECT/NETBEANS/Multinomial/src/IMAGES/a_prediksi_baru.png")); // NOI18N
        btnPrediksiBaru.setText("Prediksi Data Baru");
        btnPrediksiBaru.setBorder(null);
        btnPrediksiBaru.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPrediksiBaru.setOpaque(true);
        btnPrediksiBaru.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                onPrediksiBaru(evt);
            }
        });

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(btnUbah, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(btnFrekuensi, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(btnPrediksi, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(btnAkurasi, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(btnPrediksiBaru, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(edtCari, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                        .addGap(3, 3, 3)
                        .addComponent(btnReload, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(filterKategori, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(3, 3, 3))
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnReload, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(edtCari, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPrediksiBaru, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUbah, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFrekuensi, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPrediksi, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAkurasi, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(filterKategori, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        setSize(new java.awt.Dimension(1000, 397));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void onCari(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_onCari
        showTable(edtCari.getText());
    }//GEN-LAST:event_onCari

    private void onFilter(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onFilter
        showTable(edtCari.getText());
    }//GEN-LAST:event_onFilter

    private void onRefresh(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onRefresh
        edtCari.setText("");
        showTable("");
    }//GEN-LAST:event_onRefresh

    private void onTambah(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onTambah
        new DialogAddDataset(this, true).setVisible(true);
        showTable("");
    }//GEN-LAST:event_onTambah

    private void onHapus(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onHapus
        if (table.getSelectedRow() == table.getRowCount() - 1 || table.getSelectedRow() == -1) {
            MSG.msgWarning("Mohon pilih data yang benar!");
        } else {
            final String ID = table.getValueAt(table.getSelectedRow(), 0).toString();
            int i = MSG.msgQuestion("Apakah anda yakin ingin menghapus data tersebut ?");
            if (i == JOptionPane.YES_OPTION) {
                CON.deleteData("DATASET", new String[][]{{"id", ID}});
                showTable("");
            }
        }
    }//GEN-LAST:event_onHapus

    private void onUbah(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onUbah
        if (table.getSelectedRow() == table.getRowCount() - 1 || table.getSelectedRow() == -1) {
            MSG.msgWarning("Mohon pilih data yang benar!");
        } else {
            final String[] arrays = new String[table.getColumnCount()];
            for (int i = 0; i < table.getColumnCount(); i++) {
                arrays[i] = table.getValueAt(table.getSelectedRow(), i).toString();
            }
            new DialogAddDataset(this, true, arrays).setVisible(true);
            showTable("");
        }
    }//GEN-LAST:event_onUbah

    private void onFrekuensiData(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onFrekuensiData
        try {
            final ResultSet RS = CON.selectAll("DATASET");
            final List<String> word = new ArrayList<>();
            final List<String> WORD_DEPRESI = new ArrayList<>();
            final List<String> WORD_SEDIH = new ArrayList<>();
            final List<String> WORD_SENSITIF = new ArrayList<>();
            final List<String> WORD_LELAH = new ArrayList<>();

            final List<FrekuensiModel> FREKUENSI = new ArrayList<>();

            while (RS.next()) {
                final String[] TEMP = RS.getString("kalimat").split(" ");
                Collections.addAll(word, TEMP);

                switch (RS.getString("kategori")) {
                    case "Depresi":
                        Collections.addAll(WORD_DEPRESI, TEMP);
                        break;
                    case "Sedih":
                        Collections.addAll(WORD_SEDIH, TEMP);
                        break;
                    case "Sensitif":
                        Collections.addAll(WORD_SENSITIF, TEMP);
                        break;
                    default:
                        Collections.addAll(WORD_LELAH, TEMP);
                        break;
                }
            }

            // Eliminasi kata yang sama
            List<String> unik = word.stream().distinct().collect(Collectors.toList());

            for (String value : unik) {
                FREKUENSI.add(
                        new FrekuensiModel(
                                value,
                                Collections.frequency(WORD_DEPRESI, value),
                                Collections.frequency(WORD_SEDIH, value),
                                Collections.frequency(WORD_SENSITIF, value),
                                Collections.frequency(WORD_LELAH, value)
                        )
                );
            }
            
            System.out.println("Depresi : " + WORD_DEPRESI.size() + ", Sedih : " + WORD_SEDIH.size() + ", Sensitif : " + WORD_SENSITIF.size() + ", Lelah : " + WORD_LELAH.size());

            new DialogFrekuensiKata1(this, true, "Frekuensi Kata", FREKUENSI, word.size()).setVisible(true);
        } catch (SQLException ex) {
            MSG.msgError("Error Frekuensi Data!");
        }
    }//GEN-LAST:event_onFrekuensiData

    private void onPrediksi(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onPrediksi
        try {
            final ResultSet RS = CON.selectAll("DATASET");
            List<String> word = new ArrayList<>();
            final List<String> KALIMAT = new ArrayList<>();

            final List<String> WORD_DEPRESI = new ArrayList<>();
            final List<String> WORD_SEDIH = new ArrayList<>();
            final List<String> WORD_SENSITIF = new ArrayList<>();
            final List<String> WORD_LELAH = new ArrayList<>();

            final List<FrekuensiModel> FREKUENSI = new ArrayList<>();
            final List<PrediksiModel> PREDIKSI = new ArrayList<>();

            int count_depresi = 0, count_sedih = 0, count_sensitif = 0, count_lelah = 0;

            while (RS.next()) {
                final String _KALIMAT = RS.getString("kalimat");
                KALIMAT.add(_KALIMAT);

                final String[] TEMP = _KALIMAT.split(" ");
                Collections.addAll(word, TEMP);

                switch (RS.getString("kategori")) {
                    case "Depresi":
                        Collections.addAll(WORD_DEPRESI, TEMP);
                        count_depresi++;
                        break;
                    case "Sedih":
                        Collections.addAll(WORD_SEDIH, TEMP);
                        count_sedih++;
                        break;
                    case "Sensitif":
                        Collections.addAll(WORD_SENSITIF, TEMP);
                        count_sensitif++;
                        break;
                    default:
                        Collections.addAll(WORD_LELAH, TEMP);
                        count_lelah++;
                        break;
                }
            }

            // Eliminasi kata yang sama
            word = word.stream().distinct().collect(Collectors.toList());

            for (String value : word) {

                final double FREKUENSI_DEPRESI = Collections.frequency(WORD_DEPRESI, value);
                final double FREKUENSI_SEDIH = Collections.frequency(WORD_SEDIH, value);
                final double FREKUENSI_SENSITIF = Collections.frequency(WORD_SENSITIF, value);
                final double FREKUENSI_LELAH = Collections.frequency(WORD_LELAH, value);

                FREKUENSI.add(
                        new FrekuensiModel(
                                value,
                                FREKUENSI_DEPRESI,
                                FREKUENSI_SEDIH,
                                FREKUENSI_SENSITIF,
                                FREKUENSI_LELAH,
                                (FREKUENSI_DEPRESI + 1) / (word.size() + Math.abs(WORD_DEPRESI.size())),
                                (FREKUENSI_SEDIH + 1) / (word.size() + Math.abs(WORD_SEDIH.size())),
                                (FREKUENSI_SENSITIF + 1) / (word.size() + Math.abs(WORD_SENSITIF.size())),
                                (FREKUENSI_LELAH + 1) / (word.size() + Math.abs(WORD_LELAH.size()))
                        )
                );
            }

            final int[] COUNT = new int[4];

            for (String value : KALIMAT) {
                final String[] KATA = value.split(" ");

                double product_depresi = count_depresi / (double) KALIMAT.size();
                double product_sedih = count_sedih / (double) KALIMAT.size();
                double product_sensitif = count_sensitif / (double) KALIMAT.size();
                double product_lelah = count_lelah / (double) KALIMAT.size();

                for (String kata : KATA) {
                    final FrekuensiModel MODEL = getFrekuensiModel(FREKUENSI, kata);
                    product_depresi *= MODEL.getProb_depresi();
                    product_sedih *= MODEL.getProb_sedih();
                    product_sensitif *= MODEL.getProb_sensitif();
                    product_lelah *= MODEL.getProb_lelah();
                }

                final double SUM_PRODUCT = product_depresi + product_lelah + product_sedih + product_sensitif;

                final double PREDICTED_DEPRESI = product_depresi / SUM_PRODUCT;
                final double PREDICTED_SEDIH = product_sedih / SUM_PRODUCT;
                final double PREDICTED_SENSITIF = product_sensitif / SUM_PRODUCT;
                final double PREDICTED_LELAH = product_lelah / SUM_PRODUCT;

                final double MAX = Math.max(Math.max(PREDICTED_DEPRESI, PREDICTED_SEDIH), Math.max(PREDICTED_SENSITIF, PREDICTED_LELAH));
                String prediction = null;
                if (PREDICTED_DEPRESI == MAX) {
                    prediction = "DEPRESI";
                    COUNT[0]++;
                } else if (PREDICTED_SEDIH == MAX) {
                    prediction = "SEDIH";
                    COUNT[1]++;
                } else if (PREDICTED_SENSITIF == MAX) {
                    prediction = "SENSITIF";
                    COUNT[2]++;
                } else if (PREDICTED_LELAH == MAX) {
                    prediction = "LELAH";
                    COUNT[3]++;
                }
                
                PREDIKSI.add(new PrediksiModel(value, prediction, String.format("%.3f", MAX)));
            }

            new DialogPrediksiData(this, true, "Prediksi Data", PREDIKSI, COUNT).setVisible(true);
        } catch (SQLException e) {
            MSG.msgError("Error Prediksi Data : " + e.getMessage());
        }
    }//GEN-LAST:event_onPrediksi

    private void onPrediksiBaru(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onPrediksiBaru
        try {
            final ResultSet RS = CON.selectAll("DATASET");
            List<String> word = new ArrayList<>();
            final List<String> KALIMAT = new ArrayList<>();

            final List<String> WORD_DEPRESI = new ArrayList<>();
            final List<String> WORD_SEDIH = new ArrayList<>();
            final List<String> WORD_SENSITIF = new ArrayList<>();
            final List<String> WORD_LELAH = new ArrayList<>();

            final List<FrekuensiModel> FREKUENSI = new ArrayList<>();

            int count_depresi = 0, count_sedih = 0, count_sensitif = 0, count_lelah = 0;

            while (RS.next()) {
                final String _KALIMAT = RS.getString("kalimat");
                KALIMAT.add(_KALIMAT);
                final String[] TEMP = _KALIMAT.split(" ");
                Collections.addAll(word, TEMP);

                switch (RS.getString("kategori")) {
                    case "Depresi":
                        Collections.addAll(WORD_DEPRESI, TEMP);
                        count_depresi++;
                        break;
                    case "Sedih":
                        Collections.addAll(WORD_SEDIH, TEMP);
                        count_sedih++;
                        break;
                    case "Sensitif":
                        Collections.addAll(WORD_SENSITIF, TEMP);
                        count_sensitif++;
                        break;
                    default:
                        Collections.addAll(WORD_LELAH, TEMP);
                        count_lelah++;
                        break;
                }
            }

            // Eliminasi kata yang sama
            word = word.stream().distinct().collect(Collectors.toList());

            for (String value : word) {

                final double FREKUENSI_DEPRESI = Collections.frequency(WORD_DEPRESI, value);
                final double FREKUENSI_SEDIH = Collections.frequency(WORD_SEDIH, value);
                final double FREKUENSI_SENSITIF = Collections.frequency(WORD_SENSITIF, value);
                final double FREKUENSI_LELAH = Collections.frequency(WORD_LELAH, value);

                FREKUENSI.add(
                        new FrekuensiModel(
                                value,
                                FREKUENSI_DEPRESI,
                                FREKUENSI_SEDIH,
                                FREKUENSI_SENSITIF,
                                FREKUENSI_LELAH,
                                (FREKUENSI_DEPRESI + 1) / (word.size() + Math.abs(WORD_DEPRESI.size())),
                                (FREKUENSI_SEDIH + 1) / (word.size() + Math.abs(WORD_SEDIH.size())),
                                (FREKUENSI_SENSITIF + 1) / (word.size() + Math.abs(WORD_SENSITIF.size())),
                                (FREKUENSI_LELAH + 1) / (word.size() + Math.abs(WORD_LELAH.size()))
                        )
                );
            }

            final double[] COUNT = {
                count_depresi / (double) KALIMAT.size(),
                count_sedih / (double) KALIMAT.size(),
                count_sensitif / (double) KALIMAT.size(),
                count_lelah / (double) KALIMAT.size()
            };

            new DialogPrediksiBaru(this, true, "Prediksi Data Baru", FREKUENSI, COUNT).setVisible(true);
        } catch (SQLException e) {
            MSG.msgError("Error Prediksi Data : " + e.getMessage());
        }
    }//GEN-LAST:event_onPrediksiBaru

    private void onAkurasi(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onAkurasi
        try {
            final ResultSet RS = CON.selectAll("DATASET");
            List<String> word = new ArrayList<>();
//            final List<String> KALIMAT = new ArrayList<>();

            final List<String> WORD_DEPRESI = new ArrayList<>();
            final List<String> WORD_SEDIH = new ArrayList<>();
            final List<String> WORD_SENSITIF = new ArrayList<>();
            final List<String> WORD_LELAH = new ArrayList<>();

            final List<FrekuensiModel> FREKUENSI = new ArrayList<>();
            final List<DiprediksiModel> DIPREDIKSI = new ArrayList<>();

            final int[] COUNT_KALIMAT = {0, 0, 0, 0};
            
            while (RS.next()) {
                final String _KALIMAT = RS.getString("kalimat");
                int index_diprediksi = 0;

                final String[] TEMP = _KALIMAT.split(" ");
                Collections.addAll(word, TEMP);

                switch (RS.getString("kategori")) {
                    case "Depresi":
                        Collections.addAll(WORD_DEPRESI, TEMP);
                        index_diprediksi = DiprediksiModel.INDEX_DEPRESI;
                        COUNT_KALIMAT[DiprediksiModel.INDEX_DEPRESI]++;
                        break;
                    case "Sedih":
                        Collections.addAll(WORD_SEDIH, TEMP);
                        index_diprediksi = DiprediksiModel.INDEX_SEDIH;
                        COUNT_KALIMAT[DiprediksiModel.INDEX_SEDIH]++;
                        break;
                    case "Sensitif":
                        Collections.addAll(WORD_SENSITIF, TEMP);
                        index_diprediksi = DiprediksiModel.INDEX_SENSITIF;
                        COUNT_KALIMAT[DiprediksiModel.INDEX_SENSITIF]++;
                        break;
                    default:
                        Collections.addAll(WORD_LELAH, TEMP);
                        index_diprediksi = DiprediksiModel.INDEX_LELAH;
                        COUNT_KALIMAT[DiprediksiModel.INDEX_LELAH]++;
                        break;
                }
                
                
                DIPREDIKSI.add(new DiprediksiModel(_KALIMAT, index_diprediksi));
            }

            // Eliminasi kata yang sama
            word = word.stream().distinct().collect(Collectors.toList());

            for (String value : word) {

                final double FREKUENSI_DEPRESI = Collections.frequency(WORD_DEPRESI, value);
                final double FREKUENSI_SEDIH = Collections.frequency(WORD_SEDIH, value);
                final double FREKUENSI_SENSITIF = Collections.frequency(WORD_SENSITIF, value);
                final double FREKUENSI_LELAH = Collections.frequency(WORD_LELAH, value);

                FREKUENSI.add(
                        new FrekuensiModel(
                                value,
                                FREKUENSI_DEPRESI,
                                FREKUENSI_SEDIH,
                                FREKUENSI_SENSITIF,
                                FREKUENSI_LELAH,
                                (FREKUENSI_DEPRESI + 1) / (word.size() + Math.abs(WORD_DEPRESI.size())),
                                (FREKUENSI_SEDIH + 1) / (word.size() + Math.abs(WORD_SEDIH.size())),
                                (FREKUENSI_SENSITIF + 1) / (word.size() + Math.abs(WORD_SENSITIF.size())),
                                (FREKUENSI_LELAH + 1) / (word.size() + Math.abs(WORD_LELAH.size()))
                        )
                );
            }

            final double[][] CONFUSION_MATRIX = {
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0}
            };

            
            for (DiprediksiModel value : DIPREDIKSI) {
                final String[] KATA = value.getKalimat().split(" ");

                double product_depresi = COUNT_KALIMAT[DiprediksiModel.INDEX_DEPRESI] / (double) DIPREDIKSI.size();
                double product_sedih = COUNT_KALIMAT[DiprediksiModel.INDEX_SEDIH] / (double) DIPREDIKSI.size();
                double product_sensitif = COUNT_KALIMAT[DiprediksiModel.INDEX_SENSITIF] / (double) DIPREDIKSI.size();
                double product_lelah = COUNT_KALIMAT[DiprediksiModel.INDEX_LELAH] / (double) DIPREDIKSI.size();

                for (String kata : KATA) {
                    final FrekuensiModel MODEL = getFrekuensiModel(FREKUENSI, kata);
                    product_depresi *= MODEL.getProb_depresi();
                    product_sedih *= MODEL.getProb_sedih();
                    product_sensitif *= MODEL.getProb_sensitif();
                    product_lelah *= MODEL.getProb_lelah();
                }

                final double SUM_PRODUCT = product_depresi + product_lelah + product_sedih + product_sensitif;

                final double PREDICTED_DEPRESI = product_depresi / SUM_PRODUCT;
                final double PREDICTED_SEDIH = product_sedih / SUM_PRODUCT;
                final double PREDICTED_SENSITIF = product_sensitif / SUM_PRODUCT;
                final double PREDICTED_LELAH = product_lelah / SUM_PRODUCT;

                final double MAX = Math.max(Math.max(PREDICTED_DEPRESI, PREDICTED_SEDIH), Math.max(PREDICTED_SENSITIF, PREDICTED_LELAH));
                
                int index_prediksi = 0;
                if (PREDICTED_DEPRESI == MAX) {
                    index_prediksi = DiprediksiModel.INDEX_DEPRESI;
                } else if (PREDICTED_SEDIH == MAX) {
                    index_prediksi = DiprediksiModel.INDEX_SEDIH;
                } else if (PREDICTED_SENSITIF == MAX) {
                    index_prediksi = DiprediksiModel.INDEX_SENSITIF;
                } else if (PREDICTED_LELAH == MAX) {
                    index_prediksi = DiprediksiModel.INDEX_LELAH;
                }
                
                
                CONFUSION_MATRIX[value.getIndex()][index_prediksi]++;
                
            }
            
            new DialogAkurasiData(this, true, CONFUSION_MATRIX, COUNT_KALIMAT).setVisible(true);
        } catch (SQLException e) {
            MSG.msgError("Error Akurasi Data : " + e.getMessage());
        }
    }//GEN-LAST:event_onAkurasi

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("GTK+".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dataset.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new Dataset().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnAkurasi;
    private javax.swing.JLabel btnFrekuensi;
    private javax.swing.JLabel btnHapus;
    private javax.swing.JLabel btnPrediksi;
    private javax.swing.JLabel btnPrediksiBaru;
    private javax.swing.JLabel btnReload;
    private javax.swing.JLabel btnTambah;
    private javax.swing.JLabel btnUbah;
    private javax.swing.JTextField edtCari;
    private javax.swing.JComboBox<String> filterKategori;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JPanel pnlHeader;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
