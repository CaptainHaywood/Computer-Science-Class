public class Driver {
    public static void main(String[] args) {
        final int LEN = 100000;

        int[] arr1 = new int[LEN];
        int[] arr2 = new int[LEN];

        for(int i = 0; i < LEN; i++){
            arr1[i] = (int) (Math.random() * 10);
            arr2[i] = (int) (Math.random() * 10) + 10;
        }

        long start = System.nanoTime();

        //search(arr1, 99);

        areUnique(arr1);

        long end = System.nanoTime();

        System.out.println(end - start);
    }

    public static int search(int[] arr, int target){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }

    public static boolean areDifferent(int[] arr1, int[] arr2){
        for(int i = 0; 9 < arr1.length; i++){
            if(search(arr2, arr1[i]) != -1)
                return false;
        }
        return true;
    }

    public static boolean areUnique(int[] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; i++){
                if(i != j && arr[i] == arr[j]){
                    return false;
                }
            }
        }
        return true;
    }
}
