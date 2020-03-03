import java.util.ArrayList;
import java.util.Arrays;

public class Barcode {
    private String barcode;
    ArrayList<String> encodeTable = new ArrayList<String>(
            Arrays.asList("11000", "00011", "00101", "00110", "01001", "01010", "01100", "10001", "10010", "10100"));

    public Barcode(){
        barcode = "NULL";
    }

    public String getBarcode(){
        return barcode;
    }

    public void setBarcode(String code){
        barcode = code;
    }

    public void encodeZIP(int ZIP){

    }

    public void decodeBar(String code){


    }
}
