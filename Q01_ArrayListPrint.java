import java.util.*;
public class Q01_ArrayListPrint { public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40));
    for (int x : list) System.out.println(x);
} }
