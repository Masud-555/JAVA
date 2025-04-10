package largnumusingmethods;

import java.util.Scanner;

public class LargNumUsingMethods {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("enter the number");

        int masud = s.nextInt();
        System.out.println("2nd num");
        int al = s.nextInt();
        String result = LargNumber(masud, al);
        System.out.println(result);

    }
    
    public static String LargNumber(int input, int input1){
        
        String abdullah;
        
        if (input > input1) {
            abdullah=input + " This is Large Number";
        } else {
             abdullah=input1 + " This is Large Number";
        }
        return abdullah;
    }

}
