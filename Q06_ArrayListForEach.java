import java.util.*;
public class Q06_ArrayListForEach { public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>(Arrays.asList("Red", "Green", "Blue"));
    for (String item : list) System.out.println(item);
} }
