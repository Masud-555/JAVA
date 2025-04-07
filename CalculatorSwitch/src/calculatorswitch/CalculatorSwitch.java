
package calculatorswitch;

import java.util.Scanner;


public class CalculatorSwitch {

    
    public static void main(String[] args) {
       
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter Your 1st Number");
        double num1 = s.nextDouble();
        
        System.out.println("Enter Your 2nd number");
        double num2 = s.nextDouble();
        
        System.out.println("Enter your Choice likes : + - * /");
        String choice = s.next();
        
        double result = 0;
        
        switch (choice){
            case "+":
            result = num1+num2;
            
            break;
           
            case "-":
            result = num1-num2;
            
            break;
            
            case "*":
            result = num1*num2;
            
            break;
            
            case "/":
            result = num1/num2;
            
            break;
            default:
                System.out.println("Invalid Choise");
        }
        System.out.println("This is = "+result);
        
    }
    
}
