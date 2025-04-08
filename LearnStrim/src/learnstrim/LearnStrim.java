
package learnstrim;

import java.util.Scanner;


public class LearnStrim {

    
    public static void main(String[] args) {
       
        
//        String message="Welcome to Jave";
//        
//        
//        System.out.println("Length = "+ message.length());
//        System.out.println("Char AT = " + message.charAt(5));
//         System.out.println("Concat = " + message.concat("Masud"));
//          System.out.println("Upper Case = " + message.toUpperCase());
//          System.out.println("Lower Case = " + message.toLowerCase());
//          System.out.println("Trim = " + message.trim());

//        Scanner n = new Scanner(System.in);
//        
//        System.out.println("enter your name");
//        String message=n.next();
//        
//        System.out.println("OutPut = " + message.concat(" Programmer "));
                
             Scanner n = new Scanner(System.in);
             
              System.out.println("enter your year");
        String year=n.next();
        
         System.out.println("enter your month");
        String month=n.next();
        
         System.out.println("enter your date");
        String date=n.next();
        
//        System.out.println("OutPut = "+month.concat(" "+ month + date +" , "+ year));

System.out.println("OutPut = " + month.concat("  ").concat(date).concat(" , ").concat(year));
             
    }
    
}
