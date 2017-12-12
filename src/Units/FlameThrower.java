package Units;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class FlameThrower extends Army implements  iAttack, iMove,Serializable {
private ArrayList<FlameThrower> flameThrower;
private Burner x;

    public FlameThrower() {
       x=new Burner();
        this.setPop(5);
        this.setArmor(30);
        this.setCreateTime(10000);
        this.setUpTime(15000);
        this.setHealth(700);
        this.setIsUpgraded(false);
        this.setProp("y.png");
        this.setName("Artillery");
        this.setSizeX(75);
        this.setSizeY(75);
        this.setPrice(1000);
        this.setUpPrice(1000);
        this.setSpeed(5);
        this.setBaseDamage(90);
        this.setAttackSpeed(15);
    }

    public void Burn(Burner x) {
    }

    @Override
    public void Attack(Unit x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

    @Override
    public void Move() {
        super.Move(); //To change body of generated methods, choose Tools | Templates.
    }

    
    @Override
    public void Upgrade() {
       
        this.setSpeed(this.getSpeed()+10);
        this.setArmor(this.getArmor()+10);
        this.setHealth(this.getHealth()+500);
        
        this.setAttackSpeed(this.getAttackSpeed()+10);
        this.setBaseDamage(this.getBaseDamage()+30);
        this.setIsUpgraded(true);
        this.setPrice(this.getPrice()+300);
        this.setProp("y.png");
    }

    public void Add() {
       FlameThrower x=new FlameThrower();
        flameThrower.add(x);
        
    }

    @Override
    public void underAttack() {
        super.underAttack(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Remove(Population x) {
       flameThrower.remove(flameThrower.size()-1);
         x.decPop(this.getPop());
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

  

    @Override
    public void Remove() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
}
