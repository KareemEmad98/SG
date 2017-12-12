
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class RifleMan extends Army implements iDie, iUpgrade, iAttack, iMove,Serializable {
private ArrayList<RifleMan> rifleman;
final static int Up=500;
 private static final int RifleManPop=5;
    public void shootBullet() {
    }

    @Override
    public void Die() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Attack() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Move() {
        System.out.println("R moved"); //To change body of generated methods, choose Tools | Templates.
    }

  

    @Override
    public void Upgrade(Resources x,Timer y) {
        x.decStock(Up); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Add() {
        RifleMan x=new RifleMan();
        rifleman.add(x);
    }

    @Override
    public void underAttack() {
        super.underAttack(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Remove() {
       rifleman.remove(rifleman.size()-1);
    }
    public void save() throws FileNotFoundException, IOException
    {
        ObjectOutputStream s=new ObjectOutputStream(new FileOutputStream("E:\\shehab\\ks.bin"));
        
        s.writeObject(rifleman);
        s.close();
        
        
        
    }
    public void load() throws IOException, ClassNotFoundException
    {
        rifleman=null;
        ObjectInputStream w=new ObjectInputStream(new FileInputStream("E:\\shehab\\ks.bin"));
          
          rifleman=(ArrayList<RifleMan>)w.readObject();
       
        
    }
    
}
