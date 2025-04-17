
package logicaltest;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;


public class LogicalTest {

   
    public static void main(String[] args) {
       
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter size");
        int size = s.nextInt();
                
        int[] numbers = new int[size];
        
         int maxNumber = numbers[0];
        int minNumber = numbers[0];
        
                
        for(int index = 0; index < size; index++){
        
            System.out.println("Enter Number "+(index+1));
            int userInput = s.nextInt();
            numbers[index] = userInput;
        
        }
        
        System.out.println("My Numbers are "+Arrays.toString(numbers));
        
       for(int number : numbers){
       
       if(number > maxNumber){
           maxNumber=number;
       }
       
       if(number < minNumber){
       
           minNumber = number;
       }
           
       }
       
        System.out.println("Max Number is " + maxNumber);
        System.out.println("Min Number is " + minNumber);
        
    }
    
}
