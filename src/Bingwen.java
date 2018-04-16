import java.util.*;
import java.io.*;
public class Bingwen {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("bingwen.dat"));
        while(sc.hasNext()){
            double d = sc.nextDouble();
            double c = Math.cbrt(d);
            System.out.printf("%.2f",c);
            System.out.println();
        }
    }
}
