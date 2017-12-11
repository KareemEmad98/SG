package Units;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Tower extends Army implements  iAttack {
    ArrayList<Tower> tower=new ArrayList<Tower>();
     public Tower() {
        this.setArmor(50);
        this.setCreateTime(30000);
        this.setHealth(1500);
        this.setIsUpgraded(false);
        this.setProp("y.png");
        this.setName("Tower");
        this.setSizeX(75);
        this.setSizeY(75);
        this.setPrice(1000);
        this.setUpPrice(2000);
        this.setUpTime(25000);
    }
    public void MissleDefence(Missle x) {
    }

    @Override
    public void Attack(Unit x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  

   
    public void Upgrade(Resources x,Timer y) throws InterruptedException {
     if(x.GoldAvailable(this.getUpPrice())){
            y.wait(this.getUpTime());
            x.decStock(this.getUpPrice());
            this.setArmor(this.getArmor()+60);
            this.setCreateTime(this.getCreateTime()-3000);
            this.setHealth(this.getHealth()+1000);
            this.setPrice(this.getPrice()+500);
             this.setIsUpgraded(true);
             this.setBaseDamage(this.getBaseDamage()+40);
             this.setAttackSpeed(this.getAttackSpeed()+15);
     }
        else 
            System.out.println("Not Enough Gold!!"); 
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
