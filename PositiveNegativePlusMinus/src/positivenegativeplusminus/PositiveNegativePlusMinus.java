
package positivenegativeplusminus;

import java.util.Scanner;


public class PositiveNegativePlusMinus {

    
    public static void main(String[] args) {
       
        Scanner s= new Scanner(System.in);
        
        
        
        int sum =0;
        
        while(true){
        System.out.println("Enter Number");
        int numbers = s.nextInt();
        
        if(numbers <0){
        
        break;
        }
        else{
        sum += numbers;
        }
        
        }
        
        System.out.println("the sum of the integer number "+ sum);
        
    }
    
}
