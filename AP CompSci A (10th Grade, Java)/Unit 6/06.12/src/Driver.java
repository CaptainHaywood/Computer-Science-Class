import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        boolean done = false;
        int level = 1;
        while(!done){
            int len = str.length();
            int count = 0;
            int tempLevel = 0;

            while(count != len - level + 1){
                if(count + level > len){
                    tempLevel = len;
                }
                else{
                    tempLevel = level;
                }
                System.out.println(str.substring(count, count + tempLevel));
                count++;
            }

            level++;
            if (level > len){
                done = true;
            }
        }
    }
}
