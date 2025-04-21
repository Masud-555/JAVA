package clastestforexam;

import java.util.Scanner;

public class FibonacchiClsTest {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("enter limit");
        int limit = s.nextInt();

        int num1 = 0;
        int num2 = 1;
      
        for (int indx = 1; indx <= limit; indx++) {
            int num3= num1+ num2;
            System.out.print(num1+ ", ");
            
            num1=num2;
            num2=num3;

        }

    }

}
