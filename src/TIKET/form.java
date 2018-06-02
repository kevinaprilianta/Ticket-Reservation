package TIKET;
import static TIKET.harga.hargatiket;
import static TIKET.harga.hargatiket2;
import static TIKET.harga.hargatiket3;
import static TIKET.harga.hargatiket4;
import static TIKET.harga.hargatiket5;
import com.toedter.calendar.JDateChooser;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;
import java.sql.*;
import java.text.SimpleDateFormat;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
public class form {
    public static void main(String[] args) {
        GUIform b = new GUIform();
    }
}

class GUIform extends JFrame implements harga {
    Icon ka = new ImageIcon("C:\\Users\\A S U S\\Pictures\\PROJECT PBO\\KAI.png");
    JLabel gambar = new JLabel(ka);
    JLabel nama = new JLabel("Nama Lengkap");
    JLabel kereta = new JLabel("Nama Kereta");
    JLabel dari = new JLabel("Dari");
    JLabel jurusan = new JLabel("Tujuan");
    JLabel waktu = new JLabel("Waktu");
    JLabel metode = new JLabel("Pembayaran ");
    JLabel harga = new JLabel("Harga Tiap Tiket");
    JLabel beli = new JLabel("Jumlah Beli");
    JLabel total = new JLabel("Total Harga");
    JLabel l1 = new JLabel("CEK HARGA");
    JLabel l2 = new JLabel("PESAN");
    JLabel l3 = new JLabel("RESET");
    JLabel l4 = new JLabel("KEMBALI");
    JLabel l5 = new JLabel("BATAL");
    String dr=null;
    String ke=null;
    String metodebyr=null;
    String[] namakereta = {"                - Pilih Kereta -","PRAMEKS","JOGLOKERTO","SRIWEDARI"};
    JComboBox cmbkereta = new JComboBox(namakereta);
    JComboBox cmbjam = new JComboBox();
    JComboBox cmbjam2 = new JComboBox();
    JComboBox cmbjam3 = new JComboBox();
    JDateChooser pilihtgl = new JDateChooser();
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
    
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
    JButton btncek = new JButton();
    JButton btnbook = new JButton();
    JButton btnclear = new JButton();
    JPanel form = new JPanel(null);
    JButton bback = new JButton();
    JButton bcancel = new JButton();
    
