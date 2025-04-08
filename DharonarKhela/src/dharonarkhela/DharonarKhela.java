
package dharonarkhela;

import java.util.Scanner;


public class DharonarKhela {

    
    public static void main(String[] args) {
       
        Scanner k = new Scanner(System.in);
        int randomNumber = (int)(Math.random()*10);
        int count = 0;
        
        while (count < 3){
            
            System.out.println("tmr dhoronar number deo");
            int chal = k.nextInt();
            
            if(chal == randomNumber){
                System.out.println("tmi jite gecho " +randomNumber);
                break;
            }
            else{
                System.err.println("tmi here gecho " +randomNumber);
                count++;
                
                 if(chal >randomNumber){
                System.err.println("tmi boro chal diso "+chal);
            }
                 else{
                     System.err.println("tmi choto chal diso "+chal);
                 }
            }
           
            
        }
        
    }
    
}
