public class Driver {
    public static void main(String[] args){
        String text = "Mississippi";
        System.out.println(text);
        text = text.replace("i", "!");
        text = text.replace("s", "$");
        System.out.println(text);
    }
}