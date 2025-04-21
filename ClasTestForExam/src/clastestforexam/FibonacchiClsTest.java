package clastestforexam;

import java.util.Scanner;

public class FibonacchiClsTest {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("enter limit");
        int limit = s.nextInt();

        int num1 = 0;
        int num2 = 1;
        int sum = 0;

        System.out.println(num1);
        System.out.println(num2);

        for (int indx = 3; indx < limit; indx++) {
            sum = num1 + num2;
            System.out.println(sum);

            num1 = num2;
            num2 = sum;

        }

    }

}
