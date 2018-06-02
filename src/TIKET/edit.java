
package TIKET;

import com.toedter.calendar.JDateChooser;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.security.interfaces.ECKey;
import java.util.Date;
import java.text.*;
import java.sql.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
public class edit {
    public static void main(String[] args) {
        GUIedit h = new GUIedit();
    }
}
class GUIedit extends JFrame implements harga {
    Icon ka = new ImageIcon("C:\\Users\\A S U S\\Pictures\\PROJECT PBO\\KAI.png");
    JLabel gambar = new JLabel(ka);
    JLabel nama = new JLabel("NAMA LENGKAP");
    JLabel kereta = new JLabel("NAMA KERETA");
    JLabel dari = new JLabel("DARI");
    JLabel jurusan = new JLabel("TUJUAN");
    JLabel waktu = new JLabel("WAKTU");
    JLabel metode = new JLabel("PEMBAYARAN     : ");
    JLabel harga = new JLabel("HARGA 1 TIKET  :");
    JLabel beli = new JLabel("JUMLAH BELI");
    JLabel total = new JLabel("TOTAL BAYAR     :");
    JLabel l1 = new JLabel("CEK HARGA");
    JLabel l2 = new JLabel("PERBAHARUI");
    JLabel l3 = new JLabel("RESET");
    JLabel l4 = new JLabel("KEMBALI");
    JLabel l5 = new JLabel("BATAL");
    JLabel lhapus = new JLabel("HAPUS PESANAN");
        
    String dr=null;
    String ke=null;
    String metodebyr=null;
    String[] namakereta = {"                - PILIH KERETA -","PRAMEKS","JOGLOKERTO","SRIWEDARI"};
    JComboBox cmbkereta = new JComboBox(namakereta);
    JComboBox cmbjam = new JComboBox();
    JComboBox cmbjam2 = new JComboBox();
    JComboBox cmbjam3 = new JComboBox();
    JDateChooser pilihtgl = new JDateChooser();
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
    
    JTextField tfnama = new JTextField();
    JCheckBox cbsoc = new JCheckBox("SOLO");
    JCheckBox cbjog = new JCheckBox("YOGYAKARTA");
    JCheckBox cbpur = new JCheckBox("PURWOKERTO");
    JCheckBox cbkut = new JCheckBox("KUTOARJO");
    JRadioButton soc = new JRadioButton("SOLO");
    JRadioButton jog = new JRadioButton("YOGYAKARTA");
    JRadioButton pur = new JRadioButton("PURWOKERTO");
    JRadioButton kut = new JRadioButton("KUTOARJO");
    JRadioButton cash = new JRadioButton("TUNAI");
    JRadioButton credit = new JRadioButton("KARTU KREDIT");
    JLabel lharga = new JLabel();
    JTextField jam = new JTextField();
    JTextField ltotal = new JTextField();
    JTextField tfbeli = new JTextField();
    Icon cek = new ImageIcon("C:\\Users\\A S U S\\Pictures\\PROJECT PBO\\price-tag.png");
    JButton btncek = new JButton(cek);
    Icon book = new ImageIcon("C:\\Users\\A S U S\\Pictures\\PROJECT PBO\\checked.png");
    JButton btnbook = new JButton(book);
    Icon clear = new ImageIcon("C:\\Users\\A S U S\\Pictures\\PROJECT PBO\\refresh.png");
    JButton btnclear = new JButton(clear);
    JPanel form = new JPanel(null);
    Icon back = new ImageIcon("C:\\Users\\A S U S\\Pictures\\PROJECT PBO\\back.png");
    JButton bback = new JButton(back);
    Icon cancel = new ImageIcon("C:\\Users\\A S U S\\Pictures\\PROJECT PBO\\error.png");
    JButton bcancel = new JButton(cancel);
    Icon iconhapus = new ImageIcon("C:\\Users\\A S U S\\Pictures\\PROJECT PBO\\file.png");
    JButton hapus = new JButton(iconhapus);
    
    String DBurl = "jdbc:mysql://localhost/project";
    String DBusername = "root";
    String DBpassword = "";
    Connection koneksi;
    Statement statement;
    public GUIedit() {
        setTitle("FORM EDIT RESERVASI");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800,700);
        setLocationRelativeTo(this);
        setResizable(false);
        
