public class Driver{
    public static void main(String[] args){
        TV television = new TV();
        television.channelUp();
        television.volumeUp();
        System.out.println(television.getChannel());
        System.out.println(television.getVolume());
    }
}