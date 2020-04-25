public class Send {

    public static void sendMessage(User sender, User recipient, String content){
        Message toSend = new Message(sender.getName(), content, recipient.getName());
        recipient.addMessage(toSend);
        sender.addOutbox(toSend);
    }
}
