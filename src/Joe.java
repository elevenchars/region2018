import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Joe {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("joe.dat"));
        while(in.hasNext()) {
            String[] data = in.nextLine().split("\\s");
            for(int i = 0; i < data.length; i++) {
                data[i] = data[i].replaceAll("\\W", "").toUpperCase();
            }
            Set<String> newData = new HashSet<>(Arrays.asList(data));
//            System.out.println(newData);
            List<String> newNewData = new ArrayList<>(newData);
            newNewData.sort(new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    int diff = o1.length() - o2.length();
                    if(diff != 0) {
                        return diff;
                    }
                    return o1.compareTo(o2);
                }
            });
            String out = "";
            for(String word: newNewData) {
                out += word + " ";
            }
            System.out.println(out.trim());
        }
    }
}
