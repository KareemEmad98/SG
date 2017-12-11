package Units;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class RocketSoldier extends Army implements iAttack, iMove {

      

    private ArrayList<RocketSoldier> rocketSoldier;
    private Missle x;
    public RocketSoldier(){
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

    @Override
    public void Attack(Unit x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  

    @Override
    public void Move() {
        System.out.println("Moving"); //To change body of generated methods, choose Tools | Templates.
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
