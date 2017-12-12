package Units;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class RifleMan extends Army implements  iAttack, iMove,Serializable {
private ArrayList<RifleMan> rifleman;
private Bullet x;
    public RifleMan(){
        x=new Bullet();
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
    public void shootBullet() {
    }

    
    @Override
    public void Attack(Unit x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Move() {
        System.out.println("R moved"); //To change body of generated methods, choose Tools | Templates.
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
