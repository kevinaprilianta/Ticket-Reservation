package TIKET;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
public class tampil extends JFrame {
    String[][] data = new String[25][9];
    String[] kolom = {"NAMA","KERETA","DARI","TUJUAN",
        "TANGGAL","JAM","PESAN","BAYAR","TOTAL"};
    JTable tabel;
    JScrollPane scroll;
    JLabel judul = new JLabel("DATA PEMESANAN TIKET KERETA API LOKAL");
    String DBUrl = "jdbc:mysql://localhost/project";
    String DBUsername = "root";
    String DBPassword = "";
    Connection koneksi;
    Statement statement;
    ResultSet resultSet;
    Icon back = new ImageIcon("C:\\Users\\A S U S\\Pictures\\PROJECT PBO\\back.png");
    JButton bback = new JButton(back);
    Icon bg = new ImageIcon("C:\\Users\\A S U S\\Pictures\\PROJECT PBO\\loginback3.png");
        JLabel lbg = new JLabel(bg);
    public tampil() {
        setTitle("DATA PEMESANAN TIKET KERETA API LOKAL");
        judul.setFont(new Font ("Imprint MT Shadow",1,20));
        try {
        Class.forName("com.mysql.jdbc.Driver");
            koneksi = DriverManager.getConnection(DBUrl, DBUsername, DBPassword);
            statement = koneksi.createStatement();
            String sql = "select * from customer";
            resultSet = statement.executeQuery(sql);
            int p=0;
            while (resultSet.next()) {
                data[p][0]= resultSet.getString("nama");
                data[p][1]= resultSet.getString("kereta");
                data[p][2]= resultSet.getString("dari");
                data[p][3]= resultSet.getString("tujuan");
                data[p][4]= resultSet.getString("tanggal");
                data[p][5]= resultSet.getString("jam");
                data[p][6]= resultSet.getString("jumlah");
                data[p][7]= resultSet.getString("pembayaran");
                data[p][8]= resultSet.getString("total");
                p++;
            }
            statement.close();
            koneksi.close();
        }
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Data Gagal Ditampilkan", "DATA PEMESANAN TIKET", JOptionPane.ERROR_MESSAGE);
        }
        catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Driver Tidak Ditemukan", "DATA PEMESANAN TIKET", JOptionPane.ERROR_MESSAGE);
        }
        tabel = new JTable(data,kolom);
        scroll = new JScrollPane(tabel);
        
        setLayout(null);
        add(scroll);
        add(judul);
        add(bback);
        add(lbg);
        pack();
        
        judul.setBounds(180,30,600,30);
        scroll.setBounds(15, 80, 860, 350);
        bback.setBounds(30, 10, 50, 50);
        lbg.setBounds(0, 0, 900, 500);
        setSize(900,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
        
        bback.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()==bback)
                {
                    dispose();
                   GUIform d = new GUIform();
                   d.setVisible(true);
                }
            }
        });
    }
    public static void main(String[] args) {
        new tampil();
    }
}
