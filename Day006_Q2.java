import java.util.*;

public class Day006_Q2 {
    public static void main(String[] args) {
        List<String> arr = new ArrayList<String>();
        arr.add("First");
        arr.add("Second");
        arr.add("Third");
        printAll(arr);
    }

    public static void printAll(List<String> arr) {
        Iterator<String> i = arr.iterator();
        while (i.hasNext()) {
            System.out.print(i.next() + " ");
        }
    }

}
