
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class House extends Buildings  implements iUpgrade,Serializable {

    private ArrayList<House> house;
    final static int Up=500;

    final static int capacity=20;

    @Override
    public void Add(Population z) {
       House x=new House();
       house.add(x);
       z.incTotal(capacity);
       
    }

    @Override
    public void underAttack() {
        super.underAttack(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Remove(Population x) {
       house.remove(house.size()-1);
       x.decTotal(capacity);
    }
     public void save() throws FileNotFoundException, IOException
    {
        ObjectOutputStream s=new ObjectOutputStream(new FileOutputStream("E:\\shehab\\ks.bin"));
        
        s.writeObject(house);
        s.close();
        
        
        
    }
    public void load() throws IOException, ClassNotFoundException
    {
       house=null;
        ObjectInputStream w=new ObjectInputStream(new FileInputStream("E:\\shehab\\ks.bin"));
          
          house=(ArrayList<House>)w.readObject();
       
        
    }

    @Override
    public void Upgrade(Resources x,Timer y) {
        x.decStock(Up);
         //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
