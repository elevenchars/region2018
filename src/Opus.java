import java.util.*;
import java.io.*;
public class Opus {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(new File("opus.dat"));
        ArrayList<String> key = new ArrayList<String>();
        while (s.hasNext()) {
            key.add(s.next());
        }
        s.nextLine();
        HashMap<String, ArrayList<Student>> divs = new HashMap<>();
        divs.put("1A", new ArrayList<>());
        divs.put("2A", new ArrayList<>());
        divs.put("3A", new ArrayList<>());
        divs.put("4A", new ArrayList<>());
        divs.put("5A", new ArrayList<>());
        divs.put("6A", new ArrayList<>());
        while (s.hasNextLine()) {
            String name = s.next() + " " + s.next() + " " + s.next();
            String div = s.next();
            ArrayList<String> check = new ArrayList<String>();
            int score = 0;
            for (int i = 0; i < key.size(); i++) {
                check.add(s.next());
            }
            for (int i = 0; i < key.size(); i++) {
                if (key.get(i).equals(check.get(i))) {
                    score += 6;
                } else if (!check.get(i).equals("S")) {
                    score -= 2;
                }
            }
            divs.get(div).add(new Student(name, score));
        }
        System.out.println(divs.get("1A"));
    }
}

private class Student implements Comparable{
    String name = "";
    int score = 0;
    public Student(String n, int x) {
        name = n;
        score = x;
    }
    public String getName() {
        return name.substring(name.indexOf(" ")+1, name.lastIndexOf(" ")) + ", " + name.substring(0, name.indexOf(" ")) + " - " + name.substring(name.lastIndexOf(" "));
    }
    public int getScore() {
        return score;
    }

    public int compareTo(Student f) {
        return this.score - f.getScore();
    }
}
