import java.util.*;
public class Q25_QueueOperations { public static void main(String[] args) {
    Queue<Integer> q = new LinkedList<>(); q.offer(100); q.offer(200); q.offer(300);
    System.out.println("Peek: " + q.peek()); System.out.println("Remove: " + q.poll());
    System.out.println("Remaining: " + q);
} }
