package classtask2;

import java.util.Scanner;

public class ClassTask2 {

    public static void main(String[] args) {

        Scanner mas = new Scanner(System.in);

        System.out.println("Enter Your Number");

        float input = mas.nextFloat();

        if (input <= 0) {

            System.err.println("is wrong Number");

            System.out.println("Enter right Number");
            float posValue = mas.nextFloat();

            if (posValue > 0) {
                System.out.println("The result: " + Math.PI * Math.pow(posValue, 2));
            }

        } else {
            System.out.println("The result: " + Math.PI * Math.pow(input, 2));
        }

    }

}
