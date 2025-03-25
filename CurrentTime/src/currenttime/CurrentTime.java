
package currenttime;


public class CurrentTime {

  
    public static void main(String[] args) {
        
        long time=System.currentTimeMillis();
        System.out.println(time);
        
        long totalSeconds=time/1000;
        
        long hours=totalSeconds / 3600;
       long remainingSeconds = totalSeconds % 3600;
        
        long min = remainingSeconds / 60; 
            long sec = remainingSeconds %60;
            
            long currentHours=((hours+6) % 24);
            
         System.out.println(currentHours + " Hours " + min + " Minutes "+ sec +" seconds" );
    }
    
}
