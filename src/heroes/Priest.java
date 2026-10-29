package heroes;

// Étape 3 : un prêtre, qui attaque peu mais soigne beaucoup.
public class Priest implements Hero {
    private final String name;
    private final int faith;

    public Priest(String name, int faith) {
        this.name = name;
        this.faith = faith;
    }

    @Override public String getName() { return name; }

    @Override public int attack() { return faith; }

    @Override public int heal() { return 3 * faith; }
}
