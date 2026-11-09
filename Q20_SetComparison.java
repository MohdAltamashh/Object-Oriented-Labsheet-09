import java.util.*;
public class Q20_SetComparison { public static void main(String[] args) {
    List<Integer> values = Arrays.asList(30, 10, 20, 10);
    HashSet<Integer> hash = new HashSet<>(values);
    LinkedHashSet<Integer> linked = new LinkedHashSet<>(values);
    TreeSet<Integer> tree = new TreeSet<>(values);
    System.out.println("HashSet: " + hash); System.out.println("LinkedHashSet: " + linked);
    System.out.println("TreeSet: " + tree);
} }
