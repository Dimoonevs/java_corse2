package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearch {
    public static void main(String[] args) {
//        Employee employee = new Employee(6, "Vova", 8441);
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(4, "Anton", 200));
        employees.add(new Employee(5, "Dima", 2528));
        employees.add(new Employee(6, "Vova", 8441));
        employees.add(new Employee(1, "Petya", 54851));
        employees.add(new Employee(2, "Sergai", 5545));
        employees.add(new Employee(7, "Stas", 511));
        employees.add(new Employee(3, "Igor", 815));
        System.out.println(employees);
        Collections.sort(employees);

        System.out.println("----------------------------");

        System.out.println(employees);

        int indexFindElem = Collections.binarySearch(employees, new Employee(5, "Dima", 2528));
        System.out.println(indexFindElem);


    }
}
class Employee implements Comparable<Employee>{
    private int id;
    private String name;
    private int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee employee) {
        int res = this.name.compareTo(employee.getName());
        if(res == 0){
            res = this.id - employee.id;
        }
        return res;
    }
}
