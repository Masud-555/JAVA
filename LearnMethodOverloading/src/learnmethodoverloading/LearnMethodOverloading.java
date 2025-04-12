
package learnmethodoverloading;

import java.util.Arrays;


public class LearnMethodOverloading {

   
    public static void main(String[] args) {
        
        sum(10);


            

        
    }
    
    public static int sum(){
        
        return 10+20;
    }
    public static int sum(int a){
        
        return 10+a;
    }
    public static int sum(int a, int b){
        
        return b+a;
    }
    public static void sum(int... a){
        
        System.out.println(Arrays.toString(a));
    }
    
}
