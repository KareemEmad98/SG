package Units;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Mine extends Buildings  implements Serializable {
   
    private ArrayList<Mine> mine;
    private static int num=0;
    private static int rate;

    public static int getNum() {
        return num;
    }

    public static void setNum(int num) {
        Mine.num = num;
    }

    public static int getRate() {
        return rate;
    }

    public static void setRate(int rate) {
        Mine.rate = rate;
    }
     public Mine() {    
        this.setArmor(50);
        this.setCreateTime(30000);
        this.setHealth(1500);
        this.setIsUpgraded(false);
        this.setProp("y.png");
        this.setName("Mine");
        this.setSizeX(75);
        this.setSizeY(75);
        this.setPrice(1000);
        this.setUpPrice(2000);
        this.setUpTime(25000);
        this.setRate(100);
        this.setNum(this.getNum()+1);
    }
    public void incGold(Resources x) {
        x.incStock(rate*num);
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
            this.setRate(this.getRate()+150);
            this.setProp(null);}
        else 
            System.out.println("Not Enough Gold!!");
    }

    @Override
    public void Add() {
      Mine x=new Mine();
      mine.add(x);
    }

    @Override
    public void underAttack() {
        super.underAttack(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Remove() {
        mine.remove(mine.size()-1);
    }
     public void save() throws FileNotFoundException, IOException
    {
        ObjectOutputStream s=new ObjectOutputStream(new FileOutputStream("E:\\shehab\\ks.bin"));
        
        s.writeObject(mine);
        s.close();
        
        
        
    }
    public void load() throws IOException, ClassNotFoundException
    {
       mine=null;
        ObjectInputStream w=new ObjectInputStream(new FileInputStream("E:\\shehab\\ks.bin"));
          
          mine=(ArrayList<Mine>)w.readObject();
       
        
    }

    
}
