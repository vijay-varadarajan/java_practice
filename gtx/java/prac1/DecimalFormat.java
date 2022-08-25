import java.util.Scanner;
import java.text.*;

public class DecimalFormat{
    public static void main(String[] args){

        //Scanner input = new Scanner(System.in);
        //System.out.print("Enter decimal value: ");
        //String decimalNum = input.next();

        DecimalFormat formatter = new DecimalFormat("0.0");
        String formattedNum = formatter.format(.867);

        System.out.printf(formattedNum);
    }
}