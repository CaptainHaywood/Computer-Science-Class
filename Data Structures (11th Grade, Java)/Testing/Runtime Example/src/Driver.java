public class Driver {
    public static void main(String[] args) {

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
}
