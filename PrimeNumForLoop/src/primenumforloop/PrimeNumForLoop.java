
package primenumforloop;

import java.util.Scanner;


public class PrimeNumForLoop {

    
    public static void main(String[] args) {
       
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Ente number");
        int input = s.nextInt();
        int count = 0;
        
        for(int i = 1; i <= input ; i++){
            if(input % i ==0){
                count++;
            }
        }
        
        if(count == 2){
            System.out.println(input+" Is Prime Number");
        }
        else{
            System.out.println(input+" Is Not Prime Number");
        }
    }
    
}
