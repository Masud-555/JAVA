
package game2;

import java.util.Scanner;


public class Game2 {

    
    public static void main(String[] args) {
       
        Scanner g = new Scanner(System.in);
        
        System.out.println("Tmr chal deo");
        int chal = g.nextInt();
        
        int randomChal = (int)(Math.random()*10);
        
        if(chal == randomChal){
            System.out.println("Tmi Jite Gecho");
        }
        else{
            System.out.println("Tmi Here Gecho "+randomChal);
        }
        
    }
    
}
