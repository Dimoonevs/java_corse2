package comparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(100, "Dima", "Bcd",2000));
        employees.add(new Employee(15, "Dima", "Abc",2342));
        employees.add(new Employee(123, "Anton", "Asav",235));

        System.out.println("Before sorting");
        System.out.println(employees);


        System.out.println("After sorting");
//        Collections.sort(employees);
//        Collections.sort(employees, new IdComparator());
//        Collections.sort(employees, new NameComparator());
        Collections.sort(employees, new SalaryComparator());
        System.out.println(employees);

    }
}
class Employee
      implements  Comparable<Employee>
{
    Integer id;
    String name;
    String surname;
    int salary;

    public Employee(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee anotherEmp) {
        if (this.id == anotherEmp.id){
            return 0;
        } else if (this.id < anotherEmp.id){
            return -1;
        } else {
            return 1;
        }
//        return this.id - anotherEmp.id;
//        if (this.name !=)


//        int res = this.name.compareTo(anotherEmp.name);
//        if (res == 0){
//            res = this.surname.compareTo(anotherEmp.surname);
//        }
//        return res;
    }
}
class IdComparator implements Comparator<Employee>{

    @Override
    public int compare(Employee emp1, Employee emp2) {
        if (emp1.id == emp2.id){
            return 0;
        } else if (emp1.id < emp2.id){
            return -1;
        } else {
            return 1;
        }
    }
}
class NameComparator implements Comparator<Employee>{

    @Override
    public int compare(Employee emp1, Employee emp2) {
//        return emp1.name.compareTo(emp2.name);
        int res = emp1.name.compareTo(emp2.name);
        if (res == 0){
            res = emp1.surname.compareTo(emp2.surname);
        }
        return res;
    }

}
class SalaryComparator implements Comparator<Employee>{

    @Override
    public int compare(Employee emp1, Employee emp2) {
        return emp1.salary - emp2.salary;
    }
}