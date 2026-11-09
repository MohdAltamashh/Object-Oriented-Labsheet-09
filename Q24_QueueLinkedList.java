import java.util.*;
public class Q24_QueueLinkedList { public static void main(String[] args) {
    Queue<String> q = new LinkedList<>(); q.add("A"); q.add("B"); q.add("C");
    System.out.println(q); System.out.println("Removed: " + q.remove()); System.out.println(q);
} }
