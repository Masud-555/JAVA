
package positivenegativeplusminusexam;

import java.util.Scanner;


public class PosiNegaPluMinuAI {
    
    
      public static void main(String[] args) {
      
        

      Scanner s = new Scanner(System.in);
        int sum = 0;
        int numbers;

        while (true) {
            System.out.println("Enter Number");
            numbers = s.nextInt();
            if (numbers < 0) {
                break; // Stop when negative number is entered
            }
            sum += numbers; // Add non-negative number to sum
        }

        System.out.println("Sum of numbers: " + sum);
        System.out.println("Sum minus last number: " + (sum + numbers));  


          
      }
    
}
