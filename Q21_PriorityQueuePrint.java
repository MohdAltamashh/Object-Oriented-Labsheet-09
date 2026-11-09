import java.util.*;
public class Q21_PriorityQueuePrint { public static void main(String[] args) {
    PriorityQueue<Integer> q = new PriorityQueue<>(Arrays.asList(40, 10, 30, 20));
    System.out.println("Queue representation: " + q);
    System.out.println("Priority order:"); for (Integer x : q) System.out.println(x);
} }
