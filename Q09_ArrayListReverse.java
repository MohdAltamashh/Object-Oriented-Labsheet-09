import java.util.*;
public class Q09_ArrayListReverse { public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>(Arrays.asList("A", "B", "C", "D"));
    Collections.reverse(list); System.out.println(list);
} }
