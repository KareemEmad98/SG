package Units;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class House extends Buildings  implements Serializable {

    private ArrayList<House> house;
    static int capacity;
    public static int getCapacity() {
        return capacity;
    }

    public static void setCapacity(int capacity) {
        House.capacity = capacity;
    }
    

    
    public House() {
        
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
        this.setCapacity(20);
    }
    
    public void Add(Population z) {
       House x=new House();
       house.add(x);
       z.incTotal(capacity);
       
    }

    @Override
    public void underAttack() {
        super.underAttack(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Remove(Population x) {
       house.remove(house.size()-1);
       x.decTotal(capacity);
    }
     public void save() throws FileNotFoundException, IOException
    {
        ObjectOutputStream s=new ObjectOutputStream(new FileOutputStream("E:\\shehab\\ks.bin"));
        
        s.writeObject(house);
        s.close();
        
        
        
    }
    public void load() throws IOException, ClassNotFoundException
    {
       house=null;
        ObjectInputStream w=new ObjectInputStream(new FileInputStream("E:\\shehab\\ks.bin"));
          
          house=(ArrayList<House>)w.readObject();
       
        
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
             this.setCapacity(25);
       }
        else 
            System.out.println("Not Enough Gold!!");
    }

   
    
}
