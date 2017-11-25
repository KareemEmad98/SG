
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Laboratory extends Buildings  implements iUpgrade,Serializable {
    final static int SniperUp=500;
    final static int RifleMan=500;
    final static int FlameThrower=500;
    final static int RocketSoldier=500;
    final static int Up=500;
    private ArrayList<Laboratory> laboratory;

    public void UpgradeSniper(Sniper x,Timer z) {
        x.Upgrade();
    }

    public void UpgradeRifleMan(RifleMan x,Timer z) {
        
        x.Upgrade();
        
    }

    public void UpgradeFlameThrower(FlameThrower x,Timer z) {
        x.Upgrade();
    }

    public void UpgradeRocketSoldier(RocketSoldier x,Timer z) {
        x.Upgrade();
    }
    @Override
    public void Upgrade(Resources y,Timer x){
        
        y.decStock(Up);
        
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