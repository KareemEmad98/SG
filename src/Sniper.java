
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Sniper extends Army implements iUpgrade, iMove, iAttack, iDie {
 private ArrayList<Sniper> sniper;
 final static int Up=500;
 private static final int SniperPop=5;
    public void create(Population x, Resources y) {
    }

    @Override
    public void Attack() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Die() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Move() {
        super.Move(); //To change body of generated methods, choose Tools | Templates.
    }

    

    @Override
    public void Upgrade(Resources x,Timer y) {
        x.decStock(Up); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Add() {
        Sniper x=new Sniper();  //To change body of generated methods, choose Tools | Templates.
        sniper.add(x);
    }

    @Override
    public void underAttack() {
        super.underAttack(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Remove() {
        sniper.remove(sniper.size()-1); //To change body of generated methods, choose Tools | Templates.
    }
    public void save() throws FileNotFoundException, IOException {
        ObjectOutputStream s=new ObjectOutputStream(new FileOutputStream("E:\\shehab\\ks.bin"));
        
        s.writeObject(sniper);
        s.close();
        
        
        
    }
    public void load() throws IOException, ClassNotFoundException
    {
        sniper=null;
        ObjectInputStream w=new ObjectInputStream(new FileInputStream("E:\\shehab\\ks.bin"));
          
          sniper=(ArrayList<Sniper>)w.readObject();
       
        
    }
    
}
