import java.util.*;
public class Q12_LinkedListRemoveEnds { public static void main(String[] args) {
    LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1, 2, 3, 4));
    list.removeFirst(); list.removeLast(); System.out.println(list);
} }
