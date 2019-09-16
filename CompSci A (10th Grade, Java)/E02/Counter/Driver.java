public class Driver {
    public static void main(String[] args){
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        c1.click();
        c1.click();
        c2.click();
        c2.click();
        c2.click();
        System.out.println(c1.getClicks());
        System.out.println(c2.getClicks());
    }
}