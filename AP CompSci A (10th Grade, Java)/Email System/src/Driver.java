import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        UserList uList = new UserList();
        String command;
        System.out.println("[RobCo Command Line Electronic Mail System - ONLINE.]\n[(C) 2071, all rights reserved.]");
        System.out.println("Enter 'help' for command assistance.");
        while(true){
            System.out.print("mail:~#> ");
            command = in.nextLine();
            ParseCommand.parseCMD(command, uList);
        }
    }
}
