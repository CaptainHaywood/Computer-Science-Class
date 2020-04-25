public class Message {
    private String sender;
    private String recipient;
    private String content;

    public Message(String inSender, String inContent, String inRecip){
        sender = inSender;
        content = inContent;
        recipient = inRecip;
    }

    public String toString(){
        return "[From " + sender + ": " + content + "]";
    }

    public String toString2(){
        return "[To " + recipient + ": " + content + "]";
    }

}
