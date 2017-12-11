package GUI;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Civilization extends JFrame 
{
JLabel label1=new JLabel("  CHOOSE YOUR CIVILIZATION");
JButton image1=new JButton("");
JButton image2=new JButton("");
public Civilization()
{
Rectangle Framesize = GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds();
this.setTitle("Game Of Thrones");
JLabel Background=new JLabel();
Background.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\hp\\Desktop\\SG pics\\zombie-444.jpg").getImage().getScaledInstance(Framesize.width,Framesize.height, Image.SCALE_DEFAULT)));
this.setExtendedState(JFrame.MAXIMIZED_BOTH);
label1.setBackground(Color.blue);
label1.setForeground(Color.white);
label1.setFont(new Font("serif", Font.BOLD, 34));
label1.setBorder(BorderFactory.createStrokeBorder(new BasicStroke(5.0f)));

Background.add(label1);
Background.add(image1);
Background.add(image2);
add(Background);
label1.setBounds(550, 470, 570, 80);
image1.setBounds(0,550 , 800, 300);
image2.setBounds(800, 550, 900, 300);
image1.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\hp\\Desktop\\SG pics\\i.jpeg").getImage().getScaledInstance(900, 300, Image.SCALE_DEFAULT)));
image2.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\hp\\Desktop\\SG pics\\ps4.jpg").getImage().getScaledInstance(900, 300, Image.SCALE_DEFAULT)));

}
 
}