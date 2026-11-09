import java.util.*;
public class Q23_PriorityQueuePeek { public static void main(String[] args) {
    PriorityQueue<Integer> q = new PriorityQueue<>(Arrays.asList(30, 10, 20));
    System.out.println("Head: " + q.peek()); System.out.println("Queue remains: " + q);
} }
