
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Barracks extends Buildings  implements iUpgrade,Serializable {

    
    private ArrayList<Barracks> barracks;
    final static int RifleManP=500;
    final static int SniperP=500;
    final static int FlameThrowerP=500;
    final static int RocketSoldierP=500;
    final static int Up=500;
            
   

    

    

    public void Deploy(RifleMan x, Resources y,Timer z) {
        x.Add();
        y.decStock(RifleManP);
    }   
    
    public void Deploy(Sniper x, Resources y, Timer z) {
        x.Add();
        y.decStock(SniperP);
    }

    public void Deploy(FlameThrower x, Resources y,Timer z) {
        x.Add();
        y.decStock(FlameThrowerP);
    }

    public void Deploy(RocketSoldier x, Resources y,Timer z) {
        x.Add();
        y.decStock(RocketSoldierP);
    }

    @Override
    public void demolish() {
       barracks.remove(barracks.size()-1);
    }

    @Override
    public void Upgrade(Resources x,Timer y) {
      x.decStock(Up);
    }

    @Override
    public void Add() {
        Barracks x=new Barracks();
        barracks.add(x);
    }

    @Override
    public void underAttack() {
        super.underAttack(); //To change body of generated methods, choose Tools | Templates.
    }
    public void save() throws FileNotFoundException, IOException
    {
        ObjectOutputStream s=new ObjectOutputStream(new FileOutputStream("E:\\shehab\\ks.bin"));
        
        s.writeObject(barracks);
        s.close();
        
        
        
    }
    public void load() throws IOException, ClassNotFoundException
    {
        barracks=null;
        ObjectInputStream w=new ObjectInputStream(new FileInputStream("E:\\shehab\\ks.bin"));
          
          barracks=(ArrayList<Barracks>)w.readObject();
       
        
    }
}
