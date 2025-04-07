
package game;

import java.util.Scanner;


public class Game {

    
    public static void main(String[] args) {
        
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Choose Number");
        int input = s.nextInt();
        
        int randomNumber = (int)(Math.random()*10);
        
        if(input == randomNumber){
            System.out.println("you Are Win");
        }
        else{
            System.out.println("You Are Lose "+randomNumber);
        }
    }
    
}
