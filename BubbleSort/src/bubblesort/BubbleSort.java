
package bubblesort;

import java.util.Arrays;
import java.util.Scanner;


public class BubbleSort {

    
    public static void main(String[] args) {
        
         Scanner s = new Scanner(System.in);
        System.out.println("Enter Size");
        int size = s.nextInt();
        int[] myArrays = new int[size];
        
        for(int i =0; i < myArrays.length; i++){
            System.out.println("Enter Number "+(i+1));
            int userInput = s.nextInt();
            myArrays[i]= userInput;
        }
        
        System.out.println("Befor sorting "+Arrays.toString(myArrays));
        System.out.println("------------------");
        
        for(int r = 0; r < myArrays.length-1; r++){
            
            for(int st =0; st < myArrays.length - r - 1; st++){
                
                if(myArrays[st] > myArrays[st+1]){
                    
                    int temp = myArrays[st];
                    myArrays[st] = myArrays[st+1];
                    myArrays[st+1]= temp;
                }
           }
        }
        
        System.out.println("After sorting "+Arrays.toString(myArrays));
        
        
    }
    
}
