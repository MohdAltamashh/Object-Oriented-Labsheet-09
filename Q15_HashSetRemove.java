import java.util.*;
public class Q15_HashSetRemove { public static void main(String[] args) {
    HashSet<String> set = new HashSet<>(Arrays.asList("Java", "Python", "C++"));
    set.remove("Python"); System.out.println(set);
} }
