import java.util.*;
public class Q16_HashSetIterator { public static void main(String[] args) {
    HashSet<Integer> set = new HashSet<>(Arrays.asList(10, 20, 30));
    Iterator<Integer> it = set.iterator(); while (it.hasNext()) System.out.println(it.next());
} }
