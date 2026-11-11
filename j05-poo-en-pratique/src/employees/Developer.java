package employees;

// Ne redéfinit rien : le salaire de base, hérité de Employee.
public class Developer extends Employee {
    public Developer(String name, int baseSalary) {
        super(name, baseSalary);
    }
}
