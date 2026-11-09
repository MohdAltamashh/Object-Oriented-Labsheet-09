import java.util.*;
public class Q18_TreeSetContains { public static void main(String[] args) {
    TreeSet<Integer> set = new TreeSet<>(Arrays.asList(10, 20, 30, 40));
    System.out.println("Contains 30? " + set.contains(30));
} }