        nama.setFont(new Font ("Cambria",1,14));
        kereta.setFont(new Font ("Cambria",1,14));
        dari.setFont(new Font ("Cambria",1,14));
        jurusan.setFont(new Font ("Cambria",1,14));
        waktu.setFont(new Font ("Cambria",1,14));
        metode.setFont(new Font ("Cambria",1,14));
        beli.setFont(new Font ("Cambria",1,14));
        total.setFont(new Font ("Cambria",1,14));
        ltotal.setFont(new Font ("Cambria",1,14));
        harga.setFont(new Font ("Cambria",1,14));
        lharga.setFont(new Font ("Cambria",1,14));
        l1.setFont(new Font ("Cambria",1,14));
        l2.setFont(new Font ("Cambria",1,14));
        l3.setFont(new Font ("Cambria",1,14));
        l4.setFont(new Font ("Cambria",1,14));
        l5.setFont(new Font ("Cambria",1,14));        
        lhapus.setFont(new Font ("Cambria",1,14));        
        cash.setFont(new Font ("Cambria",1,13));
        credit.setFont(new Font ("Cambria",1,13));
        cbsoc.setFont(new Font ("Cambria",1,13));
        cbjog.setFont(new Font ("Cambria",1,13));
        cbpur.setFont(new Font ("Cambria",1,13));
        cbkut.setFont(new Font ("Cambria",1,13));
        soc.setFont(new Font ("Cambria",1,13));
        jog.setFont(new Font ("Cambria",1,13));
        pur.setFont(new Font ("Cambria",1,13));
        kut.setFont(new Font ("Cambria",1,13));
                      
        setLayout(new BorderLayout());
        add(gambar,BorderLayout.NORTH);
        ButtonGroup grup = new ButtonGroup();
        grup.add(soc);
        grup.add(jog);
        grup.add(pur);
        grup.add(kut);
        ButtonGroup grup2 = new ButtonGroup();
        grup2.add(cbsoc);
        grup2.add(cbjog);
        grup2.add(cbpur);
        grup2.add(cbkut);
        ButtonGroup grup3 = new ButtonGroup();
        grup3.add(cash);
        grup3.add(credit);
        add(form,BorderLayout.CENTER);
        form.add(nama);
        form.add(kereta);
        form.add(jurusan);
        form.add(waktu);
        form.add(pilihtgl);
        form.add(cmbjam);
        form.add(cmbjam2);
        form.add(cmbjam3);
        form.add(beli);
        form.add(total);
        form.add(cmbkereta);
        form.add(dari);
        form.add(cbsoc);
        form.add(cbjog);
        form.add(cbpur);
        form.add(cbkut);
        form.add(soc);
        form.add(jog);
        form.add(pur);
        form.add(kut);
        form.add(tfnama);
        form.add(tfbeli);
        form.add(metode);
        form.add(cash);
        form.add(credit);
        form.add(harga);
        form.add(lharga);
        form.add(ltotal);
        form.add(btncek);
        form.add(btnbook);
        form.add(btnclear);
        form.add(bcancel);
        form.add(bback);
        form.add(hapus);
        form.add(l1);
        form.add(l2);
        form.add(l3);
        form.add(l4);
        form.add(l5);
        form.add(lhapus);
        tfbeli.setToolTipText("Jumlah Tiket Kereta yang dibeli");
        ltotal.setToolTipText("Total Harga Tiket");
        
        nama.setBounds(220, 12, 120, 25);
        tfnama.setBounds(340,10,220,25);
        kereta.setBounds(220, 42, 120, 25);
        cmbkereta.setBounds(340, 40, 220, 25);
        dari.setBounds(220,72,100,25);
        jurusan.setBounds(220, 127, 100, 25);
        waktu.setBounds(220, 182, 220, 25);
        pilihtgl.setBounds(340, 182, 120, 25);
        beli.setBounds(220, 212, 120, 25);
        tfbeli.setBounds(340, 212, 50, 25);
        metode.setBounds(220, 242, 220,25);
        cash.setBounds(340, 242, 80, 25);
        credit.setBounds(450, 242, 120, 25);
        harga.setBounds(220, 272, 120, 25);
        lharga.setBounds(340, 272, 200, 25);
        total.setBounds(220, 304, 120, 25);
        ltotal.setBounds(340, 304, 120, 25);
        btncek.setBounds(180, 350, 50, 50);
        l1.setBounds(170, 405, 80, 25);
        btnbook.setBounds(305, 350, 50, 50);
        l2.setBounds(288, 405, 100, 25);
        btnclear.setBounds(555, 350, 50, 50);
        l3.setBounds(560, 405, 80, 25);
        bback.setBounds(30, 0, 50, 50);
        l4.setBounds(25, 55, 80, 25);
        bcancel.setBounds(700, 0, 50, 50);
        l5.setBounds(700, 55, 80, 25);
        hapus.setBounds(430,350,50,50);
        lhapus.setBounds(400,405,120,25);
        ltotal.setEditable(false);
        setVisible(true);
        tfnama.setEditable(false);
                
