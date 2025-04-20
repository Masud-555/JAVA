
package maxminnumclstest;

import java.util.Arrays;
import java.util.Scanner;


public class MaxMinNumClsTest {

    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter the size");
        int size = s.nextInt();
        
        int[] numbers = new int[size];
        
        for(int i = 0; i < numbers.length; i++){
            System.out.println("Enter number " + (i+1));
            int userInput = s.nextInt();
            numbers[i] = userInput;
        
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println("--------------------------");
        
       int maxNumber = numbers[0];
       int minNumber = numbers[0];
       
       for( int number : numbers){
           if(number > maxNumber){
               maxNumber=number;
           
           }
           if(number < minNumber) {
               minNumber=number;
           
           }
       
       }
        System.out.println("Max number is " + maxNumber);
        System.out.println("Min number is " + minNumber);

        
        
    }
    
}
