package vowconsir;

import java.util.Scanner;

public class VowConSir {

    public static void main(String[] args) {

        Scanner vc = new Scanner(System.in);
        
        System.out.println("enter your Letter");
            String letter = vc.next();

            if (letter.equalsIgnoreCase("a") || letter.equalsIgnoreCase("e")
                    || letter.equalsIgnoreCase("i") || letter.equalsIgnoreCase("o")
                    || letter.equalsIgnoreCase("u")) {

                System.out.println(letter + " is Vowel");
                
            } 
            else {
                System.out.println(letter+" is Consonent");
            }
    }

}
