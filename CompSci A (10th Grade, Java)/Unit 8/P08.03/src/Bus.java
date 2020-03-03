import java.util.ArrayList;

public class Bus {
    int loc = 1;
    private ArrayList<Passenger> passList;

    public int getLoc(){
        return loc;
    }

    public void setLoc(int toSet){
        loc = toSet;
    }

    public void iterateSimulation(){
        loc++;

    }
}
