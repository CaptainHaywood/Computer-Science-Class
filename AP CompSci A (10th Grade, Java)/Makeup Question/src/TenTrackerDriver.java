import java.util.ArrayList;
import java.util.Scanner;

public class TenTrackerDriver {
    public static void main(String[] args) {
        StepTracker tr0 = new StepTracker();
        StepTracker tr1 = new StepTracker();
        StepTracker tr2 = new StepTracker();
        StepTracker tr3 = new StepTracker();
        StepTracker tr4 = new StepTracker();
        StepTracker tr5 = new StepTracker();
        StepTracker tr6 = new StepTracker();
        StepTracker tr7 = new StepTracker();
        StepTracker tr8 = new StepTracker();
        StepTracker tr9 = new StepTracker();
        ArrayList<StepTracker> trackers = new ArrayList<StepTracker>();
        trackers.add(tr0);
        trackers.add(tr1);
        trackers.add(tr2);
        trackers.add(tr3);
        trackers.add(tr4);
        trackers.add(tr5);
        trackers.add(tr6);
        trackers.add(tr7);
        trackers.add(tr8);
        trackers.add(tr9);

        Scanner in = new Scanner(System.in);

        while (true){
            System.out.println("Enter tracker #: (0-9)");
            int trackerNum = in.nextInt();
            Boolean done = false;
            while(!done){
                System.out.println("\nOperation? (T#: " + trackerNum + ")\n1 Add daily steps\n2 See average steps\n3 See active days\n4 Return to toplevel");
                int operation = in.nextInt();
                if(operation == 1){
                    System.out.println("\nStep count?");
                    int toAdd = in.nextInt();
                    trackers.get(trackerNum).addDailySteps(toAdd);
                }
                else if(operation == 2){
                    System.out.println("\n" + trackers.get(trackerNum).averageSteps());
                }
                else if(operation == 3){
                    System.out.println("\n" + trackers.get(trackerNum).activeDays());
                }
                else if(operation == 4){
                    System.out.println("\n");
                    done = true;
                }
                else{
                    System.out.println("\nInvalid operation!");
                }
            }

        }
    }

}
