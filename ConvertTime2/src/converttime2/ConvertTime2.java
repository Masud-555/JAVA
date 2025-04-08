

package converttime2;

import java.util.Scanner;


public class ConvertTime2 {

    
    public static void main(String[] args) {
        
        Scanner t = new Scanner(System.in);
        
        System.out.println("koto second dite chaw?");
        int totalSecond = t.nextInt();
        
        int ghonta = totalSecond / 3600;
        int bakiSecond = totalSecond % 3600;
        
        int min = bakiSecond / 60;
        int sec = bakiSecond % 60;
        
        System.out.println(totalSecond + " Seconds = " + ghonta + " Ghonta " + min + " min " + sec + " sec ");
        
    }
    
}
