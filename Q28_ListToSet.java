import java.util.*;
public class Q28_ListToSet { public static void main(String[] args) {
    List<Integer> list = Arrays.asList(1, 2, 2, 3, 3, 4);
    Set<Integer> set = new LinkedHashSet<>(list);
    System.out.println("List: " + list); System.out.println("Set: " + set);
} }
