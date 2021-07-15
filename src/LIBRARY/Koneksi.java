package LIBRARY;

import java.awt.Color;
import java.awt.Component;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class Koneksi {

    private Message msg = new Message();

    private Connection con;
    private Statement st;
    private final String DRIVER = "com.mysql.jdbc.Driver";
    private final String DATABASE = "multinomial";
    private final String USER = "root";
    private final String PASS = "";

    public Koneksi() {
        try {
            Class.forName(DRIVER);
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + DATABASE, USER, PASS);
            st = con.createStatement();
//            msg.msgInformation("Koneksi Sukses");
        } catch (ClassNotFoundException | SQLException e) {
            msg.msgError("Error Koneksi : " + e.getMessage());
        }
    }

    public ResultSet getQuery(String query) {
        try {
            return st.executeQuery(query);
        } catch (SQLException e) {
            msg.msgError("Error Query : " + e.getMessage());
            return null;
        }
    }

    public void setExecute(String query) {
        try {
            st.executeUpdate(query);
        } catch (SQLException e) {
            msg.msgError("Error Execute : " + e.getMessage());
        }
    }
    
    public ResultSet selectAll(String table) {
        try {
            return this.getQuery("SELECT * FROM ".concat(table));
        } catch (Exception e) {
            msg.msgError("Error Select All : " + e.getMessage());
            return null;
        }
    }

    public void updateData(String table, String[][] value, String[][] filter) {
        try {
            final StringBuilder SQL = new StringBuilder();
            SQL.append("UPDATE ").append(table).append(" SET ");
            for (int i = 0; i < value.length; i++) {
                SQL.append(value[i][0]).append(" = '").append(value[i][1]).append("'");
                if (i < value.length - 1) {
                    SQL.append(", ");
                }
            }
            SQL.append(" WHERE ");
            for (int i = 0; i < filter.length; i++) {
                SQL.append(filter[i][0]).append(" = '").append(filter[i][1]).append("'");
                if (i < filter.length - 1) {
                    SQL.append(",");
                }
            }
            
            this.setExecute(SQL.toString());
        } catch (Exception e) {
            msg.msgError("Error Update Data : " + e.getMessage());
        }
    }

    public void deleteData(String table, String[][] filter) {
        try {
            final StringBuilder SQL = new StringBuilder();
            SQL.append("DELETE FROM ").append(table);

            if (filter != null) {
                SQL.append(" WHERE ");
                for (int i = 0; i < filter.length; i++) {
                    SQL.append(filter[i][0]).append(" = '").append(filter[i][1]).append("'");
                    if (i < filter.length - 1) {
                        SQL.append(", ");
                    }
                }
            }

            this.setExecute(SQL.toString());
        } catch (Exception e) {
            msg.msgError("Error Delete Data : " + e.getMessage());
        }
    }

    public void insertData(String table, String[] value) {
        try {
            final StringBuilder VALUES = new StringBuilder();
            for (int i = 0; i < value.length; i++) {
                VALUES.append("'").append(value[i]).append("'");
                if (i < value.length - 1) {
                    VALUES.append(", ");
                }
            }
            final StringBuilder SQL = new StringBuilder();
            SQL.append("INSERT INTO ").append(table).append(" VALUES(").append(VALUES.toString()).append(")");
            this.setExecute(SQL.toString());
        } catch (Exception e) {
            msg.msgError("Error Insert Data : " + e.getMessage());
        }
    }

    public String getDB() {
        return DATABASE;
    }

    public Connection getCon() {
        return con;
    }

    public void showTabel(JTable tabel, String[] header, String sql) {
        try {
            DefaultTableModel model = new DefaultTableModel(header, 1) {
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

            ResultSet rs = getQuery(sql);

            int baris = 0;
            while (rs.next()) {
                String[] kolom = new String[header.length];
                for (int i = 0; i < header.length; i++) {
                    kolom[i] = rs.getString(i + 1);
                }
                model.insertRow(baris, kolom);
                baris++;
            }

            tabel.setModel(model);

        } catch (Exception e) {
            msg.msgError("Error Show Tabel : " + e.getMessage());
        }
    }

    public String getRandomID() {
        String word = "", character = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789";
        for (int i = 0; i < 5; i++) {
            word += character.charAt(new Random().nextInt(character.length()));
        }
        return word;
    }

}
