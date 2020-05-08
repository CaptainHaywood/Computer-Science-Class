import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Coaster rollerCoaster = new Coaster();
        String cmd = "";
        while(true){
            cmd = in.nextLine();
            Parser.parseCMD(cmd, rollerCoaster);
        }

    }
}
