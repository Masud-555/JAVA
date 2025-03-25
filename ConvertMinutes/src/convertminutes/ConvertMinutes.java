
package convertminutes;

import java.util.Scanner;

public class ConvertMinutes {

        public static void main(String[] args) {
        
            Scanner input = new Scanner(System.in);
            
            System.out.println("Enter seconds");
            
            int totalSeconds =input.nextInt();
            
            int hours = totalSeconds / 3600;
            int remainingSeconds = totalSeconds % 3600;
           
            int min = remainingSeconds / 60; 
            int sec = remainingSeconds %60;
            
            System.out.println(totalSeconds + " seconds = " + hours + " Hours " + min + " Minutes "+ sec +" seconds" );
            
            
                                  
    }
    
}
