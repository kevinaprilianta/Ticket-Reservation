package TIKET;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class jadwal {
    public static void main(String[] args) {
        cekjadwal c = new cekjadwal();
    }
}

class cekjadwal extends JFrame {
    JButton prameks = new JButton("Prameks");
    JButton joglo = new JButton("Joglokerto");
    JButton sriwedari = new JButton("Sriwedari");
    JLabel judul = new JLabel("JADWAL KERETA API LOKAL PRAMEKS");
    JLabel judul2 = new JLabel("JADWAL KERETA API LOKAL JOGLOKERTO");
    JLabel judul3 = new JLabel("JADWAL KERETA API LOKAL SRIWEDARI");
    Icon prs = new ImageIcon("C:\\Users\\A S U S\\Pictures\\PROJECT PBO\\solo.png");
    JLabel prsoc = new JLabel(prs);
    Icon prj = new ImageIcon("C:\\Users\\A S U S\\Pictures\\PROJECT PBO\\jogja.png");
    JLabel prjog = new JLabel(prj);
    Icon prk = new ImageIcon("C:\\Users\\A S U S\\Pictures\\PROJECT PBO\\kuto.png");
    JLabel prkut = new JLabel(prk);
    Icon prk2 = new ImageIcon("C:\\Users\\A S U S\\Pictures\\PROJECT PBO\\kuto2.png");
    JLabel prkut2 = new JLabel(prk2);
    
    Icon jop = new ImageIcon("C:\\Users\\A S U S\\Pictures\\PROJECT PBO\\purwokerto.png");
    JLabel jopur = new JLabel(jop);
    Icon jop2 = new ImageIcon("C:\\Users\\A S U S\\Pictures\\PROJECT PBO\\purwokerto2.png");
    JLabel jopur2 = new JLabel(jop2);
    
    Icon srp = new ImageIcon("C:\\Users\\A S U S\\Pictures\\PROJECT PBO\\sriwedari.JPG");
    JLabel sri = new JLabel(srp);
    Icon srp2 = new ImageIcon("C:\\Users\\A S U S\\Pictures\\PROJECT PBO\\sriwedari2.JPG");
    JLabel sri2 = new JLabel(srp2);
    Icon blkg = new ImageIcon("C:\\Users\\A S U S\\Pictures\\PROJECT PBO\\KAI2.png");
    JLabel background = new JLabel(blkg);
    
    Icon back = new ImageIcon("C:\\Users\\A S U S\\Pictures\\PROJECT PBO\\back.png");
    JButton bback = new JButton(back);
    JLabel balik = new JLabel("KEMBALI");
    Icon clear = new ImageIcon("C:\\Users\\A S U S\\Pictures\\PROJECT PBO\\refresh.png");
    JButton btnclear = new JButton(clear);
    JLabel refresh = new JLabel("RESET");
    Icon bg = new ImageIcon("C:\\Users\\A S U S\\Pictures\\PROJECT PBO\\loginback3.png");
    JLabel lbg = new JLabel(bg);
    
    public cekjadwal() {
        setSize(900,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(this);
        judul.setFont(new Font ("Tahoma",0,18));
        judul2.setFont(new Font ("Tahoma",0,18));
        judul3.setFont(new Font ("Tahoma",0,18));
        prameks.setFont(new Font ("Arial",1,16));
        joglo.setFont(new Font ("Arial",1,16));
        sriwedari.setFont(new Font ("Arial",1,16));
        balik.setFont(new Font ("Cambria",1,14)); 
        refresh.setFont(new Font ("Cambria",1,14));
        setLayout(null);
        add(prameks);
        add(joglo);
        add(sriwedari);
        add(judul);
        add(judul2);
        add(judul3);
        add(prsoc);
        add(prjog);
        add(prkut);
        add(prkut2);
        add(jopur);
        add(jopur2);
        add(sri);
        add(sri2);
        add(bback);
        add(btnclear);
        add(refresh);
        add(balik);
        add(background);
        add(lbg);
        prameks.setBounds(160, 20, 150, 50);
        joglo.setBounds(330, 20, 200, 50);
        sriwedari.setBounds(550, 20, 150, 50);
        bback.setBounds(30, 20, 50, 50);
        balik.setBounds(25, 72, 80, 25);
        btnclear.setBounds(800,20,50,50);
        refresh.setBounds(805, 72, 80, 25);
        background.setBounds(0, 0, 900, 500);
        lbg.setBounds(0, 0, 900, 500);
        setVisible(true);
        setTitle("JADWAL KERETA API");
        
        prameks.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()==prameks)
                {
                    judul.setBounds(280, 80, 350, 30);
                    prsoc.setBounds(10, 113, 250, 330);
                    prjog.setBounds(270, 120, 250, 330);
                    prkut.setBounds(530, 140, 350, 145);
                    prkut2.setBounds(530, 280, 350, 146);
                    judul.setVisible(true);
                    prsoc.setVisible(true);
                    prjog.setVisible(true);
                    prkut.setVisible(true);
                    prkut2.setVisible(true);
                    judul2.setVisible(false);
                    jopur.setVisible(false);
                    jopur2.setVisible(false);
                   judul3.setVisible(false);
                    sri.setVisible(false);
                    sri2.setVisible(false);
                }
            }
        });
        
        joglo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()==joglo)
                {
                    judul2.setBounds(250, 80, 400, 30);
                    jopur.setBounds(190, 120, 230, 330);
                    jopur2.setBounds(440, 120, 201, 330);
                    judul2.setVisible(true);
                    jopur.setVisible(true);
                    jopur2.setVisible(true);
                    prkut.setVisible(true);
                    prkut2.setVisible(true);
                    judul.setVisible(false);
                    prsoc.setVisible(false);
                    prjog.setVisible(false);
                    prkut.setVisible(false);
                    prkut2.setVisible(false);
                    judul3.setVisible(false);
                    sri.setVisible(false);
                    sri2.setVisible(false);
                }
            }
        });
        
        sriwedari.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()==sriwedari)
                {
                    judul3.setBounds(280, 80, 400, 30);
                    sri.setBounds(180, 80, 250, 300);
                    sri2.setBounds(450, 80, 250, 300);
                    judul3.setVisible(true);
                    sri.setVisible(true);
                    sri2.setVisible(true);
                    judul2.setVisible(false);
                    jopur.setVisible(false);
                    jopur2.setVisible(false);
                    prkut.setVisible(false);
                    prkut2.setVisible(false);
                    judul.setVisible(false);
                    prsoc.setVisible(false);
                    prjog.setVisible(false);
                    prkut.setVisible(false);
                    prkut2.setVisible(false);
                }
            }
        });
        
        bback.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()==bback)
                {
                    dispose();
                    utama bb = new utama();
                    bb.setVisible(true);
                }
    }
    });
        btnclear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()==btnclear)
                {
                    judul.setVisible(false);
                    prsoc.setVisible(false);
                    prjog.setVisible(false);
                    prkut.setVisible(false);
                    prkut2.setVisible(false);
                    judul2.setVisible(false);
                    jopur.setVisible(false);
                    jopur2.setVisible(false);
                   judul3.setVisible(false);
                    sri.setVisible(false);
                    sri2.setVisible(false);
                }
            }
        });
  }
}