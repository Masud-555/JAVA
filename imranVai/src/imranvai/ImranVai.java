
package imranvai;

import java.util.Scanner;


public class ImranVai {

    
    public static void main(String[] args) {
       
          Scanner masud = new Scanner(System.in);
            
            System.out.println("Enter redius value");
            float rediusValue = masud.nextFloat();
            
            float result = (float)(rediusValue*rediusValue)*3.1416f;
            
            System.out.println("The Result is "+ result);
    }
    
}
