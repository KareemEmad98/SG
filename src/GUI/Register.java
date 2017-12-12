package GUI;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Register extends JFrame 
{
    JLabel name=new JLabel("Name");
    JTextField z=new JTextField(20);
    JLabel pass=new JLabel("Password");
    JPasswordField m=new JPasswordField(20);
    JLabel confirm=new JLabel("Confirm Password");
    JPasswordField x=new JPasswordField(20);
    JButton save=new JButton("Done");
    User  user;
    public Register()
    {
        user =new User();
        this.setSize(410, 250);
        this.setTitle("Register");
        this.add(name);
        this.add(z);
        this.add(pass);
        this.add(m);
        this.add(confirm);
        this.add(x);
        this.add(save);
        
        name.setForeground(Color.white);
        pass.setForeground(Color.white);
        confirm.setForeground(Color.white);
        this.setLayout(null);
        name.setBounds(10, 10, 60, 60);
        name.setFont(new Font("Serif", Font.BOLD, 20));
        name.setForeground(Color.BLACK);
        z.setBounds(70, 33, 200, 20);
        pass.setBounds(10, 40, 100, 60);
        pass.setFont(new Font("Serif", Font.BOLD, 20));
        pass.setForeground(Color.BLACK);
        m.setBounds(105, 63, 200, 20);
        confirm.setBounds(10, 70, 160, 60);
        confirm.setFont(new Font("Serif", Font.BOLD, 20));
        confirm.setForeground(Color.BLACK);
        x.setBounds(185, 93, 200, 20);
        save.setBounds(125, 130, 90, 30);
        save.setFont(new Font("Serif", Font.BOLD, 18));
        save.setForeground(Color.WHITE);
        save.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\hp\\Desktop\\SG pics\\download.jpg").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT)));
        save.setHorizontalTextPosition(AbstractButton.CENTER);
        
        save.addActionListener(new action());
    }
    private class action implements ActionListener
            {
        @Override
        public void actionPerformed(ActionEvent ae) 
        {
            String t=z.getText();
            String q=m.getText();
            String p=x.getText();
           
            try 
            {
                 if(!q.equals(p))
                 {
                JOptionPane.showMessageDialog(null,"Passwords don't match");
                
                 }
            else{
              user.add(t,q);
              JOptionPane.showMessageDialog(null,"Register SuccessFull");
              dispose();
                 }
            } 
            catch (IOException ex)
            {
                Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            }
        }         

        
}
