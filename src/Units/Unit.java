package Units;


import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Rectangle;
import javax.swing.JLabel;
import javax.swing.JPanel;

public abstract class Unit {

    private int health;
    private int MaxHealth;
    private int createTime;
    private String name;
    private int price;
    private int UpPrice;
    private int UpTime;
    private int Pop;
    private int armor;
    private boolean isUpgraded;
    private static int countDeath;
    protected JPanel Prop;
    protected JLabel[] bar=new JLabel[8];
    private int SizeX;
    private int SizeY;
    private Dimension D=new Dimension(SizeX,SizeY); 
    private Rectangle Rect=new Rectangle(D);

   
    

    public JLabel[] getBar() {
        return bar;
    }

    public void setBar(JLabel[] bar) {
        this.bar = bar;
    }

    

    public Rectangle getRect() {
        return Rect;
    }

    public void setRect(Rectangle Rect) {
        this.Rect = Rect;
    }
   

    public int getSizeX() {
        return SizeX;
    }

    public void setSizeX(int SizeX) {
        this.SizeX = SizeX;
    }

    public int getSizeY() {
        return SizeY;
    }

    public void setSizeY(int SizeY) {
        this.SizeY = SizeY;
    }
    
    

    public int getPop() {
        return Pop;
    }

    public void setPop(int Pop) {
        this.Pop = Pop;
    }

    public int getUpTime() {
        return UpTime;
    }

    public void setUpTime(int UpTime) {
        this.UpTime = UpTime;
    }
    

    public int getUpPrice() {
        return UpPrice;
    }

    public void setUpPrice(int UpPrice) {
        this.UpPrice = UpPrice;
    }
    public int getMaxHealth() {
        return MaxHealth;
    }

    public void setMaxHealth(int MaxHealth) {
        this.MaxHealth = MaxHealth;
    }
    
    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getCreateTime() {
        return createTime;
    }

    public void setCreateTime(int createTime) {
        this.createTime = createTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public boolean getIsUpgraded() {
        return isUpgraded;
    }

    public void setIsUpgraded(boolean isUpgraded) {
        this.isUpgraded = isUpgraded;
    }

    public static int getCountDeath() {
        return countDeath;
    }

    public static void setCountDeath(int countDeath) {
        Unit.countDeath = countDeath;
    }

   

    
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
   

    public void setProp(String x){};
        
        
       
    
    public  void Remove(Population p){}
    public  void Remove(){};

    public  void underAttack(){};
    
   
    public  void Add(){};
    

    public  void Upgrade(){};
       
    
   
}
