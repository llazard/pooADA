package employees;

public class Intern extends Employee {

    public Intern(String name, int baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public int getSalary() {
        return getBaseSalary() / 2;
    }
}
