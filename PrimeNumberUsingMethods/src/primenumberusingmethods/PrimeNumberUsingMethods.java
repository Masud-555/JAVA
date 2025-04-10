
package primenumberusingmethods;

import java.util.Scanner;


public class PrimeNumberUsingMethods {

    
    public static void main(String[] args) {
       
           
        Scanner s = new Scanner(System.in);
        
        
        System.out.println("Enter the number ");
        
        int userInput =s.nextInt();
        
        String result =PrimeNumber(userInput);
        
        System.out.println(result);
        
        
        
     }
   
    public static String PrimeNumber(int input){
        
        String prime;
        
        int count = 0;
        
        for(int i = 1; i<=input; i++){
            if(input % i == 0 ){
                count++;
                
            }
        }
        if(count == 2){
            prime = input + " is a Prime number. ";
        }
        else{
            prime = input + " is a not Prime number. ";
        }
        
        return prime;
    }
    
    
}
