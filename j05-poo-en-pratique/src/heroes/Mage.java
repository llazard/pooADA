package heroes;

public class Mage implements Hero {
    private final String name;
    private final int intelligence;

    public Mage(String name, int intelligence) {
        this.name = name;
        this.intelligence = intelligence;
    }

    @Override public String getName() { return name; }

    // Le mage inflige 2 fois son intelligence en dégâts.
    @Override public int attack() { return 2 * intelligence; }

    // Il soigne autant que son intelligence.
    @Override public int heal() { return intelligence; }
}
