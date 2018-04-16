import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.time.LocalDateTime;
public class Vincent {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("vincent.dat"));
        while(in.hasNextLine()) {
            String[] data = in.nextLine().split("\\s");
            String[] times = in.nextLine().split("\\s");
            int[] intTimes = new int[times.length];
            for(int i = 0; i < intTimes.length; i++) {
                intTimes[i] = Integer.parseInt(times[i]);
            }
            LocalDateTime l =new LocalDateTime(new LocalDate(intTimes[0], intTimes[1], intTimes[2]))
            System.out.println("=====");
        }
    }
}
