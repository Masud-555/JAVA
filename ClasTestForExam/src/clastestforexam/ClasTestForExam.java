
package clastestforexam;

import java.util.Scanner;


public class ClasTestForExam {

    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("enter price ");
        float price = s.nextFloat();
        
        double discount = 0.05;
        double sum ;
        
        if(price > 200){
            sum = price *discount;
            price -=sum;
            
            System.out.println("your amount "+price);
            System.out.println("your discount " + sum);
        }
        else{
            System.out.println("your amount "+price);
            System.out.println("your dont get any taka");
            
        }
        
    }
    
}
