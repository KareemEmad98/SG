package Units;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Laboratory extends Buildings  implements Serializable {
    
    private ArrayList<Laboratory> laboratory;
    
    public Laboratory() {
        
        this.setArmor(50);
        this.setCreateTime(30000);
        this.setHealth(1500);
        this.setIsUpgraded(false);
        this.setProp("y.png");
        this.setName("Barracks");
       this.setSizeX(75);
        this.setSizeY(75);
        this.setPrice(1000);
        this.setUpPrice(2000);
        this.setUpTime(25000);
    }
    public void UpgradeSniper(Sniper x,Timer z,Resources r) throws InterruptedException {
       if(r.GoldAvailable(x.getPrice())){
        z.wait(x.getUpTime());
        r.decStock(x.getUpPrice());
        x.Upgrade();}
       else 
            System.out.println("Not Enough Gold!");
    }

    public void UpgradeRifleMan(RifleMan x,Timer z,Resources r) throws InterruptedException {
         if(r.GoldAvailable(x.getPrice())){
        z.wait(x.getUpTime());
        r.decStock(x.getUpPrice());
        x.Upgrade();}
       else 
            System.out.println("Not Enough Gold!");
    }

    public void UpgradeFlameThrower(FlameThrower x,Timer z,Resources r) throws InterruptedException {
         if(r.GoldAvailable(x.getPrice())){
                z.wait(x.getUpTime());
                 r.decStock(x.getUpPrice());
                x.Upgrade();}
       else 
            System.out.println("Not Enough Gold!");
            }

    public void UpgradeRocketSoldier(RocketSoldier x,Timer z,Resources r) throws InterruptedException {
        if(r.GoldAvailable(x.getPrice())){
        z.wait(x.getUpTime());
        r.decStock(x.getUpPrice());
        x.Upgrade();}
       else 
            System.out.println("Not Enough Gold!");
            }    

  

    
    public void Upgrade(Resources x,Timer y) throws InterruptedException{
       if(x.GoldAvailable(this.getUpPrice())){
            y.wait(this.getUpTime());
            x.decStock(this.getUpPrice());
            this.setArmor(this.getArmor()+60);
            this.setCreateTime(this.getCreateTime()-3000);
            this.setHealth(this.getHealth()+1000);
            this.setPrice(this.getPrice()+500);
             this.setIsUpgraded(true);}
        else 
            System.out.println("Not Enough Gold!!");
    }

   



    @Override
    public void Add() {
        Laboratory x=new Laboratory();
        laboratory.add(x);
    }

    @Override
    public void underAttack() {
        super.underAttack(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Remove() {
        laboratory.remove(laboratory.size()-1);
    }
     public void save() throws FileNotFoundException, IOException
    {
        ObjectOutputStream s=new ObjectOutputStream(new FileOutputStream("E:\\shehab\\ks.bin"));
        
        s.writeObject(laboratory);
        s.close();
        
        
        
    }
    public void load() throws IOException, ClassNotFoundException
    {
       laboratory=null;
        ObjectInputStream w=new ObjectInputStream(new FileInputStream("E:\\shehab\\ks.bin"));
          
          laboratory=(ArrayList<Laboratory>)w.readObject();
       
        
    }

    
}