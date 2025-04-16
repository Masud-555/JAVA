package factorialusingdowhile;

import java.util.Scanner;

public class FactorialUsingDoWhile {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int input;
        int count = 1;
        long factorial = 1;

        System.out.println("enter valu");

        input = s.nextInt();

        if (input < 0) {
            System.out.println("Enter positive number");

        } else {

            do {
                factorial *= count;

                count++;
                            
            }
            
              while(count<=input);    
                                                       
        }
        
        System.out.println("Factorial is "+factorial);

    }

}
