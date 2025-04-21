package clastestforexam;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSotClsTest {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter the size");
        int size = s.nextInt();

        int[] myArrays = new int[size];

        for (int i = 0; i < myArrays.length; i++) {
            System.out.println("Enter number " + (i + 1));
            int userInput = s.nextInt();
            myArrays[i] = userInput;

        }
        System.out.println("Before sorting "+Arrays.toString(myArrays));
        System.out.println("--------------------------");

        for (int round = 0; round < myArrays.length - 1; round++) {
            for (int step = 0; step < myArrays.length - round - 1; step++) {

                if (myArrays[step] > myArrays[step + 1]) {

                    int temp = myArrays[step];
                    myArrays[step] = myArrays[step + 1];
                    myArrays[step + 1] = temp;

                }
            }

        }

        System.out.println("After sorting "+Arrays.toString(myArrays));
        
        
    }

}
