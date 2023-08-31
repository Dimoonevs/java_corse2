package collections;

import java.util.Objects;
import java.util.TreeSet;

public class TreeSetExample2 {
    public static void main(String[] args) {
        TreeSet<StudentTreeSetExample2> set = new TreeSet<>();
        StudentTreeSetExample2 st1 = new StudentTreeSetExample2("Dima", 6);
        StudentTreeSetExample2 st2 = new StudentTreeSetExample2("Igor", 3);
        StudentTreeSetExample2 st3 = new StudentTreeSetExample2("Maria", 4);
        StudentTreeSetExample2 st4 = new StudentTreeSetExample2("Stanislav", 6);
        StudentTreeSetExample2 st5 = new StudentTreeSetExample2("Vasiliy", 1);
        set.add(st1);
        set.add(st2);
        set.add(st3);
        set.add(st4);
        set.add(st5);

        System.out.println(set);
        System.out.println(set.first());
        System.out.println(set.last());
        StudentTreeSetExample2 st6 = new StudentTreeSetExample2("Oleg", 1);
        StudentTreeSetExample2 st7 = new StudentTreeSetExample2("Ivan", 4);
        System.out.println(set.headSet(st6));
        System.out.println(set.tailSet(st6));
        System.out.println(set.subSet(st6, st7));

    }

}
class StudentTreeSetExample2 implements Comparable<StudentTreeSetExample2>{
    String name;
    int course;

    public StudentTreeSetExample2(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public int compareTo(StudentTreeSetExample2 o) {
        int res = this.course - o.course;
        if (res == 0){
            res = this.name.compareTo(o.name);
        }
        return res;
    }

    @Override
    public String toString() {
        return "StudentTreeSetExample2{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentTreeSetExample2 that = (StudentTreeSetExample2) o;
        return course == that.course && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, course);
    }
}
