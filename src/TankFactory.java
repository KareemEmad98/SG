
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class TankFactory extends Buildings  implements iUpgrade {

    private ArrayList<TankFactory> tankfactory;
    final static int ArtilleryP=500;
    final static int HeavyTankP=500;
    final static int Up=500;
    public void Deploy(Artillery x, Resources y,Timer z){
        x.Add();
        y.decStock(ArtilleryP);
    }

    public void Deploy(HeavyTank x, Resources y,Timer z) {
        x.Add();
        y.decStock(ArtilleryP);
    }

    @Override
    public void demolish() {
        super.demolish(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Upgrade(Resources x,Timer y){
        x.decStock(Up);
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
