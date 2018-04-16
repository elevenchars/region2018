
import java.util.*;
import java.io.*;
public class Caleb {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(new File("caleb.dat"));
        int n = Integer.parseInt(s.next());
        s.nextLine();
        for (int i = 0; i < n; i++) {
            String temp = s.nextLine();
            //System.out.println(temp);
            int hr = Integer.parseInt(temp.substring(0, temp.indexOf("/")));
            int min  = Integer.parseInt(temp.substring(temp.indexOf("/") + 1));
            int ansMin = (min / 6);
            int ansHr = 0;
            if (hr >= 0 && hr < 30) {
                ansHr = 12;
            } else if (hr >= 30 && hr < 60) {
                ansHr = 1;
            } else if (hr >= 60 && hr < 90) {
                ansHr = 2;
            } else if (hr >= 90 && hr < 120) {
                ansHr = 3;
            } else if (hr >= 120 && hr < 150) {
                ansHr = 4;
            } else if (hr >= 150 && hr < 180) {
                ansHr = 5;
            } else if (hr >= 180 && hr < 210) {
                ansHr = 6;
            } else if (hr >= 210 && hr < 240) {
                ansHr = 7;
            } else if (hr >= 240 && hr < 270) {
                ansHr = 8;
            } else if (hr >= 270 && hr < 300) {
                ansHr = 9;
            } else if (hr >= 300 && hr < 330) {
                ansHr = 10;
            } else if (hr >= 330 && hr < 360) {
                ansHr = 11;
            }
            System.out.printf("%d:%02d\n", ansHr, ansMin);
        }
    }
}