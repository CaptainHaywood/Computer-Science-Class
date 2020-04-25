import java.lang.reflect.Array;
import java.util.ArrayList;

public class User {
    private String name;
    private ArrayList<Message> messages = new ArrayList<Message>();
    private ArrayList<Message> outbox = new ArrayList<Message>();

    public User(String nameIn){
        name = nameIn;
    }

    public void addMessage(String sender, String content, String recipient){
        Message toAdd = new Message(sender, content, recipient);
        messages.add(toAdd);
    }

    public ArrayList<Message> getMessages(){
        return messages;
    }

    public ArrayList<Message> getOutbox(){
        return outbox;
    }


    public void addMessage(Message toAdd){
        messages.add(toAdd);
    }

    public void addOutbox(Message toAdd){
        outbox.add(toAdd);
    }

    public String getName(){
        return name;
    }

    public void clearBoxes(){
        messages = new ArrayList<Message>();
        outbox = new ArrayList<Message>();
    }

}
