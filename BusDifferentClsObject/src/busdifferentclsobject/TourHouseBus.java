
package busdifferentclsobject;


public class TourHouseBus extends localBus {
    
    
    private int light;
    private int ac;
    private String washroom;
    private int bed;
    private String table;

    public TourHouseBus() {
    }

    public TourHouseBus(int light, int ac, String washroom, int bed, String table) {
        this.light = light;
        this.ac = ac;
        this.washroom = washroom;
        this.bed = bed;
        this.table = table;
    }

    public TourHouseBus(int light, int ac, String washroom, int bed, String table, boolean body, int wheel, int seat, int fan, int breck) {
        super(body, wheel, seat, fan, breck);
        this.light = light;
        this.ac = ac;
        this.washroom = washroom;
        this.bed = bed;
        this.table = table;
    }

    public int getLight() {
        return light;
    }

    public void setLight(int light) {
        this.light = light;
    }

    public int getAc() {
        return ac;
    }

    public void setAc(int ac) {
        this.ac = ac;
    }

    public String getWashroom() {
        return washroom;
    }

    public void setWashroom(String washroom) {
        this.washroom = washroom;
    }

    public int getBed() {
        return bed;
    }

    public void setBed(int bed) {
        this.bed = bed;
    }

    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }
    
     public String lBus(){
    
     String bus = "Body="+body+"\n"+"Wheel="+wheel+"\n"+"Seat="+seat+"\n"+"fan="+fan+"\n"+"Breck="+breck;
     
     return bus;
    }
    
}
