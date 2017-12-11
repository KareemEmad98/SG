package Units;


import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

public abstract class Buildings  extends Unit {

    
    public void deploy(Resources r,Population p,Timer t){
    }
    public void setProp(){
    this.Prop=new JPanel();
        Prop.setLayout(new FlowLayout());
        
        //bar[0].setIcon(new ImageIcon(x));
        bar[1]=new JLabel(this.getName());
        bar[2]=new JLabel("HP: "+this.getHealth()+"/"+this.getMaxHealth());
        bar[3]=new JLabel("Armor: "+this.getArmor());
        if(this.getIsUpgraded()==true)
            bar[4]=new JLabel("Upgraded: Yes");
        else
            bar[4]=new JLabel("Upgraded: No");
        this.Prop.add(bar[0]);
        this.Prop.add(bar[1]);
        this.Prop.add(bar[2]);
        this.Prop.add(bar[3]);
        this.Prop.add(bar[4]);
        
    }
}
