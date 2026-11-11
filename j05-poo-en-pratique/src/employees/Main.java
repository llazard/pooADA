package employees;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Trois classes différentes dans une seule liste : chacune est un Employee.
        List<Employee> team = new ArrayList<>();
        team.add(new Developer("Alice", 2500));
        team.add(new Manager("Bob", 3000, 500));
        team.add(new Intern("Chloé", 1600));

        int payroll = 0;
        for (Employee employee : team) {
            System.out.println(employee.getInformation());
            payroll += employee.getSalary();
        }
        System.out.println("Masse salariale : " + payroll + " €");

        // Partie optionnelle : la boucle ne change pas.
        team.add(new Freelance("David", 400, 5));
        int total = 0;
        for (Employee employee : team) {
            total += employee.getSalary();
        }
        System.out.println("Avec le freelance : " + total + " €");
    }
}
