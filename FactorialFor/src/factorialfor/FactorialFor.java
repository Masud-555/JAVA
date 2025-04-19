
package factorialfor;

import java.util.Scanner;


public class FactorialFor {

    
    public static void main(String[] args) {
       
        Scanner s = new Scanner(System.in);
        
        System.out.println("enter number");
        int input = s.nextInt();
        int factorial =1;
        
        
        for(int i = 1; i <= input; i++){
        
            factorial *= i;
        
        }
        System.out.println("factorial of "+ input +" is "+ factorial);
        
    }
    
}
