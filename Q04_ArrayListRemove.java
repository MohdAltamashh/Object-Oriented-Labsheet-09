import java.util.*;
public class Q04_ArrayListRemove { public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 20));
    list.remove(0); list.remove(Integer.valueOf(20)); System.out.println(list);
} }
