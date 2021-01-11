import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        int num = in.nextInt();
        for(int i = 1; i < num + 1; i++){
            System.out.println("\n\t@Test\n\tpublic void " + name + "0" + i + "(){" + "\n\t\tAssertions.assertEquals(\"[One, Two]\", sll.toString());\n\t}");
        }
    }
}
