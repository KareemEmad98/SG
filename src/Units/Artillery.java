package Units;

 
import java.awt.Dimension;
import java.awt.Rectangle;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JLabel;

public class Artillery extends Army implements iMove,  iAttack,Serializable {
    ArrayList<Artillery> artillery=new ArrayList<Artillery>();
    Missle m;
    

    public Artillery(){
        m=new Missle();
        this.setPop(5);
        this.setArmor(30);
        this.setCreateTime(10000);
        this.setUpTime(15000);
        this.setHealth(700);
        this.setMaxHealth(700);
        this.setIsUpgraded(false);
        this.setProp("y.ing");
        this.setName("Artillery");
        this.setSizeX(75);
        this.setSizeY(75);
        this.setPrice(1000);
        this.setUpPrice(1000);
        this.setSpeed(5);
        this.setBaseDamage(90);
        this.setAttackSpeed(15);
        
    }

    @Override
    public void Move() {
        super.Move(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Attack(Unit x) {
        super.Attack(x); 
        if((x.getHealth()-this.RapidMissle(m))>0)
            x.setHealth(x.getHealth()-this.RapidMissle(m));
        else
            x.Remove();
        
        
    }

    

    
    @Override
    public void Upgrade() {
        
        
        this.setSpeed(this.getSpeed()+10);
        this.setArmor(this.getArmor()+10);
        this.setHealth(this.getHealth()+500);
        this.setMaxHealth(this.getHealth()+500);
        this.setAttackSpeed(this.getAttackSpeed()+10);
        this.setBaseDamage(this.getBaseDamage()+30);
        this.setIsUpgraded(true);
        this.setPrice(this.getPrice()+300);
        
        
        
    }

    @Override
    public void Add() {
        Artillery x=new Artillery();
        artillery.add(x);
        
    }

    @Override
    public void underAttack() {
        super.underAttack(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Remove(Population p) {
        artillery.remove(artillery.size()-1);
         p.decPop(this.getPop());
         this.setCountDeath(this.getCountDeath()+1);
       
    }
    
    public int RapidMissle(Missle x){
        int totalDamage=x.getExplosiveDamage()+this.getBaseDamage();
        return totalDamage;
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