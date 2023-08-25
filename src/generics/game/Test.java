package generics.game;

public class Test {
    public static void main(String[] args) {
        Schoolar schoolar1 = new Schoolar("Dima",13);
        Schoolar schoolar2 = new Schoolar("Vova", 15);

        Student student1 = new Student("Anton", 18);
        Student student2 = new Student("Akim", 20);

        Employee employee1 = new Employee("Ivan", 23);
        Employee employee2 = new Employee("Taras", 25);

        Team<Schoolar> schoolaTeam = new Team<>("Pride");
        schoolaTeam.addNewParticipant(schoolar1);
        schoolaTeam.addNewParticipant(schoolar2);

        Team<Student> studentTeam = new Team<>("Berserk");
        studentTeam.addNewParticipant(student1);
        studentTeam.addNewParticipant(student2);

        Team<Employee> employeeTeam = new Team<>("Vumpel");
        employeeTeam.addNewParticipant(employee1);
        employeeTeam.addNewParticipant(employee2);

        schoolaTeam.playWith(employeeTeam);
    }
}
