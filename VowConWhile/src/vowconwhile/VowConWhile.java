
package vowconwhile;

import java.util.Scanner;


public class VowConWhile {

   
    public static void main(String[] args) {
        
         Scanner vc = new Scanner(System.in);

        int count = 0;
        while (count < 3) {

            System.out.println("enter your Letter");
            String letter = vc.next();

            if (letter.equalsIgnoreCase("a") || letter.equalsIgnoreCase("e")
                    || letter.equalsIgnoreCase("i") || letter.equalsIgnoreCase("o")
                    || letter.equalsIgnoreCase("u")) {

                System.out.println(letter + " is Vowel");
                break;
            } 
            else {
                System.out.println(letter+" is Consonent");
                count++;
            }
        }
    }
    
}
