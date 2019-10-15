public class TV {
    private int volume;
    private int channel;
    
    public void channelUp(){
        channel++;
    }
    public void channelDown(){
        channel--;
    }
    public void volumeUp(){
        volume++;
    }
    public void volumeDown(){
        volume--;
    }
    public int getChannel(){
        return channel;
    }
    public int getVolume(){
        return volume;
    }
}