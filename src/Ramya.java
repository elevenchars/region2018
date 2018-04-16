import java.util.*;
import java.io.*;
public class Ramya {
    static TreeSet<String> perms = new TreeSet<>();
    static ArrayList<String> last = new ArrayList<>();
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("ramya.dat"));
        while(sc.hasNextLine()){
            String s = sc.nextLine();
            perms.clear();
            last.clear();
            addperms("",s);
            for(String darn : perms){
                last.add(darn);
            }
            for(int i=0;i<Math.min(30,last.size());i++){
                System.out.println(last.get(i));
            }
            System.out.println("=====");
        }
    }
    public static void addperms(String used, String unused){
        if(unused.length()==0){
            perms.add(used);
        }
        else{
            String copy = used;
            for(int i=0;i<unused.length();i++){
                addperms(copy+unused.charAt(i),unused.substring(0,i)+unused.substring(i+1));
            }
        }
    }
}
