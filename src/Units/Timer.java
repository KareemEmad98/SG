package Units;


import java.util.TimerTask;




public class Timer {

     int seconds=0;
     boolean done = true;
        java.util.Timer timer=new java.util.Timer();
        TimerTask x=new TimerTask(){
            
            public  void run(){
                seconds++;
                System.out.println(seconds);
                if(seconds==10)
                {
                    this.cancel();
                }
            }
        };
        public void start(int time){
        timer.scheduleAtFixedRate(x, 1000, 1000);
        }
    
            
    
    public void waStopit(int x){
        
        
    }
}
