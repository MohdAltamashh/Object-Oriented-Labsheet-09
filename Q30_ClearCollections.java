import java.util.*;
public class Q30_ClearCollections { public static void main(String[] args) {
    List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3));
    Set<Integer> set = new HashSet<>(Arrays.asList(4,5,6));
    Queue<Integer> queue = new LinkedList<>(Arrays.asList(7,8,9));
    list.clear(); set.clear(); queue.clear();
    System.out.println("List: " + list + ", Set: " + set + ", Queue: " + queue);
} }
