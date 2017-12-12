
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Builder extends Unit implements iMove, iDie,Serializable {
    final static int BarracksP=500;
    final static int TownHallP=500;
    final static int TankFactoryP=500;
    final static int MineP=500;
    final static int HouseP=500;
    final static int LaboratoryP=500;
     private static final int BuilderPop=5;
    
    private ArrayList<Builder> builder;

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

   
    
      @Override
    public void Die() {
         builder.remove(builder.size()-1);
    }
    
   public void Build(TownHall x,Resources y,Timer z){
       x.Add();
       y.decStock(TownHallP);
   }
    public void Build(House x,Resources y,Timer z){
        x.Add();
        y.decStock(HouseP);
    }
    public void Build(Mine x,Resources y,Timer z){
        x.Add();
        y.decStock(MineP);
    }
    public void Build(Barracks x,Resources y,Timer z){
        x.Add();
        y.decStock(BarracksP);
    }
    public void Build(TankFactory x,Resources y,Timer z){
    x.Add();
    y.decStock(TankFactoryP);
    }
     public void Build(Laboratory x,Resources y,Timer z){
         x.Add();
         y.decStock(LaboratoryP);
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
}
