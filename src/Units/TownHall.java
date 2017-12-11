package Units;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class TownHall extends Buildings   {
    private ArrayList<TownHall> townhall;
     public TownHall() {
        
        this.setArmor(50);
        this.setCreateTime(30000);
        this.setHealth(1500);
        this.setIsUpgraded(false);
        this.setProp("y.png");
        this.setName("TownHall");
        this.setSizeX(75);
        this.setSizeY(75);
        this.setPrice(1000);
        this.setUpPrice(2000);
        this.setUpTime(25000);
    }
    public void Deploy(Builder x,Resources y,Timer z,Population p) throws InterruptedException {
        if(y.GoldAvailable(x.getPrice())){
            if(p.housingAvailable(x.getPop())){
            z.wait(x.getCreateTime());
            p.incPop(x.getPop());
            x.Add();
            y.decStock(x.getPrice());}
        else
            System.out.println("Not Enough Houses!");}
            else
               System.out.println("Not Enought Gold!!");   
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
        TownHall x=new TownHall();
        townhall.add(x);
        
    }

    @Override
    public void underAttack() {
        super.underAttack(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Remove() {
        townhall.remove(townhall.size()-1); //To change body of generated methods, choose Tools | Templates.
    }
     public void save() throws FileNotFoundException, IOException
    {
        ObjectOutputStream s=new ObjectOutputStream(new FileOutputStream("E:\\shehab\\ks.bin"));
        
        s.writeObject(townhall);
        s.close();
        
        
        
    }
    public void load() throws IOException, ClassNotFoundException
    {
       townhall=null;
        ObjectInputStream w=new ObjectInputStream(new FileInputStream("E:\\shehab\\ks.bin"));
          
         townhall=(ArrayList<TownHall>)w.readObject();
       
        
    }

    

    
}
