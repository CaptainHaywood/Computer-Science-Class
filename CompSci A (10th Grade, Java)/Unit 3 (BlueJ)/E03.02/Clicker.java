public class Clicker {
    private int clicks;
    private int max;
        
    public void setLimit(int maximum){
        max = maximum;
    }
    public void doClick(){
        clicks++;
        clicks = Math.min(clicks, max);
        System.out.println(clicks);
    }
    public int getClicks(){
        return clicks;
    }
}