package Units;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Builder extends Unit implements iMove, Serializable {
    
    
    private ArrayList<Builder> builder;

    public Builder() {
        
    }

    @Override
    public void Move() {
        System.out.println("x is moving"); //To change body of generated methods, choose Tools | Templates.
    }

  

    @Override
    public void Add() {
        Builder x=new Builder();
        builder.add(x);
    }

    @Override
    public void underAttack() {
        super.underAttack(); //To change body of generated methods, choose Tools | Templates.
    }

   
    
      
    
   public void Build(TownHall x,Resources y,Timer z) throws InterruptedException{
        if(y.GoldAvailable(x.getPrice())){
                z.wait(x.getCreateTime());
                x.Add();
                 y.decStock(x.getPrice());}
        else 
            System.out.println("Not Enough Gold!");
   }
    public void Build(House x,Resources y,Timer z) throws InterruptedException{
         if(y.GoldAvailable(x.getPrice())){
                z.wait(x.getCreateTime());
                x.Add();
                 y.decStock(x.getPrice());}
        else 
            System.out.println("Not Enough Gold!");
    }
    public void Build(Mine x,Resources y,Timer z) throws InterruptedException{
         if(y.GoldAvailable(x.getPrice())){
                z.wait(x.getCreateTime());
                x.Add();
                 y.decStock(x.getPrice());}
        else 
            System.out.println("Not Enough Gold!");
    }
    public void Build(Barracks x,Resources y,Timer z) throws InterruptedException{
        if(y.GoldAvailable(x.getPrice())){
                z.wait(x.getCreateTime());
                x.Add();
                 y.decStock(x.getPrice());}
        else 
            System.out.println("Not Enough Gold!");
    }
    public void Build(TankFactory x,Resources y,Timer z) throws InterruptedException{
        if(y.GoldAvailable(x.getPrice())){
                z.wait(x.getCreateTime());
                x.Add();
                 y.decStock(x.getPrice());}
        else 
            System.out.println("Not Enough Gold!");
    }
     public void Build(Laboratory x,Resources y,Timer z) throws InterruptedException{
        z.wait(x.getCreateTime());
        x.Add();
        y.decStock(x.getPrice());
     }
      public void save() throws FileNotFoundException, IOException
    {
        ObjectOutputStream s=new ObjectOutputStream(new FileOutputStream("E:\\shehab\\ks.bin"));
        
        s.writeObject(builder);
        s.close();
        
        
        
    }
    public void load() throws IOException, ClassNotFoundException
    {
       builder=null;
        ObjectInputStream w=new ObjectInputStream(new FileInputStream("E:\\shehab\\ks.bin"));
          
          builder=(ArrayList<Builder>)w.readObject();
       
        
    }

    

    @Override
    public void Remove() {
        builder.remove(builder.size()-1);
    }
}

   
