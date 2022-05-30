import java.util.*;

public class Day006_Q4 {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<String>();
        ts.add("First");
        ts.add("Second");
        ts.add("Third");

        printts(ts);
        reversets(ts);
        checkts(ts, "First");

    }

    public static void printts(TreeSet<String> ts) {
        System.out.println(ts);
    }

    public static void reversets(TreeSet<String> ts) {
        NavigableSet<String> nts = ts.descendingSet();
        System.out.println(nts);
    }

    public static void checkts(TreeSet<String> ts, String str) {
        System.out.println(ts.contains(str));
    }
}
