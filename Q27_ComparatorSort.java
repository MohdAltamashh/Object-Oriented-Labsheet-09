import java.util.*;
public class Q27_ComparatorSort {
    static class Student { int roll; String name; Student(int r,String n){roll=r;name=n;}
        public String toString(){return roll+" "+name;} }
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>(); list.add(new Student(3,"Zoya"));
        list.add(new Student(1,"Aman")); list.add(new Student(2,"Ravi"));
        list.sort(Comparator.comparing(s -> s.name)); System.out.println(list);
    }
}
