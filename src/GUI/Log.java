package GUI;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
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

public class Log extends JFrame
{

User user;
JLabel name=new JLabel("Name:");
JTextField n=new JTextField(20);
JLabel pass=new JLabel("Password:");
JPasswordField m=new JPasswordField(20);
JButton login=new JButton("Login");
    public Log()
    {    
        user=new User();
        this.setSize(400, 200);
        this.setTitle("Login");
        name.setForeground(Color.white);
        pass.setForeground(Color.white);
        setLayout(null);
        this.add(name);
        this.add(n);
        this.add(pass);
        this.add(m);
        this.add(login);
        name.setBounds(10, 10, 60, 60);
        name.setFont(new Font("Serif", Font.BOLD, 20));
        name.setForeground(Color.BLACK);
        n.setBounds(70, 33, 200, 20);
        pass.setBounds(10, 40, 100, 60);
        pass.setFont(new Font("Serif", Font.BOLD, 20));
        pass.setForeground(Color.BLACK);
        m.setBounds(105, 63, 200, 20);
        login.setBounds(100, 100, 90, 30);
        login.setFont(new Font("Serif", Font.BOLD, 18));
        login.setForeground(Color.WHITE);
        login.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\hp\\Desktop\\SG pics\\download.jpg").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT)));
        login.setHorizontalTextPosition(AbstractButton.CENTER);

        login.addActionListener(new action());
    }
private class action implements ActionListener
{
    public void actionPerformed(ActionEvent ae)
    {
        try 
        {
        String x=n.getText();
        String y=m.getText();
        if(user.check(x,y)==true)
        {
        dispose();    
        JOptionPane.showMessageDialog(null, "Login Successfull!");
        Civilization z=new Civilization();
        z.setVisible(true);
        }
        else
        {
        JOptionPane.showMessageDialog(null, "Username or Passeword is incorrect");
        }
        } 
        catch (IOException ex) 
        {
        Logger.getLogger(Log.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) 
        {
        Logger.getLogger(Log.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}       
}
