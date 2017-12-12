package GUI;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import sun.audio.*;
        
public class main extends JFrame
{
    
      JButton options=new JButton("Options");
      JButton exit=new JButton("Exit");
      JButton credits=new JButton("Credits");
      JButton login=new JButton("Login");
      JButton register=new JButton("Register");  
    public main() 
    {
        Rectangle Framesize = GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds();
        this.setTitle("Game Of Thrones");
        JLabel Background=new JLabel();
        Background.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\hp\\Desktop\\SG pics\\White-Walkers-In-Game-Of-Thrones-7-HD-Mobile-Wallpaper.jpg").getImage().getScaledInstance(Framesize.width,Framesize.height, Image.SCALE_DEFAULT)));
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        Background.add(login);
        Background.add(register);
        Background.add(options);
        Background.add(credits);
        Background.add(exit);
        add(Background);
       

        login.setBounds(40, 470, 250, 50);
        login.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\hp\\Desktop\\SG pics\\download-3.jpg").getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT)));
        login.setHorizontalTextPosition(AbstractButton.CENTER);
        login.setFont(new Font("Serif", Font.BOLD, 38));
        login.setForeground(Color.WHITE);
        
        register.setBounds(40, 540, 250, 50);
        register.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\hp\\Desktop\\SG pics\\download-3.jpg").getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT)));
        register.setHorizontalTextPosition(AbstractButton.CENTER);
        register.setFont(new Font("Serif", Font.BOLD, 38));
        register.setForeground(Color.WHITE);

        options.setBounds(40, 610, 250, 50);
        options.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\hp\\Desktop\\SG pics\\download-3.jpg").getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT)));
        options.setHorizontalTextPosition(AbstractButton.CENTER);
        options.setFont(new Font("Serif", Font.BOLD, 38));
        options.setForeground(Color.WHITE);

        credits.setBounds(40,680 , 250, 50);
        credits.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\hp\\Desktop\\SG pics\\download-3.jpg").getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT)));
        credits.setHorizontalTextPosition(AbstractButton.CENTER);
        credits.setFont(new Font("Serif", Font.BOLD, 38));
        credits.setForeground(Color.WHITE);
        
        exit.setBounds(40, 750, 250, 50);
        exit.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\hp\\Desktop\\SG pics\\download-3.jpg").getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT)));
        exit.setHorizontalTextPosition(AbstractButton.CENTER);
        exit.setFont(new Font("Serif", Font.BOLD, 38));
        exit.setForeground(Color.WHITE);
        
        login.addActionListener(new action());
        register.addActionListener(new action1());
        exit.addActionListener(new action2());
        credits.addActionListener(new action4());
    }
private class action implements ActionListener      
{   
  public void actionPerformed(ActionEvent ae) 
    {
        Log x=new Log();
        x.setVisible(true);
    }
}
private class action1 implements ActionListener
{
    public void actionPerformed(ActionEvent ae) 
    {
        Register x=new Register();
        x.setVisible(true);
    }
}
private class action2    implements ActionListener
{
    public void actionPerformed(ActionEvent ae) 
    {
      System.exit(0);
    }
}
public class action4 implements ActionListener
{
    public void actionPerformed(ActionEvent ae)
    {
            Credits x=new Credits();
            x.setVisible(true);
            
    }
}
}