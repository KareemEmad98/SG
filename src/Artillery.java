 
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Artillery extends Army implements iMove, iDie, iUpgrade, iAttack,Serializable {
    ArrayList<Artillery> artillery=new ArrayList<Artillery>();
        private static final int ArtilleryPop=5;

    final static int Up=500;
    @Override
    public void Move() {
        super.Move(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Attack(Object x) {
        super.Attack(x); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Upgrade(Resources x,Timer y) {
        x.decStock(Up);
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Add(Population y) {
        Artillery x=new Artillery();
        artillery.add(x);
        y.incPop(ArtilleryPop);
    }

    @Override
    public void underAttack() {
        super.underAttack(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Remove(Population y) {
        artillery.remove(artillery.size()-1);
        y.decPop(ArtilleryPop);
    }
    
    public void RapidMissle(Missle x) {
    }

    @Override
    public void Die() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Attack() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
     public void save() throws FileNotFoundException, IOException
    {
        ObjectOutputStream s=new ObjectOutputStream(new FileOutputStream("E:\\shehab\\ks.bin"));
        
        s.writeObject(artillery);
        s.close();
        
        
        
    }
    public void load() throws IOException, ClassNotFoundException
    {
        artillery=null;
        ObjectInputStream w=new ObjectInputStream(new FileInputStream("E:\\shehab\\ks.bin"));
          
          artillery=(ArrayList<Artillery>)w.readObject();
       
        
    }
}
