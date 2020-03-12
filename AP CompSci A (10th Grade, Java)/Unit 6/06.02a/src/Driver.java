public class Driver {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        int num = 2;
        while (count != 50){
            sum = sum + num;
            num++;
            num++;
            count++;
        }
        System.out.println(sum);
    }
}
