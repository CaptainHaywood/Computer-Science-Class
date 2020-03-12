import java.util.Arrays;
import java.util.Random;

public class ArrayDriver {
    public static void main(String[] args) {
        DataSet ds = new DataSet();
        ds.add(1);
        ds.add(2);
        ds.add(2);
        ds.add(3);
        ds.add(3);
        ds.add(3);
        ds.add(3);
        ds.add(4);

        System.out.println(ds.getMin()); // prints 1
        System.out.println(ds.getMax()); // prints 4
        System.out.println(ds.getRange()); // prints 3
        System.out.println(ds.getMedian()); // prints 3.0
        System.out.println(ds.getFrequency(2)); // prints 2
        System.out.println(ds.getMaxFrequency()); // prints 4
        System.out.println(ds.hasMode()); // prints true
        System.out.println(Arrays.toString(ds.getMode())); // prints [3, 0, 0]
    }
}
