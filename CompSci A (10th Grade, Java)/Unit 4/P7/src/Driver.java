import javax.swing.text.MaskFormatter;
import java.text.ParseException;
import java.util.Scanner;

public class Driver
{
    public static void main(String[] args) throws ParseException {
        Scanner in = new Scanner(System.in);
        //System.out.println("Enter start time: ");
        String num  = in.nextLine();

        String phoneMask= "(###) ###-####";

        MaskFormatter maskFormatter= new MaskFormatter(phoneMask);
        maskFormatter.setValueContainsLiteralCharacters(false);
        num = maskFormatter.valueToString(num);
        System.out.println(num);
    }
}
