import java.util.ArrayList;
import java.util.Arrays;

public class Barcode {
    private String barcode;
    //ArrayList<String> encodeTable = new ArrayList<String>(
            //Arrays.asList("11000", "00011", "00101", "00110", "01001", "01010", "01100", "10001", "10010", "10100"));

    //barTable - holds binary barcode segments. Each segment's decimal value corresponds to its decimal index in the list.
    ArrayList<String> barTable = new ArrayList<String>(
            Arrays.asList("||:::", ":::||", "::|:|", "::||:", ":|::|", ":|:|:", ":||::", "|:::|", "|::|:", "|:|::"));

    public Barcode(){
        barcode = "NULL";
    }

    public String getBarcode(){
        return barcode;
    }

    public void setBarcode(String code){
        barcode = code;
    }

    public void encodeZIP(String ZIP){
        int iter = 0;
        int didgitSum = 0;
        int checkDidgit = 0;
        String encodedZIP = "|";
        while (iter < 5){
            encodedZIP = encodedZIP + barTable.get(Integer.parseInt(ZIP.substring(iter, iter+1)));
            didgitSum = didgitSum + Integer.parseInt(ZIP.substring(iter, iter + 1));
            iter++;
        }
        int roundedSum = round(didgitSum);
        checkDidgit = roundedSum - didgitSum;
        checkDidgit = Math.abs(checkDidgit);
        encodedZIP = encodedZIP + barTable.get(checkDidgit);
        encodedZIP = encodedZIP + "|";
        barcode = encodedZIP;
    }

    //Convenience function used for rounding in the check didgit process.
    private int round(int n)
    {
        int a = (n / 10) * 10;
        int b = a + 10;
        return (n - a > b - n)? b : a;
    }

    public String decodeBarcode(){
        String workingBar = barcode;
        String decodedZIP = "";
        workingBar = workingBar.substring(1, workingBar.length() - 1);
        int iter = 0;
        int innerIter = 0;
        while (iter<5){
            String barSeg = workingBar.substring(iter * 5, (iter * 5) + 5);
            innerIter = 0;
            while(innerIter < 10){
                if (barSeg.equals(barTable.get(innerIter))){
                    decodedZIP = decodedZIP + innerIter;
                }
                innerIter++;
            }
            iter++;
        }
        return decodedZIP;
    }
}
