
package userscanner;


import java.util.Scanner;


public class UserScanner {

    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your First Number");
        int number1=input.nextInt();
         System.out.println("Enter Your second Number");
        int number2=input.nextInt();
        
        float result=(float) number1 / number2;
        System.out.println("This is a result "+result);
        
    }
    
}
