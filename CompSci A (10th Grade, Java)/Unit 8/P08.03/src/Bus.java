import java.util.ArrayList;

public class Bus {
    int loc = 1;
    private ArrayList<Passenger> passList;

    public Bus(){
        passList = new ArrayList<Passenger>();
        int iter = 0;
        while(iter < 3){
            Passenger toAdd = new Passenger();
            passList.add(toAdd);
            iter++;
        }
    }

    public int getLoc(){
        return loc;
    }

    public void setLoc(int toSet){
        loc = toSet;
    }

    public void iterateSimulation(){
        int iter = 0;
        while(iter < 30){
            printStatus();
            loc++;
            for(Passenger p : passList){
                if (p.getStart() == loc){
                    p.setStatus('R');
                    p.setLoc(loc);
                }
                else if(p.getEnd() == loc){
                    p.setStatus('D');
                    p.setLoc(loc);
                }
                else if(p.getStatus() == 'R'){
                    p.setLoc(loc);
                }
            }
            iter++;
        }
    }

    public void printStatus(){
        System.out.println("Bus location: " + loc);
        int count = passList.size();
        int iter = 0;
        while(iter < count){
            System.out.println("P" + (iter+1) + ": " + passList.get(iter).getLoc() + ", " + passList.get(iter).getStatus());
            iter++;
        }
    }
}
