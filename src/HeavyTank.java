
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class HeavyTank extends Army implements iMove, iAttack, iDie, iUpgrade,Serializable {

    private ArrayList<HeavyTank> heavytank;
        private static final int HeavyTankPop=5;

     final static int Up=500;
    public void heavyShoot(Missle x) {
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
        HeavyTank x=new HeavyTank();
        heavytank.add(x);
        y.incPop(HeavyTankPop);
    }

    @Override
    public void underAttack() {
        super.underAttack(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Remove(Population y) {
        heavytank.remove(heavytank.size()-1);
        y.decPop(HeavyTankPop);
    }
    public void save() throws FileNotFoundException, IOException
    {
        ObjectOutputStream s=new ObjectOutputStream(new FileOutputStream("E:\\shehab\\ks.bin"));
        
        s.writeObject(heavytank);
        s.close();
        
        
        
    }
    public void load() throws IOException, ClassNotFoundException
    {
        heavytank=null;
        ObjectInputStream w=new ObjectInputStream(new FileInputStream("E:\\shehab\\ks.bin"));
          
          heavytank=(ArrayList<HeavyTank>)(ArrayList<HeavyTank>)w.readObject();
       
        
    }
}
