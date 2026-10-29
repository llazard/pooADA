package employees;

public class Manager extends Employee {

    private final int bonus;

    public Manager(String name, int baseSalary, int bonus) {
        super(name, baseSalary);
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }

    @Override
    public int getSalary() {
        return super.getSalary() + bonus;
    }
}
