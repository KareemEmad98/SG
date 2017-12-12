package Units;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class HeavyTank extends Army implements iMove, iAttack,Serializable {

    

    private ArrayList<HeavyTank> heavytank;
    private Missle x;

     public HeavyTank() {
         x=new Missle();
        this.setPop(8);
        this.setArmor(60);
        this.setCreateTime(15000);
        this.setUpTime(20000);
        this.setHealth(1200);
        this.setIsUpgraded(false);
        this.setProp("y.png");
        this.setName("Heavy-Tank");
        this.setSizeX(75);
        this.setSizeY(75);
        this.setPrice(1400);
        this.setUpPrice(1600);
        this.setSpeed(5);
        this.setBaseDamage(140);
        this.setAttackSpeed(15);
           

    }
    public int heavyShoot(Missle x) {
        int total=x.getExplosiveDamage()+this.getBaseDamage();
        return total;
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
     
            this.setArmor(this.getArmor()+60);
            this.setCreateTime(this.getCreateTime()-3000);
            this.setHealth(this.getHealth()+1000);
            this.setPrice(this.getPrice()+500);
             this.setIsUpgraded(true);
    }

    @Override
    public void Add() {
        HeavyTank x=new HeavyTank();
        heavytank.add(x);
        
    }

    @Override
    public void underAttack() {
        super.underAttack(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Remove(Population y) {
        heavytank.remove(heavytank.size()-1);
        y.decPop(this.getPop());
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

   

   

    @Override
    public void Remove() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
   
}
