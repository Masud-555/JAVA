
package clastestforexam;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;


public class MaxMinNumClsTest {
    
    
    public static void main(String[] args) {
        
    
     Scanner s = new Scanner(System.in);
     
        System.out.println("Enter the number");
        int size = s.nextInt();
        int[] num = new int[size];
        
        for( int i = 0; i < num.length; i++){
            System.out.println("Enter Number " + (i+1));
            int userInput = s.nextInt();
            num[i] = userInput;
        }
    
        System.out.println(Arrays.toString(num));
        System.out.println("---------------");
        
        int maxNumber = num[0];
        int minNumber = num[0];
        
        for(int number : num){
        
            if(number > maxNumber){
            maxNumber = number;
            }
            
             if(number < minNumber){
            minNumber = number;
            }
            
        } 
        
         System.out.println("Max number is " + maxNumber);
        System.out.println("Min number is " + minNumber);
        
    }
    
}
