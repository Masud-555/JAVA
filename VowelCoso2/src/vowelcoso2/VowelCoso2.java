package vowelcoso2;

import java.util.Scanner;

public class VowelCoso2 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter Latter");
        char letter = s.next().toLowerCase().charAt(0);

        if (letter == 'a' || letter == 'e' || letter == 'i'
                || letter == 'o' || letter == 'u') {

            System.out.println(letter + " is Vowel");
        } else if (letter >= 'a' && letter <= 'z') {
            System.out.println(letter + " is Consonent");
        } else {
            System.err.println(letter + " is not right Letter");
        }

    }

}
