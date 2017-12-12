
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class TownHall extends Buildings  implements iUpgrade {

    private ArrayList<TownHall> townhall;
    final static int BuilderP=500;
    final static int Up=500;
    public void Deploy(Builder x,Resources y,Timer z,Population p) {
        
        x.Add();
        y.decStock(BuilderP);
    }

    @Override
    public void Upgrade(Resources x,Timer y) {
        x.decStock(Up); 
    }

    @Override
    public void Add() {
        TownHall x=new TownHall();
        townhall.add(x);
        
    }

    @Override
    public void underAttack() {
        super.underAttack(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Remove() {
        townhall.remove(townhall.size()-1); //To change body of generated methods, choose Tools | Templates.
    }
     public void save() throws FileNotFoundException, IOException
    {
        ObjectOutputStream s=new ObjectOutputStream(new FileOutputStream("E:\\shehab\\ks.bin"));
        
        s.writeObject(townhall);
        s.close();
        
        
        
    }
    public void load() throws IOException, ClassNotFoundException
    {
       townhall=null;
        ObjectInputStream w=new ObjectInputStream(new FileInputStream("E:\\shehab\\ks.bin"));
          
         townhall=(ArrayList<TownHall>)w.readObject();
       
        
    }
}
