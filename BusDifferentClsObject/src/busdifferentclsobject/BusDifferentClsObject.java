
package busdifferentclsobject;


public class BusDifferentClsObject {

    
    public static void main(String[] args) {
        
       TourHouseBus bus = new TourHouseBus(0, 0, "toilets", 10,"Dinner" , true, 8, 41, 14, 2);
       
       
       
       bus.setFan(10);
        System.out.println(bus.lBus());
       
      
        
    }
    
}
