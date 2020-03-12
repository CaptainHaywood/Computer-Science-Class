import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Barcode code = new Barcode();
        Scanner in = new Scanner(System.in);
        String inputItem = in.nextLine();
        if(inputItem.substring(0,1).equals("|")){
            code.setBarcode(inputItem);
            System.out.println(code.decodeBarcode());
        }
        else{
            code.encodeZIP(inputItem);
            System.out.println(code.getBarcode());
        }
    }
}
