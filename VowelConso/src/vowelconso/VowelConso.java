
package vowelconso;

import java.util.Scanner;


public class VowelConso {

   
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter Latter");
        char letter = s.next().charAt(0);
        
        
        if(letter == 'a' || letter == 'A'|| letter == 'e' || letter == 'E' || letter == 'i' 
                || letter == 'I' || letter == 'o' || letter == 'u' || letter == 'O'){
          
         System.out.println(letter+" is Vowel");
        }
        else if(letter =='a' && letter=='z' && letter=='A' && letter =='Z'){
            System.out.println(letter+" is Consonent");
        }
                else{
                        System.err.println(letter+" is not a Letter");
                        }
                
    }
    
}
