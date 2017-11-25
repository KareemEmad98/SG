
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Tower extends Army implements iUpgrade, iAttack {
    ArrayList<Tower> tower=new ArrayList<Tower>();
    final static int Up=500;
    public void MissleDefence(Missle x) {
    }

    @Override
    public void Attack() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  

    @Override
    public void Upgrade(Resources x,Timer y) {
     x.decStock(Up);
     }

    @Override
    public void Add() {
       Tower x=new Tower(); //To change body of generated methods, choose Tools | Templates.
       tower.add(x);
    }

    @Override
    public void underAttack() {
        super.underAttack(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Remove() {
        tower.remove(tower.size()-1); //To change body of generated methods, choose Tools | Templates.
    }
     public void save() throws FileNotFoundException, IOException
    {
        ObjectOutputStream s=new ObjectOutputStream(new FileOutputStream("E:\\shehab\\ks.bin"));
        
        s.writeObject(tower);
        s.close();
        
        
        
    }
    public void load() throws IOException, ClassNotFoundException
    {
       tower=null;
        ObjectInputStream w=new ObjectInputStream(new FileInputStream("E:\\shehab\\ks.bin"));
          
          tower=(ArrayList<Tower>)w.readObject();
       
        
    }
    
}
