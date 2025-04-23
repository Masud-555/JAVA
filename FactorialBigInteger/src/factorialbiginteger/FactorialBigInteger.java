
package factorialbiginteger;

import java.math.BigInteger;
import java.util.Scanner;


public class FactorialBigInteger {

    
    public static void main(String[] args) {
       
                Scanner s = new Scanner(System.in);
        
        System.out.println("enter number");
        int input = s.nextInt();
        
        BigInteger factorial =BigInteger.ONE;
        
        
        for(int i = 1; i <= input; i++){
        
         factorial = factorial.multiply(BigInteger.valueOf(i));
        
        }
        System.out.println( factorial); 
        
    }
    
    
    
    
}
