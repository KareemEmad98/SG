
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Flag implements Serializable {

    private int flagID;

    private String color;
     ArrayList<Flag>flag=new ArrayList<Flag>();
    public void save() throws FileNotFoundException, IOException
    {
        
        ObjectOutputStream s=new ObjectOutputStream(new FileOutputStream("E:\\shehab\\ks.bin"));
        
        s.writeObject(flag);
        s.close();
        
        
        
    }
    public void load() throws IOException, ClassNotFoundException
    {
       flag=null;
        ObjectInputStream w=new ObjectInputStream(new FileInputStream("E:\\shehab\\ks.bin"));
          
          flag=(ArrayList<Flag>)w.readObject();
       
        
    }
}
