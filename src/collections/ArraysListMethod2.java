package collections;

import generics.game.Schoolar;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ArraysListMethod2 {

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Ivan", 'm', 22, 3, 8.3));
        studentList.add(new Student("Masha", 'f', 19, 1, 9.5));
        studentList.add(new Student("Anton", 'm', 22, 3, 6.5));
        studentList.add(new Student("Elena", 'f', 21, 2, 10.5));
        studentList.add(new Student("Nikolay", 'm', 28, 5, 7));
        System.out.println(studentList);

        Student stTryRemove = new Student("Masha", 'f', 19, 1, 9.5);

        studentList.remove(stTryRemove);
        System.out.println(studentList);
    }

}
class Student{
    private String name;
    private char sex;
    private int age;
    private int course;
    private double avgGrade;

    public Student(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    public String getName() {
        return name;
    }

    public char getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public int getCourse() {
        return course;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return sex == student.sex &&
                age == student.age &&
                course == student.course &&
                Double.compare(student.avgGrade, avgGrade) == 0 &&
                Objects.equals(name, student.name);
    }

}
