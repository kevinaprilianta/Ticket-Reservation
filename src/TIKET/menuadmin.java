package TIKET;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
public class menuadmin {
    public static void main(String[] args) {
        admin h = new admin();
    }
}

class admin extends JFrame {
        Icon prameks = new ImageIcon("C:\\Users\\A S U S\\Pictures\\PROJECT PBO\\Prameks.png");
        JLabel gambar = new JLabel(prameks);
        //JLabel judul = new JLabel("SELAMAT");
        //JLabel judul2 = new JLabel("DATANG!");
        JLabel judul3 = new JLabel("RESERVASI TIKET KERETA API");
        JLabel lbook = new JLabel("INPUT JADWAL PRAMEKS");
        JLabel ljadwal = new JLabel("INPUT JADWAL JOGLOKERTO");
        JLabel lout = new JLabel("KELUAR");
        JLabel llihat = new JLabel("INPUT JADWAL SRIWEDARI");
        JLabel ledit = new JLabel("LIHAT DATA PEMESANAN");
        Icon blkg = new ImageIcon("C:\\Users\\A S U S\\Pictures\\PROJECT PBO\\KAI2.png");
        JLabel background = new JLabel(blkg);
        Icon iconbook = new ImageIcon("C:\\Users\\A S U S\\Pictures\\PROJECT PBO\\listtambah.png");
        JButton book = new JButton(iconbook);
        Icon iconjadwal = new ImageIcon("C:\\Users\\A S U S\\Pictures\\PROJECT PBO\\listtambah.png");
        JButton jadwal = new JButton(iconjadwal);
        Icon iconout = new ImageIcon("C:\\Users\\A S U S\\Pictures\\PROJECT PBO\\power-off.png");
        JButton out = new JButton(iconout);
        Icon iconedit = new ImageIcon("C:\\Users\\A S U S\\Pictures\\PROJECT PBO\\listtambah.png");
        JButton edit = new JButton(iconedit);
        Icon iconlihat = new ImageIcon("C:\\Users\\A S U S\\Pictures\\PROJECT PBO\\listtambah.png");
        JButton lihat = new JButton(iconlihat);
        Icon bg = new ImageIcon("C:\\Users\\A S U S\\Pictures\\PROJECT PBO\\loginback2.png");
        JLabel lbg = new JLabel(bg);
    public admin () {
        setSize(600,400);
        setTitle("ADMINISTRATOR");
        setResizable(false);
        setLocationRelativeTo(this);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //judul.setFont(new Font ("Imprint MT Shadow",1,28));
        //judul2.setFont(new Font ("Imprint MT Shadow",1,28));
        judul3.setFont(new Font ("Arial",1,16));
        lbook.setFont(new Font ("Cambria",1,14));
        ljadwal.setFont(new Font ("Cambria",1,14));
        lout.setFont(new Font ("Cambria",1,16));
        ledit.setFont(new Font ("Cambria",1,14));
        llihat.setFont(new Font ("Cambria",1,14));
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
        judul3.setBounds(310, 80, 400, 80);
        book.setBounds(50,200,40,40);
        lbook.setBounds(110,200,200,40);
        jadwal.setBounds(50, 250, 40, 40);
        ljadwal.setBounds(110,250,200,40);
        lihat.setBounds(50, 300, 40, 40);
        llihat.setBounds(110, 300, 200, 40);
        out.setBounds(330, 250, 40, 40);
        lout.setBounds(390,250,100,40);
        edit.setBounds(330,200,40,40);
        ledit.setBounds(390,200,200,40);
        background.setBounds(290, 10, 317, 100);
        lbg.setBounds(0, 0, 600, 400);
        setVisible(true);
        
        book.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()==book)
               {
                   dispose();
                   input hh = new input();
                   hh.setVisible(true);
               }
    }
    });
        
        jadwal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()==jadwal)
               {
                   dispose();
                   input2 hh2 = new input2();
                   hh2.setVisible(true);
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
        lihat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()==lihat)
                {
                    dispose();
                    input3 hh = new input3();
                   hh.setVisible(true);
                }
            }
        });
        
        edit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()==edit)
                {
                    dispose();
                    tampilanadmin hh = new tampilanadmin();
                   hh.setVisible(true);
                }
            }
        });
        
    }
}