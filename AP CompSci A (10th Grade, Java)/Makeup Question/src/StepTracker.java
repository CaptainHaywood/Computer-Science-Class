import java.util.ArrayList;

public class StepTracker {
    private ArrayList<Integer> steps;
    private int daysActive;
    private int daysPast;

    public StepTracker(){
        steps = new ArrayList<Integer>();
        daysActive = 0;
        daysPast = 0;
    }

    public void addDailySteps(int toAdd){
        steps.add(toAdd);
        if (toAdd >= 10000){
            daysActive++;
        }
    }

    public int activeDays(){
        return daysActive;
    }

    public double averageSteps(){
        double days = steps.size();
        int iter = 0;
        double totalSteps = 0;
        while (iter < days){
            totalSteps = totalSteps + steps.get(iter);
            iter++;
        }
        if(steps.size() == 0){
            return 0.0;
        }
        else{
            return totalSteps / days;
        }
    }
}
