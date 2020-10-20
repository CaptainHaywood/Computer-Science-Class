import java.util.Arrays;

public class Driver {
    public static void main(String[] args) {
        int [] arr = new int[] {1,2,3,4,5,6,7,8,9,10};

        System.out.println(Arrays.toString(arr));

        Arrays.copyOf(arr, arr.length * 2);

        System.out.println(Arrays.toString(arr));

        System.arraycopy(arr, 1, arr, 2, 9);

        System.out.println(Arrays.toString(arr));
    }
}
