
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class FlameThrower extends Army implements iUpgrade, iAttack, iDie, iMove,Serializable {
private ArrayList<FlameThrower> flameThrower;
private static final int FlameThrowerPop=5;
final static int Up=500;
    public void Burn(Burner x) {
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
    public void Add(Population y) {
        FlameThrower x=new FlameThrower();
        flameThrower.add(x);
        y.incPop(FlameThrowerPop);
        
    }

    @Override
    public void underAttack() {
        super.underAttack(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Remove(Population x) {
        flameThrower.remove(flameThrower.size()-1);
        x.decPop(FlameThrowerPop);
    }
     public void save() throws FileNotFoundException, IOException
    {
        ObjectOutputStream s=new ObjectOutputStream(new FileOutputStream("E:\\shehab\\ks.bin"));
        
        s.writeObject(flameThrower);
        s.close();
        
        
        
    }
    public void load() throws IOException, ClassNotFoundException
    {
        flameThrower=null;
        ObjectInputStream w=new ObjectInputStream(new FileInputStream("E:\\shehab\\ks.bin"));
          flameThrower=(ArrayList<FlameThrower>)w.readObject();
       
        
    }
    
    
}
