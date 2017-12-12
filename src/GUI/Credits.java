package GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Credits extends JFrame{
    //JLabel name1=new JLabel("Shehab Mohsen");
    //JLabel name2=new JLabel("Ali Tawfik");
    //JLabel name3=new JLabel("Kareem Emad");
    //JLabel name4=new JLabel("Radwa Mostafa");
    public Credits()
{
Rectangle Framesize = GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds();
this.setTitle("Game Of Thrones");
JLabel Background=new JLabel();
Background.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\hp\\Desktop\\SG pics\\ProjectXFounders.jpg").getImage().getScaledInstance(Framesize.width,Framesize.height, Image.SCALE_DEFAULT)));
this.setExtendedState(JFrame.MAXIMIZED_BOTH);
/*
name1.setForeground(Color.black);
name1.setFont(new Font("Forte", Font.BOLD, 30));
name2.setForeground(Color.white);
name2.setFont(new Font("", Font.ITALIC, 30));
name3.setForeground(Color.white);
name3.setFont(new Font("", Font.ITALIC, 30));
name4.setForeground(Color.white);
name4.setFont(new Font("", Font.ITALIC, 30));
Background.add(name1);
Background.add(name2);
Background.add(name3);
Background.add(name4);*/
add(Background);
//name1.setBounds(80, 550, 250, 50);
//name2.setBounds(80, 500, 250, 50);
//name3.setBounds(80,550 , 250, 50);
//name4.setBounds(80, 600, 250, 50);
}

}
