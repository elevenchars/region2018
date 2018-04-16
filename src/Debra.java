import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Debra {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("debra.dat"));
        while(in.hasNext()) {
            int[] dimension = {in.nextInt(), in.nextInt()}; in.nextLine();
            String[] lines = new String[dimension[0]];
            for(int i = 0; i < lines.length; i++) {
                lines[i] = in.nextLine();
            }
            for(String line: lines) {
                System.out.println(new StringBuilder(line).reverse().toString());
            }
            System.out.println("=====");
        }
    }
}
