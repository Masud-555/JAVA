
package evenoddusingmethods;

import java.util.Scanner;


public class EvenOddUsingMethods {

    
    public static void main(String[] args) {
        
        
        Scanner s = new Scanner(System.in);
        
        
        System.out.println("Enter the number ");
        
        int userInput =s.nextInt();
        
        String result = EvenOddNumber(userInput);
        
        System.out.println(result);
       
        
        
    }
    
    public static String EvenOddNumber(int input){
        
        String masud ;
        
         if(input % 2 == 0){
             
             masud = input + " is a Even number. ";
            
        }
        else{
            masud = input + " is a Odd number. ";
        }
         
         return masud;
    }
    
}
