import java.lang.reflect.Array;
import java.util.ArrayList;

public class APDriver {

    public static void main(String[] args) {
        sitterList.add("Joe");
        sitterList.add("M");
    }
    public void addNewSitters(String[] names){
        int iter = 0;
        int length = names.length;
        while(iter < length){
            if (sitterList.contains(names[iter])){
                iter++;
            }
            else if(!sitterList.contains(names[iter])){
                Babysitter toAdd = new Babysitter(names[iter], 0);
                iter++;
            }
        }
    }
    public ArrayList<String> affordableSitters(double budget, int numChildren, int hours){
       ArrayList<String> affSitters = new ArrayList<String>();
       int iter = 0;
       int length = sitterList.size();
       while(iter < length){
           Babysitter sitter = sitterList.get(iter);
           int totalCharge = 0;
           int hourlyCharge = 2 + sitter.getYears();
           if(hourlyCharge>6){hourlyCharge=6;}
           totalCharge = 6 * hours;
           totalCharge = totalCharge * numChildren;
           if(totalCharge<=budget){
               affSitters.add(sitter);
           }
           iter++;
        }
    }
}
