package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class EqualsHashCodeExample1 {
    public static void main(String[] args) {
        Map<StudentEqualsHashCode, Double> map = new HashMap<>();
        StudentEqualsHashCode st = new StudentEqualsHashCode("Dima", "Yevsiukov", 4);
        StudentEqualsHashCode st1 = new StudentEqualsHashCode("Dima", "Yevsiukov", 4);
        map.put(st, 3.5);
        map.put(new StudentEqualsHashCode("Maria", "Sidorova", 4), 4.5);
        map.put(new StudentEqualsHashCode("Ермак", "Сидеть!", 4), 4.2);

        System.out.println(map);
//        boolean result = map.containsKey(st1);
//        System.out.println(result);
//        System.out.println(st.equals(st1));

        for (Map.Entry<StudentEqualsHashCode, Double> entry: map.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        Map<Integer, String> map1 = new HashMap<>(16, 0.75f);


    }
}
class StudentEqualsHashCode{
    String name;
    String surname;
    Integer course;

    public StudentEqualsHashCode(String name, String surname, Integer course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentEqualsHashCode student = (StudentEqualsHashCode) o;
        return course == student.course && Objects.equals(name, student.name) && Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, course);
    }
}
