
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class RocketSoldier extends Army implements iAttack, iDie, iMove, iUpgrade {

       private static final int RocketSoldierPop=5;

    private ArrayList<RocketSoldier> rocketSoldier;
    final static int Up=500;
    

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
        System.out.println("Moving"); //To change body of generated methods, choose Tools | Templates.
    }

   

    @Override
    public void Upgrade(Resources x,Timer y) {
        x.decStock(Up); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Add() {
        RocketSoldier x=new RocketSoldier();
        rocketSoldier.add(x);
    }

    @Override
    public void underAttack() {
        super.underAttack(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Remove() {
        rocketSoldier.remove(rocketSoldier.size()-1);
    }
    public void save() throws FileNotFoundException, IOException
    {
        ObjectOutputStream s=new ObjectOutputStream(new FileOutputStream("E:\\shehab\\ks.bin"));
        
        s.writeObject(rocketSoldier);
        s.close();
        
        
        
    }
    public void load() throws IOException, ClassNotFoundException
    {
        rocketSoldier=null;
        ObjectInputStream w=new ObjectInputStream(new FileInputStream("E:\\shehab\\ks.bin"));
          
          rocketSoldier=(ArrayList<RocketSoldier>)w.readObject();
       
        
    }
    
}
