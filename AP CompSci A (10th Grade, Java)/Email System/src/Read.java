import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Read {

    public static void readMessages(User toAccess){

        Scanner in = new Scanner(System.in);
        Boolean done = false;
        while (!done) {
            System.out.println("What would you like to do, " + toAccess.getName() + "?");
            System.out.println("1. Access inbox\n2. Access outbox\n3. Clear boxes\n4. Log out");
            System.out.print(toAccess.getName() + "@mail:~$> ");
            int option = in.nextInt();
            if(option == 1){
                ArrayList<Message> messages = toAccess.getMessages();
                int messageCount = messages.size();
                int iter = 0;
                System.out.println("[INBOX FOR: " + toAccess.getName() + "]");
                while(iter < messageCount){
                    System.out.println(messages.get(iter).toString());
                    iter++;
                }
                if(messageCount == 0){
                    System.out.println("No messages.");
                }
                System.out.println("[END OF INBOX]");
            }
            else if(option == 2){
                ArrayList<Message> messages = toAccess.getOutbox();
                int messageCount = messages.size();
                int iter = 0;
                System.out.println("[OUTBOX FOR: " + toAccess.getName() + "]");
                while(iter < messageCount){
                    System.out.println(messages.get(iter).toString2());
                    iter++;
                }
                if(messageCount == 0){
                    System.out.println("No sent messages.");
                }
                System.out.println("[END OF OUTBOX]");
            }
            else if(option == 3){
                System.out.println("Inbox and Outbox for " + toAccess.getName() + " cleared.");
                toAccess.clearBoxes();
            }
            else if(option == 4){
                System.out.println("Logging out.");
                done = true;
            }
            else{
                System.out.println("Invalid option.");
            }
        }


    }

}
