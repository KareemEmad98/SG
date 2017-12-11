package Units;

public  class Population {

   

    

   



    

    private int Pop;
    private int Total;
    
    public Population() {
       this.setPop(4);
       this.setTotal(20);
    }
    public int getPop() {
        return Pop;
    }

    public void setPop(int Pop) {
        this.Pop = Pop;
    }

    public int getTotal() {
        return Total;
    }

    public void setTotal(int Total) {
        this.Total = Total;
    }

   

    public void incTotal(int x) {
        Total+=x;
    }

    public void decTotal(int x) {
        Total-=x;
    }
    public void incPop(int x){
        Pop+=x;
    }
    public void decPop(int x){
        Pop-=x;
    }
    public int count(){
        
        return 1;
    }
    public boolean housingAvailable(int x){
    if((Total-Pop)>=x)
        return true;
    else 
        return false;
    
    }
}
