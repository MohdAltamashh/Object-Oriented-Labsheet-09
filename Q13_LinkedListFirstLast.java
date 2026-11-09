import java.util.*;
public class Q13_LinkedListFirstLast { public static void main(String[] args) {
    LinkedList<String> list = new LinkedList<>(Arrays.asList("First", "Second", "Last"));
    System.out.println("First: " + list.getFirst()); System.out.println("Last: " + list.getLast());
} }
