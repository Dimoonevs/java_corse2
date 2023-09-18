package lambda;

import java.util.ArrayList;
import java.util.List;

public class StudentInfo {
    void testStudents(List<Student> students, StudentCheck sc){
        for (Student s: students){
            if (sc.check(s)){
                System.out.println(s);
            }
        }
    }

//    void printStudentsOverGrade(List<Student> a1, double grade){
//        for (Student s: a1){
//            if (s.avgGrade > grade){
//                System.out.println(s);
//            }
//        }
//
//    }
//    void printStudentsUnderAge(List<Student> a1, int age){
//        for (Student s: a1){
//            if(s.age < age){
//                System.out.println(s);
//            }
//        }
//    }
//    void printStudentsMixCondition(List<Student> a1, int age, double grade, char sex){
//        for (Student s: a1){
//            if (s.age > age && s.avgGrade < grade && s.sex == sex){
//                System.out.println(s);
//            }
//        }
//    }


}
class Test{
    public static void main(String[] args) {
        Student st1 = new Student("Dima", 'M', 22, 5, 9.5);
        Student st2 = new Student("Nikolai", 'M', 38, 2, 6.4);
        Student st3 = new Student("Elena", 'F', 19, 4, 8.9);
        Student st4 = new Student("Petr", 'M', 21, 6, 4.5);
        Student st5 = new Student("Olga", 'F', 19, 1, 9.1);

        List<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        StudentInfo studentInfo = new StudentInfo();
//        studentInfo.testStudents(students,new StudentCheckImpl());

//        System.out.println("----------------------------------");
//        studentInfo.testStudents(students, new StudentCheck() {
//            @Override
//            public boolean check(Student s) {
//                return s.age < 22;
//            }
//        });
        studentInfo.testStudents(students, (Student student) -> {return student.avgGrade > 8;});
        System.out.println("----------------------------------");
        studentInfo.testStudents(students, (Student student) -> {return student.age < 30;});
        System.out.println("----------------------------------");
        studentInfo.testStudents(students, (Student student) -> {
            return student.age >= 18 && student.avgGrade < 9.3 && student.sex == 'F';
        });


//        studentInfo.printStudentsOverGrade(students, 8);
//        System.out.println("----------------------------------");
//        studentInfo.printStudentsUnderAge(students, 22);
//        System.out.println("----------------------------------");
//        studentInfo.printStudentsMixCondition(students, 18, 9.5, 'F');
    }

}
interface StudentCheck{
    boolean check(Student s);
}
class StudentCheckImpl implements StudentCheck{
    @Override
    public boolean check(Student s) {
        return s.avgGrade > 8;
    }
}

