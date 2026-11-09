import java.util.*;
public class Q05_ArrayListUpdate { public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>(Arrays.asList("Java", "C++", "Python"));
    list.set(1, "JavaScript"); System.out.println(list);
} }
