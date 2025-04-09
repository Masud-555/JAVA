
package primenumber1;

import java.util.Scanner;


public class PrimeNumber1 {

    
    public static void main(String[] args) {
       
        
        Scanner p = new Scanner(System.in);
        
        System.out.println("Enter Number");
        int input = p.nextInt();
        int count = 0;
        
        for(int i = 1; i<=input; i++){
            if(input % i == 0 ){
                count++;
                
            }
        }
        if(count == 2){
            System.out.println("eita prime numbar");
        }
        else{
            System.out.println("eita prime numbar na");
        }
                
    }
    
}
