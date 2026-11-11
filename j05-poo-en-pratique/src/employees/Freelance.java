package employees;

// Partie optionnelle : un salaire de base à 0 qui ne veut rien dire. Est-ce vraiment un Employee ?
public class Freelance extends Employee {

    private final int dailyRate;
    private final int days;

    public Freelance(String name, int dailyRate, int days) {
        super(name, 0);
        this.dailyRate = dailyRate;
        this.days = days;
    }

    @Override
    public int getSalary() {
        return dailyRate * days;
    }
}
