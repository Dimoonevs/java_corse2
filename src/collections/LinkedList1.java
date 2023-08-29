package collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class LinkedList1 {
    public static void main(String[] args) {
        List<Student2> list = new LinkedList<>();
        list.add(new Student2("Dima", 2));
        list.add(new Student2("Dima", 4));
        list.add(new Student2("Isimen", 4));
        list.add(new Student2("Course", 5));
        list.add(new Student2("Anton", 1));
        list.add(new Student2("Elena", 2));
        list.add(new Student2("Zabor", 3));
        Collections.sort(list, new ComparableToName());
        System.out.println(list);
        System.out.println(list.get(2));
        list.remove(2);
        System.out.println(list);



    }

}
class Student2
//        implements Comparable<Student2>
{
    private String name;
    private int course;

    public Student2(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

//    @Override
//    public int compareTo(Student2 student) {
//        return this.name.compareTo(student.getName());
//    }
}

class ComparableToName implements Comparator<Student2>{

    @Override
    public int compare(Student2 student1, Student2 student2) {
        int res = student1.getName().compareTo(student2.getName());
        if (res == 0){
            res = student1.getCourse() - student2.getCourse();
        }
        return res;
    }
}
