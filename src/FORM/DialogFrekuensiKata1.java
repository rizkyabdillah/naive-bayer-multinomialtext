package FORM;

import LIBRARY.LibColor;
import MODEL.FrekuensiModel;
import java.awt.Color;
import java.awt.Component;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class DialogFrekuensiKata1 extends javax.swing.JDialog {
    
    
    
    public DialogFrekuensiKata1(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    public DialogFrekuensiKata1(java.awt.Frame parent, boolean modal, String title, List<FrekuensiModel> list) {
        super(parent, modal);
        this.setTitle(title);
        initComponents();
        
        boxTotal.setText("|  Total Kata : " + list.size() + "  |");
        
        final String[] header = {
            "Nomor", "Kata Unik", "Depresi", "Sedih", "Sensitif", "Lelah"
        };
        DefaultTableModel model = new DefaultTableModel(header, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        
        tabel.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {

                DefaultTableCellRenderer DEFAULT_RENDERER = new DefaultTableCellRenderer();

                @Override
                public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {

                    Component c = DEFAULT_RENDERER.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                    if (isSelected) {
                        c.setBackground(LibColor.getHrefColor());
                        c.setForeground(Color.WHITE);
                    } else if (row % 2 == 0) {
                        c.setBackground(LibColor.getColor());
                        c.setForeground(Color.WHITE);
                    } else {
                        c.setBackground(LibColor.foreColor());
                        c.setForeground(Color.WHITE);
                    }
                    return c;
                }
            });

        tabel.setRowHeight(38);

        for(int i = 0; i < list.size(); i++) {
            String[] kolom = {
                "" + (i + 1),
                list.get(i).getKata(),
                "" + list.get(i).getDepresi(),
                "" + list.get(i).getSedih(),
                "" + list.get(i).getSensitif(),
                "" + list.get(i).getLelah()
            };
            model.insertRow(i, kolom);
        }

        tabel.setModel(model);        
        tabel.getColumnModel().getColumn(0).setMinWidth(20);
        tabel.getColumnModel().getColumn(1).setMinWidth(200);
        tabel.getColumnModel().getColumn(2).setMinWidth(40);
        tabel.getColumnModel().getColumn(3).setMinWidth(40);
        tabel.getColumnModel().getColumn(4).setMinWidth(40);
        tabel.getColumnModel().getColumn(5).setMinWidth(40);
        
    }

    
    private static String toString(double value) {
        return String.valueOf(value);
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlHeader = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        boxTotal = new javax.swing.JLabel();

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
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlHeaderLayout.setVerticalGroup(
            pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabel.setFont(new java.awt.Font("Lohit Devanagari", 0, 14)); // NOI18N
        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tabel);

        boxTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        boxTotal.setText("Total Kata : ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane3)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boxTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(boxTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(500, 590));
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
            java.util.logging.Logger.getLogger(DialogFrekuensiKata1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(() -> {
            DialogFrekuensiKata1 dialog = new DialogFrekuensiKata1(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel boxTotal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel pnlHeader;
    private javax.swing.JTable tabel;
    // End of variables declaration//GEN-END:variables
}
