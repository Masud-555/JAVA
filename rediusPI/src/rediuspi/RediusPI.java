
package rediuspi;

import java.util.Scanner;


public class RediusPI {

    
    public static void main(String[] args) {
      
       Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        
        int radius = input.nextInt();
//        final float PI = 3.1416f;
//        float result= PI * (radius*radius);

// System.out.println("The Result is "+ result);

double result= Math.PI*Math.pow(radius, 2);
        System.out.println(result);
    }
    
}
