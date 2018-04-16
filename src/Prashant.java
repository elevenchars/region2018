import java.util.*;
import java.io.*;
public class Prashant {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("prashant.dat"));
        while(sc.hasNextLine()){
            HashMap<String,Integer> freq = new HashMap<>();
            String line = sc.nextLine();
            String[] chars = line.split(" ");
            for(String s : chars){
                if(!freq.containsKey(s)){
                    freq.put(s,1);
                }
                else{
                    freq.put(s,freq.get(s)+1);
                }
            }
            long ways = fact(chars.length);
            for(String s : freq.keySet()){
                ways /= fact(freq.get(s));
            }
            System.out.println(ways);
        }
    }
    public static long fact(long n){
        long total = 1;
        for(int i=1;i<=n;i++){
            total *= i;
        }
        return total;
    }
}
