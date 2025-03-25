package userscanner2;

import java.util.Scanner;

public class UserScanner2 {

       public static void main(String[] args) {
           
           Scanner input = new Scanner(System.in);
           System.out.println("Enter Your 1st Number");
           int number1 = input.nextInt();
           System.out.println("Enter Your 2nd Number");
           int number2 = input.nextInt();
           
           float result = (float) number1 / number2;
           System.out.println("This is the Number "+result );            
    }
    
}
