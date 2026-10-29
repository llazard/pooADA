package heroes;

public class Archer implements Hero {
    private final String name;
    private final int arrows;

    public Archer(String name, int arrows) {
        if (arrows < 0) {
            throw new IllegalArgumentException("Nombre de flèches invalide : " + arrows);
        }
        this.name = name;
        this.arrows = arrows;
    }

    @Override public String getName() { return name; }

    // L'archer inflige 4 dégâts par flèche.
    @Override public int attack() { return 4 * arrows; }

    // L'archer ne soigne pas.
    @Override public int heal() { return 0; }
}
