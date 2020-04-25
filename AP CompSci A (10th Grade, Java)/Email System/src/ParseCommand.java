import java.lang.reflect.Array;
import java.util.ArrayList;

public class ParseCommand {
    public static void parseCMD(String command, UserList list){
        ArrayList<User> userList = list.getList();
        int userCount = userList.size();
        String[] split = command.split(" ", 4);
        String action = split[0];

        //SEND
        if(action.equals("send")){
            String sender = split[1];
            String recipient = split[2];
            String content = split[3];
            User senderU = null;
            User recipientU = null;
            int iter = 0;
            while(iter < userCount){
                if(userList.get(iter).getName().equals(sender)){
                    senderU = userList.get(iter);
                    iter = userCount;
                }
                iter++;
            }
            iter = 0;
            while(iter < userCount){
                if(userList.get(iter).getName().equals(recipient)){
                    recipientU = userList.get(iter);
                    iter = userCount;
                }
                iter++;
            }
            if(senderU == null){
                User sToAdd = new User(sender);
                list.addUser(sToAdd);
                senderU = sToAdd;
            }
            if(recipientU == null){
                User rToAdd = new User(recipient);
                list.addUser(rToAdd);
                recipientU = rToAdd;
            }
            Message toSend = new Message(sender, content, recipient);
            Send.sendMessage(senderU, recipientU, content);
            System.out.println("Message sent!");
        }

        //READ
        else if(action.equals("read")){
            String userToAccess = split[1];
            User toRead = null;
            int iter = 0;
            while(iter < userCount){
                if(userList.get(iter).getName().equals(userToAccess)){
                    toRead = userList.get(iter);
                    iter = userCount;
                }
                iter++;
            }
            if (toRead == null) {
                System.out.println("That user does not exist!");
            }
            else{
                Read.readMessages(toRead);
            }
        }

        //EXIT
        else if(action.equals("exit")){
            System.out.println("RobCo Command line Electronic Mail System - SHUTTING DOWN.");
            System.exit(0);
        }

        //DEBUG
        else if(action.equals("debug")){
            list.showUsers();
        }

        else if(action.equals("help")){
            System.out.println("--HELP--");
            System.out.println("send <origin user> <destination user> <message>\nThis sends a message from one user to another. (Only works in top-level prompt.)");
            System.out.println("read <user>\nThis accesses the specified user, allowing you to read or clear their inbox and outbox. (Only works in top-level prompt.)");
            System.out.println("register <username>\nThis registers a new user under the specified username. (Only works in top-level prompt.)");
            System.out.println("exit\nThis will exit the program. (Only works in top-level prompt.)");
        }

        else if(action.equals("register")){
            String username = split[1];
            User toAdd = new User(username);
            list.addUser(toAdd);
            System.out.println("User " + username + " registered.");
        }

        else{
            System.out.println("Invalid command! Use 'help' for assistance.");
        }
    }

}
