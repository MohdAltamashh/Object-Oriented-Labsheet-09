import java.util.*;
public class Q03_ArrayListInsert { public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>(Arrays.asList("A", "C", "D"));
    list.add(1, "B"); System.out.println(list);
} }
