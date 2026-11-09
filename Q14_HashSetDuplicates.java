import java.util.*;
public class Q14_HashSetDuplicates { public static void main(String[] args) {
    HashSet<Integer> set = new HashSet<>(); set.add(10); set.add(20); set.add(10); set.add(30);
    System.out.println("Set (duplicate 10 ignored): " + set);
} }
