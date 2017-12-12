package Units;

public class Resources {

    static int Stock;

    public void incStock(int price) {
        Stock+=price;
    }

    public void decStock(int price) {
        Stock-=price;
    }
    public boolean GoldAvailable(int x){
        if((Stock-x)>=0)
            return true;
        else 
            return false;
        
    }

    public static int getStock() {
        return Stock;
    }

    public static void setStock(int Stock) {
        Resources.Stock = Stock;
    }

    public Resources() {
        setStock(4000);
    }
}
