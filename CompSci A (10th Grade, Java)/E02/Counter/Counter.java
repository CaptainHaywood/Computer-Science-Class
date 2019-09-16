public class Counter {
    private int value;
    public void click(){
        value = value + 1;
    }
    public int getClicks() {
        return value;
    }
}