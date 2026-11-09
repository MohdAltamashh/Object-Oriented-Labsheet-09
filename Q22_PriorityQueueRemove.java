import java.util.*;
public class Q22_PriorityQueueRemove { public static void main(String[] args) {
    PriorityQueue<Integer> q = new PriorityQueue<>(Arrays.asList(40, 10, 30, 20));
    while (!q.isEmpty()) System.out.println("Removed: " + q.poll());
} }
