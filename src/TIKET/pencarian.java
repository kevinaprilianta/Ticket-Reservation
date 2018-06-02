package TIKET;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

public class pencarian {
    public static void main(String[] args) {
        cari f = new cari();
    }    
}

class cari extends JFrame implements ActionListener {
    JLabel lnama = new JLabel (" NAMA PEMESAN");
    JTextField tfcarinama = new JTextField();
    JButton bcari = new JButton(" CARI ");
    JButton Cancelbtn = new JButton(" BATAL ");
    String tanggal;
    String DBurl = "jdbc:mysql://localhost/project";
    String DBusername = "root";
    String DBpassword = "";
    Connection koneksi;
    Statement statement;
    
    public cari() {
        setTitle(" FORM PENCARIAN ");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize (300,160);
        setResizable(false);
        setLocationRelativeTo(this);
        setLayout(null);
        add(lnama);
        add(tfcarinama);
        add(bcari);
        bcari.addActionListener(this);
        add(Cancelbtn);
        Cancelbtn.addActionListener(this);
        lnama.setBounds(100, 20, 120, 30);
        tfcarinama.setBounds(20, 50, 250, 25);
        bcari.setBounds(20, 90, 80, 30);
        Cancelbtn.setBounds(190, 90, 80, 30);
        tampil jj = new tampil();
        jj.setVisible(true);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==bcari)
        {   
            String cari = (tfcarinama.getText());
            String query="Select * from customer where nama='"+cari+"'";
            try
            {
                Class.forName("com.mysql.jdbc.Driver");
                koneksi=DriverManager.getConnection(DBurl, DBusername, DBpassword);
                statement = koneksi.createStatement();
                ResultSet rs = statement.executeQuery(query);
                   if(rs.next())
                   {
                       GUIedit gg = new GUIedit();
                       gg.tfnama.setText(rs.getString("nama"));
                       gg.cmbkereta.setSelectedItem(rs.getString("kereta"));
                       gg.jam.setText(rs.getString("jam"));
                       gg.tfbeli.setText(rs.getString("jumlah"));
                       
                       String dr2 = rs.getString("dari");
                       if (dr2.equals("SOLO"))
                       {
                           gg.cbsoc.setSelected(true);
                       }
                       else if (dr2.equals("YOGYAKARTA"))
                       {
                           gg.cbjog.setSelected(true);
                        }
                       else if (dr2.equals("KUTOARJO"))
                       {
                           gg.cbkut.setSelected(true);
                       }
                       else if (dr2.equals("PURWOKERTO"))
                       {
                           gg.cbpur.setSelected(true);
                       }
                       String ke2 = rs.getString("tujuan");
                       if (ke2.equals("SOLO"))
                       {
                           gg.soc.setSelected(true);
                       }
                       else if (ke2.equals("YOGYAKARTA"))
                       {
                           gg.jog.setSelected(true);
                        }
                       else if (ke2.equals("KUTOARJO"))
                       {
                           gg.kut.setSelected(true);
                       }
                       else if (ke2.equals("PURWOKERTO"))
                       {
                           gg.pur.setSelected(true);
                       }
                       String tgl = rs.getString("tanggal");
                       java.util.Date date = new SimpleDateFormat("yyyy-MM-dd").parse(tgl);
                       gg.pilihtgl.setDate(date);
                       String metode = rs.getString("pembayaran");
                       if (metode.equals("CASH"))
                       {
                           gg.cash.setSelected(true);
                       }
                       else if (metode.equals("CREDIT"))
                       {
                           gg.credit.setSelected(true);
                       }
                       gg.ltotal.setText(rs.getString("total"));
                       tampil jj = new tampil();
                       jj.setVisible(false);
                JOptionPane.showMessageDialog(null,"DATA DITEMUKAN! Silakan Edit Pesanan","Cari",JOptionPane.INFORMATION_MESSAGE);
            }
        else
            {JOptionPane.showMessageDialog(null,"Data tidak ditemukan","Cari",JOptionPane.WARNING_MESSAGE);}
            statement.close();
            koneksi.close();
            
        }
            
   catch(ClassNotFoundException eclass)
   {
       
       JOptionPane.showMessageDialog(null,"Driver tidak ada","Driver",JOptionPane.WARNING_MESSAGE);
   }
   catch(SQLException esql)
   {
    JOptionPane.showMessageDialog(null,esql.getMessage(),"Driver",JOptionPane.WARNING_MESSAGE);
   }        catch (ParseException ex) {        
                Logger.getLogger(cari.class.getName()).log(Level.SEVERE, null, ex);
            }
        dispose();
        }
        if (e.getSource()==Cancelbtn)
        {
            dispose();
            utama i = new utama();
            i.setVisible(true);
        }
    }
}