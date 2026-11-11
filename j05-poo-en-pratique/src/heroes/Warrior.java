package heroes;

public class Warrior implements Hero {
    private final String name;
    private final int strength;

    public Warrior(String name, int strength) {
        this.name = name;
        this.strength = strength;
    }

    @Override public String getName() { return name; }
    // Le guerrier inflige sa force en dégâts.
    @Override public int attack() { return strength; }
    // Le guerrier ne soigne pas.
    @Override public int heal() { return 0; }
}
