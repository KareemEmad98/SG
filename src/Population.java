public  class Population {

   

    

   



    

    private int Pop=0;
    private int Total=0;

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
}
