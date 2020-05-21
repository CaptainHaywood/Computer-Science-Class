import java.util.ArrayList;

public class TestDriver {
    public static void main(String[] args) {
        StepTracker tr = new StepTracker();
        System.out.println(tr.activeDays());
        System.out.println(tr.averageSteps());
        System.out.println("---");
        tr.addDailySteps(9000);
        tr.addDailySteps(5000);
        System.out.println(tr.activeDays());
        System.out.println(tr.averageSteps());
        System.out.println("---");
        tr.addDailySteps(13000);
        System.out.println(tr.activeDays());
        System.out.println(tr.averageSteps());
        System.out.println("---");
        tr.addDailySteps(23000);
        tr.addDailySteps(1111);
        System.out.println(tr.activeDays());
        System.out.println(tr.averageSteps());
    }
}
