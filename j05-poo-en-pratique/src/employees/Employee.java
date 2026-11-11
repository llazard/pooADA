package employees;

public abstract class Employee {
    private final String name;
    private final int baseSalary;
    public Employee(String name, int baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }
    public String getName() { return name; }
    public int getBaseSalary() { return baseSalary; }
    // Le salaire versé : par défaut, le salaire de base.
    public int getSalary() { return baseSalary; }
    public String getInformation() {
        return name + " : " + getSalary() + " €";
    }
}