    String DBurl = "jdbc:mysql://localhost/project";
    String DBusername = "root";
    String DBpassword = "";
    Connection koneksi;
    Statement statement;
    public GUIform() {
        setTitle("FORM RESERVASI");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800,700);
        setLocationRelativeTo(this);
        setResizable(false);
        btncek = new JButton(new ImageIcon(getClass().getResource(("price-tag.png"))));
        btnbook = new JButton(new ImageIcon(getClass().getResource(("checked.png"))));
        btnclear = new JButton(new ImageIcon(getClass().getResource(("refresh.png"))));
        bback = new JButton(new ImageIcon(getClass().getResource(("back.png"))));
        bcancel = new JButton(new ImageIcon(getClass().getResource(("error.png"))));
        
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
        form.add(cmbjam);
        form.add(cmbjam2);
        form.add(cmbjam3);
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
        form.add(l1);
        form.add(l2);
        form.add(l3);
        form.add(l4);
        form.add(l5);
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
        btncek.setBounds(240, 350, 50, 50);
        l1.setBounds(230, 405, 80, 25);
        btnbook.setBounds(365, 350, 50, 50);
        l2.setBounds(368, 405, 50, 25);
        btnclear.setBounds(490, 350, 50, 50);
        l3.setBounds(496, 405, 80, 25);
        bback.setBounds(30, 0, 50, 50);
        l4.setBounds(25, 55, 80, 25);
        bcancel.setBounds(700, 0, 50, 50);
        l5.setBounds(700, 55, 80, 25);
        ltotal.setEditable(false);
        cbsoc.setVisible(true);
        cbjog.setVisible(true);
        cbkut.setVisible(true);
        soc.setVisible(true);
        jog.setVisible(true);
        kut.setVisible(true);
        cbpur.setVisible(true);
        pur.setVisible(true);
        setVisible(true);
        cmbkereta.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent a) {
                if(a.getStateChange() == ItemEvent.SELECTED)
                {
                    if (cmbkereta.getSelectedIndex()==0)
                    {
                        cbsoc.setBounds(340, 70, 60, 25);
                        cbjog.setBounds(450, 70, 120, 25);
                        cbkut.setBounds(340, 95, 90, 25);
                        soc.setBounds(340, 125, 57, 25);
                        jog.setBounds(340, 150, 108, 25);
                        kut.setBounds(450, 150, 90, 25);
                        cbsoc.setVisible(true);
                        cbjog.setVisible(true);
                        cbkut.setVisible(true);
                        soc.setVisible(true);
                        jog.setVisible(true);
                        kut.setVisible(true);
                        cbpur.setVisible(true);
                        pur.setVisible(true);
                    }
                    else if(cmbkereta.getSelectedIndex()==1)
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
                        cmbjam2.setBounds(480,182, 75, 25);
                        joglokerto();
                        soc.setBounds(340, 125, 57, 25);
                        pur.setBounds(450, 125, 120, 25);
                        jog.setBounds(340, 150, 108, 25);
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
                if (cmbkereta.getSelectedItem()!=null && tfnama.getText().hashCode()!=0 && tfbeli.getText()!="" &&
                        pilihtgl.getDateFormatString()!="" && grup.getSelection()!=null
                        && grup2.getSelection()!=null && grup3.getSelection()!=null)
                {
                pindah();}
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
                if (cmbkereta.getSelectedIndex()==1 && tfnama.getText().hashCode()!=0 && tfbeli.getText()!="" &&
                        pilihtgl.getDateFormatString()!="" && grup.getSelection()!=null
                        && grup2.getSelection()!=null && grup3.getSelection()!=null)
                {
                   pindah();
                   masukkanData();
                }
                else if (cmbkereta.getSelectedIndex()==2 && tfnama.getText().hashCode()!=0
                        && tfbeli.getText()!="" && pilihtgl.getDateFormatString()!="" && grup.getSelection()!=null
                        && grup2.getSelection()!=null && grup3.getSelection()!=null)
                {
                   pindah();
                   masukkanData2();
                }
                else if (cmbkereta.getSelectedIndex()==3 && tfnama.getText().hashCode()!=0 
                        && tfbeli.getText()!="" && pilihtgl.getDateFormatString()!="" && grup.getSelection()!=null
                        && grup2.getSelection()!=null && grup3.getSelection()!=null)
                {
                   pindah();
                   masukkanData3();
                }
            
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
       
    }

    
    public void masukkanData() {
              try {
                  String tanggal = null;
                  if (pilihtgl.getDate()!=null)
                     {
                         tanggal = simpleDateFormat.format(pilihtgl.getDate());
                    }  
                  Class.forName("com.mysql.jdbc.Driver");
                    koneksi=DriverManager.getConnection(DBurl, DBusername, DBpassword);
                    statement = koneksi.createStatement();
                    statement.executeUpdate("insert into customer values('"+ tfnama.getText() + "','" + 
                        cmbkereta.getSelectedItem()+ "','" + dr + "','" + ke + "','" + tanggal + "','" + cmbjam.getSelectedItem() +
                            "','"+ Integer.parseInt(tfbeli.getText())  + "','" + metodebyr + "','" + 
                            ltotal.getText() + "');");
                    JOptionPane.showMessageDialog(null, "Pemesanan Berhasil! Terima Kasih!","HASIL",JOptionPane.INFORMATION_MESSAGE);
                    statement.close();
                    koneksi.close();
                }   catch (SQLException ex) {
                    System.out.println(ex.getMessage());
                    JOptionPane.showMessageDialog(null, "Data Gagal Disimpan!","HASIL",JOptionPane.ERROR_MESSAGE);
                }   catch (ClassNotFoundException ex) {
                    JOptionPane.showMessageDialog(null, "Driver Tidak Ditemukan!","HASIL",JOptionPane.ERROR_MESSAGE);
                }
                tampil ff = new tampil();
                   ff.setVisible(true);
                   dispose();
    }
    
    public void masukkanData2() {
               try {
                   String tanggal = null;
                  if (pilihtgl.getDate()!=null)
                     {
                         tanggal = simpleDateFormat.format(pilihtgl.getDate());
                    }   
                   Class.forName("com.mysql.jdbc.Driver");
                    koneksi=DriverManager.getConnection(DBurl, DBusername, DBpassword);
                    statement = koneksi.createStatement();
                    statement.executeUpdate("insert into customer values('"+ tfnama.getText() + "','" + 
                        cmbkereta.getSelectedItem()+ "','" + dr + "','" + ke + "','" + tanggal + "','" + cmbjam2.getSelectedItem() +
                            "','"+ Integer.parseInt(tfbeli.getText())  + "','" + metodebyr + "','" + 
                            ltotal.getText() + "');");
                    JOptionPane.showMessageDialog(null, "Pemesanan Berhasil! Terima Kasih","HASIL",JOptionPane.INFORMATION_MESSAGE);
                    statement.close();
                    koneksi.close();
                }   catch (SQLException ex) {
                    System.out.println(ex.getMessage());
                    JOptionPane.showMessageDialog(null, "Data Gagal Disimpan!","HASIL",JOptionPane.ERROR_MESSAGE);
                }   catch (ClassNotFoundException ex) {
                    JOptionPane.showMessageDialog(null, "Driver Tidak Ditemukan!","HASIL",JOptionPane.ERROR_MESSAGE);
                }
                tampil ff = new tampil();
                   ff.setVisible(true);
                   dispose();
    }
    
    public void masukkanData3() {
               try {
                   String tanggal = null;
                  if (pilihtgl.getDate()!=null)
                     {
                         tanggal = simpleDateFormat.format(pilihtgl.getDate());
                    }   
                   Class.forName("com.mysql.jdbc.Driver");
                    koneksi=DriverManager.getConnection(DBurl, DBusername, DBpassword);
                    statement = koneksi.createStatement();
                    statement.executeUpdate("insert into customer values('"+ tfnama.getText() + "','" + 
                        cmbkereta.getSelectedItem()+ "','" + dr + "','" + ke + "','" + tanggal + "','" + cmbjam3.getSelectedItem() +
                            "','"+ Integer.parseInt(tfbeli.getText())  + "','" + metodebyr + "','" + 
                            ltotal.getText() + "');");
                    JOptionPane.showMessageDialog(null, "Pemesanan Berhasil! Terima Kasih","HASIL",JOptionPane.INFORMATION_MESSAGE);
                    statement.close();
                    koneksi.close();
                }   catch (SQLException ex) {
                    System.out.println(ex.getMessage());
                    JOptionPane.showMessageDialog(null, "Data Gagal Disimpan!","HASIL",JOptionPane.ERROR_MESSAGE);
                }   catch (ClassNotFoundException ex) {
                    JOptionPane.showMessageDialog(null, "Driver Tidak Ditemukan!","HASIL",JOptionPane.ERROR_MESSAGE);
                }
                tampil ff = new tampil();
                   ff.setVisible(true);
                   dispose();
    }
    
    public void prameks() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
                    koneksi=DriverManager.getConnection(DBurl, DBusername, DBpassword);
                    statement = koneksi.createStatement();
                    String sql = "select * from jadwal_prameks";
                    ResultSet rs=statement.executeQuery(sql);
              while (rs.next()){
                cmbjam.addItem(rs.getString("solobalapan"));         
                  }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Aktifkan XAMPP!");
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
                cmbjam2.addItem(rs.getString("joglokerto"));
         
                  }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Aktifkan XAMPP!");
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
                cmbjam3.addItem(rs.getString("sriwedari"));         
                  }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Aktifkan XAMPP!");
        }
     }
    
    public void pindah() {
        int hrg=0,totalbyr=0;
        String hargatkt=null;
        int jbeli = Integer.parseInt(tfbeli.getText());
        if (tfbeli.getText()=="")
        {
            jbeli=0;
        }
               if (cmbkereta.getSelectedIndex()==1)
                {                     
                       if ((cbsoc.isSelected() && jog.isSelected()) || (cbjog.isSelected() && soc.isSelected()) || (cbjog.isSelected() && kut.isSelected()) || (cbkut.isSelected() && jog.isSelected()))
                       {    lharga.setText("Rp "+hargatiket);
                            hrg=hrg1;
                       }
                       else if ((cbsoc.isSelected() && kut.isSelected()) || (cbkut.isSelected() && soc.isSelected()))
                       {    lharga.setText("Rp "+hargatiket2);
                            hrg=hrg2;
                       }
                }
                if (cmbkereta.getSelectedIndex()==2)
                {
                       if ((cbsoc.isSelected() && jog.isSelected()) || (cbjog.isSelected() && soc.isSelected()))
                       {    lharga.setText("Rp "+hargatiket3);
                            hrg=hrg3;
                       }
                       else if ((cbsoc.isSelected() && pur.isSelected()) || (cbpur.isSelected() && soc.isSelected()))
                       {
                            lharga.setText("Rp "+hargatiket5);
                            hrg=hrg5;
                       }
                       else if ((cbjog.isSelected() && pur.isSelected()) || (cbpur.isSelected() && jog.isSelected()))
                       {
                            lharga.setText("Rp "+hargatiket4);
                            hrg=hrg4;
                       }
            }
            if (cmbkereta.getSelectedIndex()==3)
            {
                       if ((cbsoc.isSelected() && jog.isSelected()) || (cbjog.isSelected() && soc.isSelected()))
                       {    lharga.setText("Rp "+hargatiket3);
                            hrg=hrg3;
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
}


