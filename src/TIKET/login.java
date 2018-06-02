package TIKET;

import javax.swing.*;
import java.awt.event.*;

public class login {
    public static void main(String [] args){
        objeklogin l = new objeklogin();
        
    }
}
class objeklogin extends JFrame implements ActionListener {
    JLabel luser = new JLabel (" Username : ");
    JLabel lpass = new JLabel (" Password : ");
    //Icon iconback = new ImageIcon("C:\\Users\\A S U S\\Pictures\\PROJECT PBO\\loginback.png");
    //JLabel back = new JLabel (iconback);
    JTextField tfuser = new JTextField(10);
    JPasswordField pfpassword = new JPasswordField (10);
    JButton Loginbtn = new JButton(" MASUK ");
    JButton Cancelbtn = new JButton(" BATAL ");
    
    public objeklogin(){
    setTitle(" LOGIN RESERVASI ");
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setSize (290,160);
    setResizable(false);
    setLocationRelativeTo(this);
    setLayout(null);
    add(luser);
    add(tfuser);
    add(lpass);
    add(pfpassword);
    add(Loginbtn);
    Loginbtn.addActionListener(this);
    add(Cancelbtn);
    //add(back);
    Cancelbtn.addActionListener(this);
    luser.setBounds(20, 20, 100, 20);
    lpass.setBounds(20, 50, 100, 20);
    tfuser.setBounds(100, 20, 130, 20);
    pfpassword.setBounds(100, 50, 130, 20);
    Loginbtn.setBounds(40, 90, 82, 20);
    Cancelbtn.setBounds(144, 90, 86, 20);
    //back.setBounds(0, 0, 290, 160);
    setVisible(true);
    }
    public void actionPerformed(ActionEvent ae) {
            if (ae.getSource()==Loginbtn)
            {
                if(tfuser.getText().equals("user") && pfpassword.getText().equals("user"))
                {
                    dispose();
                    utama a = new utama();
                    a.setVisible(true);
                }
                else if(tfuser.getText().equals("admin") && pfpassword.getText().equals("123"))
                {
                    dispose();
                    admin a = new admin();
                    a.setVisible(true);
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Silakan coba lagi");
                    tfuser.setText("");
                    pfpassword.setText("");
                }
            }
            else if (ae.getSource()==Cancelbtn)
            {
                this.dispose();
            }
   }
}
