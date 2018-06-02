package TIKET;

import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
public class inputjadwal {
    public static void main(String[] args) {
        input m = new input();
    }
}

class input extends JFrame implements ActionListener {
    JLabel lnama = new JLabel (" JAM KERETA ");
    JTextField tfjam = new JTextField();
    JButton bcari = new JButton(" INPUT ");
    JButton Cancelbtn = new JButton(" BATAL ");
    
    String DBurl = "jdbc:mysql://localhost/project";
    String DBusername = "root";
    String DBpassword = "";
    Connection koneksi;
    Statement statement;
    
    public input () {
        setTitle(" JADWAL PRAMEKS ");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize (290,160);
        setResizable(false);
        setLocationRelativeTo(this);
        setLayout(null);
        add(lnama);
        add(tfjam);
        add(bcari);
        bcari.addActionListener(this);
        add(Cancelbtn);
        Cancelbtn.addActionListener(this);
        lnama.setBounds(100, 20, 250, 30);
        tfjam.setBounds(20, 50, 250, 25);
        bcari.setBounds(20, 90, 80, 30);
        Cancelbtn.setBounds(190, 90, 80, 30);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==bcari)
        {   
            try {
                    Class.forName("com.mysql.jdbc.Driver");
                    koneksi=DriverManager.getConnection(DBurl, DBusername, DBpassword);
                    statement = koneksi.createStatement();
                    statement.executeUpdate("insert into jadwal_prameks values('"+ tfjam.getText() + "');");
                    JOptionPane.showMessageDialog(null, "INPUT BERHASIL! DATA TERSIMPAN","HASIL",JOptionPane.INFORMATION_MESSAGE);
                    statement.close();
                    koneksi.close();
                }   catch (SQLException ex) {
                    System.out.println(ex.getMessage());
                    JOptionPane.showMessageDialog(null, "DATA GAGAL DISIMPAN!","HASIL",JOptionPane.ERROR_MESSAGE);
                }   catch (ClassNotFoundException ex) {
                    JOptionPane.showMessageDialog(null, "Driver Tidak Ditemukan!","HASIL",JOptionPane.ERROR_MESSAGE);
                }
        
        }
        if (e.getSource()==Cancelbtn)
        {
            dispose();
            admin i = new admin();
            i.setVisible(true);
        }
    }
}