        cmbkereta.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent a) {
                if(a.getStateChange() == ItemEvent.SELECTED)
                {
                    if(cmbkereta.getSelectedIndex()==1)
                    {
                        cbsoc.setBounds(340, 70, 60, 25);
                        cbjog.setBounds(450, 70, 120, 25);
                        cbkut.setBounds(340, 95, 90, 25);
                        soc.setBounds(340, 125, 57, 25);
                        jog.setBounds(340, 150, 108, 25);
                        kut.setBounds(450, 150, 90, 25);
                        cmbjam.setBounds(480,182, 75, 25);
                        prameks();
                        cmbjam.setVisible(true);
                        cmbjam2.setVisible(false);
                        cmbjam3.setVisible(false);
                        cbsoc.setVisible(true);
                        cbjog.setVisible(true);
                        cbkut.setVisible(true);
                        soc.setVisible(true);
                        jog.setVisible(true);
                        kut.setVisible(true);
                        cbpur.setVisible(false);
                        pur.setVisible(false);
                        
                    }
                    else if (cmbkereta.getSelectedIndex()==2)
                    {   cbsoc.setBounds(340, 70, 60, 25);
                        cbjog.setBounds(450, 70, 120, 25);
                        cbpur.setBounds(450, 95, 120, 25);
                        
                        soc.setBounds(340, 125, 57, 25);
                        pur.setBounds(450, 125, 120, 25);
                        jog.setBounds(340, 150, 108, 25);
                        cmbjam2.setBounds(480,182, 75, 25);
                        joglokerto();
                        cmbjam2.setVisible(true);
                        cmbjam.setVisible(false);
                        cmbjam3.setVisible(false);
                        cbsoc.setVisible(true);
                        cbjog.setVisible(true);
                        cbpur.setVisible(true);
                        soc.setVisible(true);
                        pur.setVisible(true);
                        jog.setVisible(true);
                        
                        cbkut.setVisible(false);
                        kut.setVisible(false);
                    }
                    else if (cmbkereta.getSelectedIndex()==3)
                    {
                        cbsoc.setBounds(340, 70, 60, 25);
                        cbjog.setBounds(450, 70, 120, 25);
                        soc.setBounds(340, 125, 57, 25);
                        jog.setBounds(340, 150, 108, 25);
                        cmbjam3.setBounds(480,182, 75, 25);
                        sriwedari();
                        cmbjam.setVisible(false);
                        cmbjam2.setVisible(false);
                        cmbjam3.setVisible(true);
                        cbsoc.setVisible(true);
                        cbjog.setVisible(true);
                        soc.setVisible(true);
                        jog.setVisible(true);
                        cbpur.setVisible(false);
                        cbkut.setVisible(false);
                        pur.setVisible(false);
                        kut.setVisible(false);
                    }
                    if (cmbkereta.getSelectedIndex()==0)
                    {
                        cbsoc.setVisible(false);
                        cbjog.setVisible(false);
                        cbpur.setVisible(false);
                        cbkut.setVisible(false);
                        soc.setVisible(false);
                        jog.setVisible(false);
                        pur.setVisible(false);
                        kut.setVisible(false);
                        cmbjam.setVisible(false);
                        cmbjam2.setVisible(false);
                        cmbjam3.setVisible(false);
                    }
                }
            }
        });
       
       btncek.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int hrg=0,totalbyr=0;
                String hargatkt=null;
               
               if(cmbkereta.getSelectedIndex()==0)
                {
                    JOptionPane.showMessageDialog(null, "Periksa Kembali Pilihan Kereta","ERROR",JOptionPane.ERROR_MESSAGE);
                }
                if (grup3.isSelected(null))
                {
                    JOptionPane.showMessageDialog(null, "Periksa Kembali Pilihan Pembayaran Tiket","ERROR",JOptionPane.ERROR_MESSAGE);
                }
                if (tfnama.getText().equals(""))
                {
                    JOptionPane.showMessageDialog(null, "Isikan Nama Pemesan Tiket","ERROR",JOptionPane.ERROR_MESSAGE);
                }
                if (pilihtgl.getDate()==null)
                {
                    JOptionPane.showMessageDialog(null, "Masukkan Tanggal Pemesanan Tiket","ERROR",JOptionPane.ERROR_MESSAGE);
                }
                if (tfbeli.getText().equals(""))
                {
                    JOptionPane.showMessageDialog(null, "Masukkan Jumlah Pemesanan Tiket","ERROR",JOptionPane.ERROR_MESSAGE);
                }
                if ((cbsoc.isSelected() && soc.isSelected()) || (cbjog.isSelected()&&jog.isSelected()) ||
                          (cbkut.isSelected() && kut.isSelected()) || (cbpur.isSelected() && pur.isSelected())
                        || grup.getSelection()==null || grup2.getSelection()==null)
                {
                    JOptionPane.showMessageDialog(null, "Periksa Kembali pada Pilihan Jurusan Kereta");
                }
               int jbeli = Integer.parseInt(tfbeli.getText());
               if (cmbkereta.getSelectedIndex()==1&& tfnama.getText().hashCode()!=0
                        && tfbeli.getText()!="" && pilihtgl.getDateFormatString()!="" && grup.getSelection()!=null
                        && grup2.getSelection()!=null && grup3.getSelection()!=null)
                {                     
                       if ((cbsoc.isSelected() && jog.isSelected()) || (cbjog.isSelected() && soc.isSelected()) || (cbjog.isSelected() && kut.isSelected()) || (cbkut.isSelected() && jog.isSelected()))
                       {    lharga.setText("Rp "+hargatiket);
                            hrg=8000;
                       }
                       else if ((cbsoc.isSelected() && kut.isSelected()) || (cbkut.isSelected() && soc.isSelected()))
                       {    lharga.setText("Rp "+hargatiket2);
                            hrg=15000;
                       }
                }
                if (cmbkereta.getSelectedIndex()==2&& tfnama.getText().hashCode()!=0
                        && tfbeli.getText()!="" && pilihtgl.getDateFormatString()!="" && grup.getSelection()!=null
                        && grup2.getSelection()!=null && grup3.getSelection()!=null)
                {
                       if ((cbsoc.isSelected() && jog.isSelected()) || (cbjog.isSelected() && soc.isSelected()))
                       {    lharga.setText("Rp "+hargatiket3);
                            hrg=20000;
                       }
                       else if ((cbsoc.isSelected() && pur.isSelected()) || (cbpur.isSelected() && soc.isSelected()))
                       {
                            lharga.setText("Rp "+hargatiket5);
                            hrg=70000;
                       }
                       else if ((cbjog.isSelected() && pur.isSelected()) || (cbpur.isSelected() && jog.isSelected()))
                       {
                            lharga.setText("Rp "+hargatiket4);
                            hrg=60000;
                       }
                }
            if (cmbkereta.getSelectedIndex()==3&& tfnama.getText().hashCode()!=0
                        && tfbeli.getText()!="" && pilihtgl.getDateFormatString()!="" && grup.getSelection()!=null
                        && grup2.getSelection()!=null && grup3.getSelection()!=null)
            {
                       if ((cbsoc.isSelected() && jog.isSelected()) || (cbjog.isSelected() && soc.isSelected()))
                       {    lharga.setText("Rp "+hargatiket3);
                            hrg=20000;
                       }
            }
                   
            if (cbsoc.isSelected())
            {
                dr="SOLO";
            }
            else if (cbjog.isSelected())
            {
                dr="YOGYAKARTA";
            }
            else if (cbkut.isSelected())
            {
                dr="KUTOARJO";
            }
            else if (cbpur.isSelected())
            {
                dr="PURWOKERTO";
            }
            
            if (soc.isSelected())
            {
                ke="SOLO";
            }
            else if (jog.isSelected())
            {
                ke="YOGYAKARTA";
            }
            else if (kut.isSelected())
            {
                ke="KUTOARJO";
            }
            else if (pur.isSelected())
            {
                ke="PURWOKERTO";
            }
            if (cash.isSelected())
            {
                metodebyr="TUNAI";
            }
            else if (credit.isSelected())
            {
                metodebyr="CICILAN";
            }
            
            if (jbeli>=1)
            {    bayar b;
                 b = new bayar (jbeli,hrg);
                 ltotal.setText("Rp " + String.valueOf(b.hitungtotal()));
            }
            else
            {    hargatkt="Rp 0";
                        totalbyr=0; 
                        lharga.setText(hargatkt);
            }
            
            }
           
        });
       btnclear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                   tfnama.setText("");
                   cmbkereta.setSelectedIndex(0);
                   pilihtgl.setCalendar(null);
                   tfbeli.setText("");
                   grup.clearSelection();
                   grup2.clearSelection();
                   grup3.clearSelection();
                   lharga.setText("");
                   ltotal.setText("");
                   cbsoc.setVisible(false);
                   cbjog.setVisible(false);
                   cbpur.setVisible(false);
                   cbkut.setVisible(false);
                   soc.setVisible(false);
                   jog.setVisible(false);
                   pur.setVisible(false);
                   kut.setVisible(false);
                   cmbjam.setVisible(false);
                   cmbjam2.setVisible(false);
                   cmbjam3.setVisible(false);
            }
        });
       btnbook.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(cmbkereta.getSelectedIndex()==0)
                {
                    JOptionPane.showMessageDialog(null, "Periksa kembali pilihan kereta","ERROR",JOptionPane.ERROR_MESSAGE);
                }
                if (grup3.isSelected(null))
                {
                    JOptionPane.showMessageDialog(null, "Periksa kembali pilihan pembayaran tiket","ERROR",JOptionPane.ERROR_MESSAGE);
                }
                if (tfnama.getText().equals(""))
                {
                    JOptionPane.showMessageDialog(null, "Isikan nama pemesan tiket","ERROR",JOptionPane.ERROR_MESSAGE);
                }
                if (pilihtgl.getDate()==null)
                {
                    JOptionPane.showMessageDialog(null, "Masukkan tanggal pemesanan tiket","ERROR",JOptionPane.ERROR_MESSAGE);
                }
                if (tfbeli.getText().equals(""))
                {
                    JOptionPane.showMessageDialog(null, "Masukkan jumlah pesanan tiket","ERROR",JOptionPane.ERROR_MESSAGE);
                }
                if ((cbsoc.isSelected() && soc.isSelected()) || (cbjog.isSelected()&&jog.isSelected()) ||
                          (cbkut.isSelected() && kut.isSelected()) || (cbpur.isSelected() && pur.isSelected())
                        || grup.getSelection()==null || grup2.getSelection()==null)
                {
                    JOptionPane.showMessageDialog(null, "Periksa kembali pada pilihan jurusan kereta");
                }
                else if (cmbkereta.getSelectedIndex()==1 && tfnama.getText().hashCode()!=0 && tfbeli.getText()!="" &&
                        pilihtgl.getDateFormatString()!="" && grup.getSelection()!=null
                        && grup2.getSelection()!=null && grup3.getSelection()!=null)
                {
                  
                   editData();
                }
                else if (cmbkereta.getSelectedIndex()==2 && tfnama.getText().hashCode()!=0 && tfbeli.getText()!="" &&
                        pilihtgl.getDateFormatString()!="" && grup.getSelection()!=null
                        && grup2.getSelection()!=null && grup3.getSelection()!=null)
                {
                  
                   editData2();
                }
                else if (cmbkereta.getSelectedIndex()==3&& tfnama.getText().hashCode()!=0 && tfbeli.getText()!="" &&
                        pilihtgl.getDateFormatString()!="" && grup.getSelection()!=null
                        && grup2.getSelection()!=null && grup3.getSelection()!=null)
                {
                  
                   editData3();
                }
                   tfnama.setText("");
                   cmbkereta.setSelectedIndex(0);
                   pilihtgl.setCalendar(null);
                   tfbeli.setText("");
                   grup3.clearSelection();
                   lharga.setText("");
                   ltotal.setText("");
            
                }
            });
       
       bback.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()==bback)
                {
                   
                   dispose();
                   utama c = new utama();
                   c.setVisible(true);
                }
            }
        });
       bcancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()==bcancel)
                {
                    int pilih = JOptionPane.showConfirmDialog(null, "Yakin ingin keluar?", "KELUAR", JOptionPane.YES_NO_OPTION);
                    if (pilih==JOptionPane.YES_OPTION)    
                    {  dispose();
                       objeklogin d = new objeklogin();
                       d.setVisible(true);
                    }
                }
            }
        });
       hapus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            int pilih = JOptionPane.showConfirmDialog(null, "Hapus pesanan ini?", "KONFIRMASI", JOptionPane.YES_NO_OPTION);
            if (pilih==JOptionPane.YES_OPTION)    
            {
                
                try
                {
                    String query = "Delete from customer where " + "nama='"+tfnama.getText()+"'";
                    Class.forName("com.mysql.jdbc.Driver");
                    koneksi=DriverManager.getConnection(DBurl, DBusername, DBpassword);
                    statement = koneksi.createStatement();    
                    statement.executeUpdate(query);
                    statement.close();
                    koneksi.close();
                    JOptionPane.showMessageDialog(null,"Pesanan telah dihapus","HAPUS",JOptionPane.INFORMATION_MESSAGE);
                }
                catch(ClassNotFoundException eclass)
                {
                   JOptionPane.showMessageDialog(null,"Pesanan tidak ditemukan","Hapus",JOptionPane.INFORMATION_MESSAGE);
                }
                catch(SQLException esql)
                {
                    JOptionPane.showMessageDialog(null,esql.getMessage(),"Driver",JOptionPane.WARNING_MESSAGE);
                }        
                   tfnama.setText("");
                   cmbkereta.setSelectedIndex(0);
                   cbsoc.setSelected(false);
                   cbjog.setSelected(false);
                   cbpur.setSelected(false);
                   cbkut.setSelected(false);
                   soc.setSelected(false);
                   jog.setSelected(false);
                   pur.setSelected(false);
                   kut.setSelected(false);
                   pilihtgl.setCalendar(null);
                   cmbjam.setVisible(false);
                   tfbeli.setText("");
                   grup3.clearSelection();
                   lharga.setText("");
                   ltotal.setText("");
                   tampilanhasiledit ff = new tampilanhasiledit();
                   ff.setVisible(true);
                   dispose();
            }
            }
        });
    }

    
    public void editData() {
        String tanggal = null;
                  if (pilihtgl.getDate()!=null)
                     {
                         tanggal = simpleDateFormat.format(pilihtgl.getDate());
                    }    
                try
                {
                    Class.forName("com.mysql.jdbc.Driver");
                    koneksi=DriverManager.getConnection(DBurl, DBusername, DBpassword);
                    statement = koneksi.createStatement();
                   statement.executeUpdate("Update customer set "+
                 "kereta='"+cmbkereta.getSelectedItem()+"',"+
                 "dari='"+dr+"',"+
                 "tujuan='"+ke+"',"+  
                 "tanggal='"+tanggal+"',"+ 
                 "jam='"+ cmbjam.getSelectedItem() +"',"+
                 "jumlah='"+Integer.parseInt(tfbeli.getText())+"',"+ 
                 "pembayaran='"+metodebyr+"',"+
                 "total='"+ltotal.getText()+"'"+
                 "where nama='"+tfnama.getText()+ "'");
    JOptionPane.showMessageDialog(null,"EDIT PEMESANAN BERHASIL! TERIMA KASIH!","UPDATE",JOptionPane.INFORMATION_MESSAGE);
    statement.close();
                   koneksi.close();
                   tampil ff = new tampil();
                   ff.setVisible(true);
                   dispose();
   }
   catch(ClassNotFoundException ex)
   {
       JOptionPane.showMessageDialog(null,"Driver tidak ada","Driver",JOptionPane.WARNING_MESSAGE);
   }
   catch(SQLException ex)
   {
    JOptionPane.showMessageDialog(null,ex.getMessage(),"ERROR",JOptionPane.WARNING_MESSAGE);
   }
    }
    
    public void editData2() {
        String tanggal = null;
                  if (pilihtgl.getDate()!=null)
                     {
                         tanggal = simpleDateFormat.format(pilihtgl.getDate());
                    }  
                try
                {
                    Class.forName("com.mysql.jdbc.Driver");
                    koneksi=DriverManager.getConnection(DBurl, DBusername, DBpassword);
                    statement = koneksi.createStatement();
                   statement.executeUpdate("Update customer set "+
                 "kereta='"+cmbkereta.getSelectedItem()+"',"+
                 "dari='"+dr+"',"+
                 "tujuan='"+ke+"',"+  
                 "tanggal='"+tanggal+"',"+ 
                 "jam='"+ cmbjam2.getSelectedItem() +"',"+
                 "jumlah='"+Integer.parseInt(tfbeli.getText())+"',"+ 
                 "pembayaran='"+metodebyr+"',"+
                 "total='"+ltotal.getText()+"'"+
                 "where nama='"+tfnama.getText()+ "'");
    JOptionPane.showMessageDialog(null,"EDIT PEMESANAN BERHASIL! TERIMA KASIH!","UPDATE",JOptionPane.INFORMATION_MESSAGE);
    statement.close();
                   koneksi.close();
                   tampil ff = new tampil();
                   ff.setVisible(true);
                   dispose();
   }
   catch(ClassNotFoundException ex)
   {
       JOptionPane.showMessageDialog(null,"Driver tidak ada","Driver",JOptionPane.WARNING_MESSAGE);
   }
   catch(SQLException ex)
   {
    JOptionPane.showMessageDialog(null,ex.getMessage(),"ERROR",JOptionPane.WARNING_MESSAGE);
   }
    }
    
    public void editData3() {
        String tanggal = null;
                  if (pilihtgl.getDate()!=null)
                     {
                         tanggal = simpleDateFormat.format(pilihtgl.getDate());
                    }  
                try
                {
                    Class.forName("com.mysql.jdbc.Driver");
                    koneksi=DriverManager.getConnection(DBurl, DBusername, DBpassword);
                    statement = koneksi.createStatement();
                   statement.executeUpdate("Update customer set "+
                 "kereta='"+cmbkereta.getSelectedItem()+"',"+
                 "dari='"+dr+"',"+
                 "tujuan='"+ke+"',"+  
                 "tanggal='"+tanggal+"',"+ 
                 "jam='"+ cmbjam3.getSelectedItem() +"',"+
                 "jumlah='"+Integer.parseInt(tfbeli.getText())+"',"+ 
                 "pembayaran='"+metodebyr+"',"+
                 "total='"+ltotal.getText()+"'"+
                 "where nama='"+tfnama.getText()+ "'");
    JOptionPane.showMessageDialog(null,"EDIT PEMESANAN BERHASIL! TERIMA KASIH!","UPDATE",JOptionPane.INFORMATION_MESSAGE);
    statement.close();
                   koneksi.close();
                   tampilanhasiledit ff = new tampilanhasiledit();
                   ff.setVisible(true);
                   dispose();
   }
   catch(ClassNotFoundException ex)
   {
       JOptionPane.showMessageDialog(null,"Driver tidak ada","Driver",JOptionPane.WARNING_MESSAGE);
   }
   catch(SQLException ex)
   {
    JOptionPane.showMessageDialog(null,ex.getMessage(),"ERROR",JOptionPane.WARNING_MESSAGE);
   }
    }
    
    public void prameks() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
                    koneksi=DriverManager.getConnection(DBurl, DBusername, DBpassword);
                    statement = koneksi.createStatement();
                    String sql = "select * from jadwal_prameks";
                    ResultSet rs=statement.executeQuery(sql);
              while (rs.next()){
                cmbjam.addItem(rs.getString("solobalapan"));//Untuk menampilkan Data dari dalam Table  di database kedalam ComboBox
         
                  }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Terjadi Kesalahan" +e);
        }
     }
    
    public void joglokerto() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
                    koneksi=DriverManager.getConnection(DBurl, DBusername, DBpassword);
                    statement = koneksi.createStatement();
                    String sql = "select * from jadwal_joglokerto";
                    ResultSet rs=statement.executeQuery(sql);
              while (rs.next()){
                cmbjam2.addItem(rs.getString("joglokerto"));//Untuk menampilkan Data dari dalam Table  di database kedalam ComboBox
         
                  }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Terjadi Kesalahan" +e);
        }
     }
    
    public void sriwedari() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
                    koneksi=DriverManager.getConnection(DBurl, DBusername, DBpassword);
                    statement = koneksi.createStatement();
                    String sql = "select * from jadwal_sriwedari";
                    ResultSet rs=statement.executeQuery(sql);
              while (rs.next()){
                cmbjam3.addItem(rs.getString("sriwedari"));//Untuk menampilkan Data dari dalam Table  di database kedalam ComboBox
         
                  }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Terjadi Kesalahan" +e);
        }
     }
    
}
