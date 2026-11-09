import java.util.*;
public class Q26_StudentIterator {
    static class Student { int id; String name; Student(int id, String name) { this.id=id; this.name=name; }
        public String toString() { return id + " - " + name; } }
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>(); students.add(new Student(1,"Aman")); students.add(new Student(2,"Sara"));
        Iterator<Student> it = students.iterator(); while (it.hasNext()) System.out.println(it.next());
    }
}
