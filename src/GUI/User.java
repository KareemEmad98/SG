package GUI;
 
import java.awt.BorderLayout;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class User extends javax.swing.JFrame implements Serializable
{
    private String username;
    private String password;
    HashMap<String,String> x=new HashMap<String,String>();

    public void setX(HashMap<String, String> x) 
    {
    this.x = x;
    }
    public void add(String username,String password) throws FileNotFoundException, IOException
    {
    this.username=username;
    this.password=password;  
    x.put(this.username,this.password);
    ObjectOutputStream s=new ObjectOutputStream(new FileOutputStream("ahmed.bin"));
    s.writeObject(x);
    s.close();   
    }
    public void delete(String username)
    {
    x.remove(username);   
    }   
    public boolean check(String username,String password) throws FileNotFoundException, IOException, ClassNotFoundException
    {
    ObjectInputStream w=new ObjectInputStream(new FileInputStream("ahmed.bin"));
    x=(HashMap<String, String>)w.readObject();
    for(String z :x.keySet())
    {
    if(z.equals(username) && x.get(z).equals(password))
    {    
    return true;
    }   
    else
    { 
    return false;
    }   
    }
    return false;
    }
}