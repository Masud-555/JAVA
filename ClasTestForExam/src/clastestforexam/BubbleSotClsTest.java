
package clastestforexam;

import java.util.Arrays;
import java.util.Scanner;


public class BubbleSotClsTest {
    
    
     public static void main(String[] args) {
     
     Scanner s = new Scanner(System.in);
     
              
        System.out.println("Enter the size");
        int size = s.nextInt();
        
        int[] myArrays = new int[size];
        
        for(int i = 0; i < myArrays.length; i++){
            System.out.println("Enter number " + (i+1));
            int userInput = s.nextInt();
            myArrays[i] = userInput;
        
        }
        System.out.println(Arrays.toString(myArrays));
        System.out.println("--------------------------");
        
        
        for(int m =0; m <myArrays.length-1; m++){
        for(int a = 0; a < myArrays.length-m-1; a++){
         if(myArrays[m]>myArrays[m+1]){
             
         int temp = myArrays[m];
         myArrays[m]= myArrays[m+1];
         myArrays[m+1]= temp;
         
         }
        }
        
        }
     
     }
    
}
