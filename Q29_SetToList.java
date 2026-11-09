import java.util.*;
public class Q29_SetToList { public static void main(String[] args) {
    Set<String> set = new LinkedHashSet<>(Arrays.asList("Java", "Python", "C++"));
    List<String> list = new ArrayList<>(set);
    for (String value : list) System.out.println(value);
} }
