
package primenumber;

import java.util.Scanner;


public class PrimeNumber {

   
    public static void main(String[] args) {
       
        Scanner prm = new Scanner(System.in);
        
        System.out.println("enter input");
        float input = prm.nextFloat();
        
        
        
        if(input % 1 ==0 && input % input == 0){
            System.out.println(input+" is prime number");
        }
        else{
            System.out.println(input+" is not prime number");
        }
        
    }
    
}
