package Units;


import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Rectangle;
import javax.swing.JLabel;
import javax.swing.JPanel;

public abstract class Army extends Unit {

    private int baseDamage;

    private int attackSpeed;
    

    public int getBaseDamage() {
        return baseDamage;
    }

    public void setBaseDamage(int baseDamage) {
        this.baseDamage = baseDamage;
    }

    public int getAttackSpeed() {
        return attackSpeed;
    }

    public void setAttackSpeed(int attackSpeed) {
        this.attackSpeed = attackSpeed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    private int speed;
    

    public void Attack(Unit x) {
    }

    public void Move() {
    }
    @Override
    public void setProp(String y){
    this.Prop=new JPanel();
        Prop.setLayout(new FlowLayout());
        
        //bar[0].setIcon(new ImageIcon(x));
        bar[1]=new JLabel(this.getName());
        bar[2]=new JLabel("HP: "+this.getHealth()+"/"+this.getMaxHealth());
        bar[3]=new JLabel("Armor: "+this.getArmor());
        bar[4]=new JLabel("Base-Damage: "+this.getBaseDamage());
        bar[5]=new JLabel("Speed: "+this.getSpeed());
        bar[6]=new JLabel("Attack-Speed: "+this.getAttackSpeed());
        if(this.getIsUpgraded()==true)
            bar[7]=new JLabel("Upgraded: Yes");
        else
            bar[7]=new JLabel("Upgraded: No");
        this.Prop.add(bar[0]);
        this.Prop.add(bar[1]);
        this.Prop.add(bar[2]);
        this.Prop.add(bar[3]);
        this.Prop.add(bar[4]);
        this.Prop.add(bar[5]);
        this.Prop.add(bar[6]);
    
    }
    
    
  
}
