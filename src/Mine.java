
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Mine extends Buildings  implements iUpgrade,Serializable {

    private ArrayList<Mine> mine;
    final static int Up=500;
    private static int num;

    private static int rate;

    public void incGold(Resources x) {
    }

    @Override
    public void Upgrade(Resources x,Timer y) {
        x.decStock(Up);
    }

    @Override
    public void Add() {
      Mine x=new Mine();
      mine.add(x);
    }

    @Override
    public void underAttack() {
        super.underAttack(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Remove() {
        mine.remove(mine.size()-1);
    }
     public void save() throws FileNotFoundException, IOException
    {
        ObjectOutputStream s=new ObjectOutputStream(new FileOutputStream("E:\\shehab\\ks.bin"));
        
        s.writeObject(mine);
        s.close();
        
        
        
    }
    public void load() throws IOException, ClassNotFoundException
    {
       mine=null;
        ObjectInputStream w=new ObjectInputStream(new FileInputStream("E:\\shehab\\ks.bin"));
          
          mine=(ArrayList<Mine>)w.readObject();
       
        
    }
}
