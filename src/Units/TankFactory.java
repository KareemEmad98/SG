package Units;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class TankFactory extends Buildings  implements Serializable {

    private ArrayList<TankFactory> tankfactory;
     public TankFactory() {
        
        this.setArmor(50);
        this.setCreateTime(30000);
        this.setHealth(1500);
        this.setIsUpgraded(false);
        this.setProp("y.png");
        this.setName("Tank-Factory");
        this.setSizeX(75);
        this.setSizeY(75);
        this.setPrice(1000);
        this.setUpPrice(2000);
        this.setUpTime(25000);
    }
    
    public void Deploy(Artillery a, Resources r,Timer t,Population p) throws InterruptedException{
       if(r.GoldAvailable(a.getPrice())){
            if(p.housingAvailable(a.getPop())){
                t.wait(a.getCreateTime());
                a.Add();
                r.decStock(a.getPrice());
                p.incPop(a.getPop());}
            else
                System.out.println("Build more houses!");}
       else 
            System.out.println("Not Enough Gold!");
    }

    public void Deploy(HeavyTank h, Resources r,Timer t,Population p) throws InterruptedException {
        if(r.GoldAvailable(h.getPrice())){
            if(p.housingAvailable(h.getPop())){
                t.wait(h.getCreateTime());
                h.Add();
                r.decStock(h.getPrice());
                p.incPop(h.getPop());}
            else
                System.out.println("Build more houses!");}
       else 
            System.out.println("Not Enough Gold!");
    }

    
    public void UpgradeHeavyTank(HeavyTank a,Resources x,Timer y) throws InterruptedException{
    if(x.GoldAvailable(a.getUpPrice())){
            y.wait(a.getUpTime());
            x.decStock(a.getUpPrice());
            a.Upgrade();
            }
        else 
            System.out.println("Not Enough Gold!!");
    }
    
    public void UpgradeArtillery(Artillery a,Resources x,Timer y) throws InterruptedException{
    if(x.GoldAvailable(a.getUpPrice())){
            y.wait(a.getUpTime());
            x.decStock(a.getUpPrice());
            a.Upgrade();
            }
        else 
            System.out.println("Not Enough Gold!!");
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
        
        TankFactory x=new TankFactory();
        tankfactory.add(x); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void underAttack() {
        super.underAttack(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Remove() {
        tankfactory.remove(tankfactory.size()-1); //To change body of generated methods, choose Tools | Templates.
    }
    public void save() throws FileNotFoundException, IOException
    {
        ObjectOutputStream s=new ObjectOutputStream(new FileOutputStream("E:\\shehab\\ks.bin"));
        
        s.writeObject(tankfactory);
        s.close();
        
        
        
    }
    public void load() throws IOException, ClassNotFoundException
    {
        tankfactory=null;
        ObjectInputStream w=new ObjectInputStream(new FileInputStream("E:\\shehab\\ks.bin"));
          
          tankfactory=(ArrayList<TankFactory>)w.readObject();
       
        
    }

    

   
}
