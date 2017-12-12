package Units;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Barracks extends Buildings  implements Serializable {
    private ArrayList<Barracks> barracks;
   
    public Barracks() {
        
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

    
    
    
          

    public void Deploy(RifleMan x, Resources y,Timer z,Population p) throws InterruptedException {
        
        if(y.GoldAvailable(x.getPrice())){
            if(p.housingAvailable(x.getPop())){
        z.wait(x.getCreateTime());
        x.Add();
        y.decStock(x.getPrice());
        p.incPop(x.getPop());}
        else
                System.out.println("Build more houses!");}
       else 
            System.out.println("Not Enough Gold!");
    }   
    
    public void Deploy(Sniper x, Resources y, Timer z,Population p) throws InterruptedException {
        if(y.GoldAvailable(x.getPrice())){
            if(p.housingAvailable(x.getPop())){
                z.wait(x.getCreateTime());
                    
                x.Add();
                y.decStock(x.getPrice());
                p.incPop(x.getPop());}
        else
                System.out.println("Build more houses!");}
       else 
            System.out.println("Not Enough Gold!");
    }

    public void Deploy(FlameThrower x, Resources y,Timer z, Population p) throws InterruptedException {
         if(y.GoldAvailable(x.getPrice())){
            if(p.housingAvailable(x.getPop())){
        z.wait(x.getCreateTime());
        x.Add();
        y.decStock(x.getPrice());
        p.incPop(x.getPop());}
        else
                System.out.println("Build more houses!");}
       else 
            System.out.println("Not Enough Gold!");

    }

    public void Deploy(RocketSoldier x, Resources y,Timer z,Population p) throws InterruptedException {
        if(y.GoldAvailable(x.getPrice())){
            if(p.housingAvailable(x.getPop())){
                z.wait(x.getCreateTime());
                x.Add();
                y.decStock(x.getPrice());
                p.incPop(x.getPop());}
            else
                System.out.println("Build more houses!");}
       else 
            System.out.println("Not Enough Gold!");

    }

    

    
    public void Upgrade(Resources x,Timer y) throws InterruptedException {
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
        Barracks x=new Barracks();
        barracks.add(x);
    }

    @Override
    public void underAttack() {
        super.underAttack(); //To change body of generated methods, choose Tools | Templates.
    }
    public void save() throws FileNotFoundException, IOException
    {
        ObjectOutputStream s=new ObjectOutputStream(new FileOutputStream("E:\\shehab\\ks.bin"));
        
        s.writeObject(barracks);
        s.close();
        
        
        
    }
    public void load() throws IOException, ClassNotFoundException
    {
        barracks=null;
        ObjectInputStream w=new ObjectInputStream(new FileInputStream("E:\\shehab\\ks.bin"));
          
          barracks=(ArrayList<Barracks>)w.readObject();
       
        
    }

    
    @Override
    public void Remove() {
        barracks.remove(barracks.size()-1);
    }

    @Override
    public void setProp(String x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
