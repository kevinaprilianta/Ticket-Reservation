package TIKET;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class menu {
    public static void main(String[] args) {
        utama a = new utama();
    }
}

    class utama extends JFrame {
        Icon prameks = new ImageIcon("C:\\Users\\A S U S\\Pictures\\PROJECT PBO\\Prameks.png");
        JLabel gambar = new JLabel(prameks);
        //JLabel judul = new JLabel("Selamat");
        //JLabel judul2 = new JLabel("Datang!");
        JLabel judul3 = new JLabel("RESERVASI TIKET KERETA API");
        JLabel lbook = new JLabel("Pemesanan Tiket");
        JLabel ljadwal = new JLabel("Jadwal Kereta Api");
        JLabel lout = new JLabel("Keluar");
        JLabel ledit = new JLabel("Edit Pesanan");
        JLabel llihat = new JLabel("Lihat Data Pemesanan");
        Icon blkg = new ImageIcon("C:\\Users\\A S U S\\Pictures\\PROJECT PBO\\KAI2.png");
        JLabel background = new JLabel(blkg);
        Icon iconbook = new ImageIcon("C:\\Users\\A S U S\\Pictures\\PROJECT PBO\\listtambah.png");
        JButton book = new JButton(iconbook);
        Icon iconjadwal = new ImageIcon("C:\\Users\\A S U S\\Pictures\\PROJECT PBO\\calendar.png");
        JButton jadwal = new JButton(iconjadwal);
        Icon iconout = new ImageIcon("C:\\Users\\A S U S\\Pictures\\PROJECT PBO\\power-off.png");
        JButton out = new JButton(iconout);
        Icon iconedit = new ImageIcon("C:\\Users\\A S U S\\Pictures\\PROJECT PBO\\eraser.png");
        JButton edit = new JButton(iconedit);
        Icon iconlihat = new ImageIcon("C:\\Users\\A S U S\\Pictures\\PROJECT PBO\\list.png");
        JButton lihat = new JButton(iconlihat);
        Icon bg = new ImageIcon("C:\\Users\\A S U S\\Pictures\\PROJECT PBO\\loginback2.png");
        JLabel lbg = new JLabel(bg);
        
    public utama() {
        setSize(600,400);
        setTitle("CUSTOMER");
        setResizable(false);
        setLocationRelativeTo(this);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //judul.setFont(new Font ("Imprint MT Shadow",1,28));
        //judul2.setFont(new Font ("Imprint MT Shadow",1,28));
        judul3.setFont(new Font ("Arial",1,16));
        lbook.setFont(new Font ("Cambria",1,16));
        ljadwal.setFont(new Font ("Cambria",1,16));
        lout.setFont(new Font ("Cambria",1,16));
        ledit.setFont(new Font ("Cambria",1,16));
        llihat.setFont(new Font ("Cambria",1,16));
        
        setLayout(null);
        add(gambar);
        //add(judul);
        //add(judul2);
        add(judul3);
        add(book);
        add(lbook);
        add(jadwal);
        add(ljadwal);
        add(out);
        add(lout);
        add(edit);
        add(ledit);
        add(lihat);
        add(llihat);
        add(background);
        add(lbg);
        gambar.setBounds(10, 10, 300, 142);
        //judul.setBounds(350, 10, 200, 100);
        //judul2.setBounds(350, 50, 150, 100);
        judul3.setBounds(310, 90, 400, 80);
        book.setBounds(50,200,40,40);
        lbook.setBounds(110,200,200,40);
        jadwal.setBounds(50, 250, 40, 40);
        ljadwal.setBounds(110,250,200,40);
        out.setBounds(330, 250, 40, 40);
        lout.setBounds(390,250,100,40);
        edit.setBounds(330,200,40,40);
        ledit.setBounds(390,200,150,40);
        background.setBounds(290, 30, 317, 100);
        lihat.setBounds(50, 300, 40, 40);
        llihat.setBounds(110, 300, 200, 40);
        lbg.setBounds(0, 0, 600, 400);
        setVisible(true);
        
        book.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()==book)
               {
                   dispose();
                   GUIform b = new GUIform();
                   b.setVisible(true);
               }
    }
    });
        
        jadwal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()==jadwal)
               {
                   dispose();
                   cekjadwal b = new cekjadwal();
                   b.setVisible(true);
               }
    }
    });
        out.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()==out)
               {
                   int pilih = JOptionPane.showConfirmDialog(null, "Apakah Anda Yakin Ingin Keluar?", "CONFIRM", JOptionPane.YES_NO_OPTION);
                    if (pilih==JOptionPane.YES_OPTION)    
                    {  dispose();
                       objeklogin b = new objeklogin();
                   b.setVisible(true);
                    }
               }
    }
    });
        edit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()==edit)
                {
                    dispose();
                    JOptionPane.showMessageDialog(null,"EDIT PEMESANAN HANYA BERLAKU UNTUK NAMA PEMESAN YANG SAMA","WARNING!",JOptionPane.WARNING_MESSAGE);
                    cari g = new cari();
                    g.setVisible(true);
                }
            }
        });
        
        lihat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()==lihat)
                {
                    dispose();
                    tampil g = new tampil();
                    g.setVisible(true);
                }
            }
        });
        
    }
}