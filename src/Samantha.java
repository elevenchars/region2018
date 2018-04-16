import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Samantha {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("samantha.dat"));
        while(in.hasNextLine()) {
            String[] priceStrings = in.nextLine().split(" ");
            double[] prices =  new double[priceStrings.length];
            for(int i = 0; i < prices.length; i++) {
                prices[i] = Double.parseDouble(priceStrings[i]);
            }
            double sub = 0.0;
            for(double item: prices) {
                sub += item;
            }
            double tax = sub * 0.0825;
            System.out.printf("Subtotal: $%7.2f\n", sub);
            System.out.printf("Tax     : $%7.2f\n", tax);
            System.out.printf("Total   : $%7.2f\n", sub+tax);
            System.out.println("=====");


        }
    }
}
