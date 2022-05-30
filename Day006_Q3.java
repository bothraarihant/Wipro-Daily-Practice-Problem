import java.util.ArrayList;
import java.util.*;

public class Day006_Q3 {
    public static void main(String[] args) {
        List<Object> list = new MyArrayList<>();
        list.add(1);
        list.add("0");
        list.add(3.14);
        System.out.println(list);
    }
}

class MyArrayList<E> extends ArrayList<E> {
    public boolean add(E e) {
        if (e instanceof Integer || e instanceof Float || e instanceof Double) {
            super.add(e);
            return true;
        } else {
            throw new ClassCastException("Only numbers are allowed");
            // return false; // if we return false, it will just skip through without
            // throwing an exception
        }
    }
}