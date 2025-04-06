
package classtask;

import java.util.Scanner;


public class ClassTask {

    
    public static void main(String[] args) {
       
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter Redious Number");
        
        float rediousvalue = input.nextFloat(); 
        
        
        if(rediousvalue>0){
            double result= Math.PI*Math.pow(rediousvalue, 2);
            System.out.println(result);
        }
        else{
            
            System.err.println("0 or Nagative Number");
        }
        
        System.out.println("Enter Positive Redious Number");
        
        float positiveRedious= input.nextFloat();
        
        if(positiveRedious>0){
            double result1= Math.PI*Math.pow(positiveRedious, 2);
            System.out.println(result1);
        }
        
    }
    
}
