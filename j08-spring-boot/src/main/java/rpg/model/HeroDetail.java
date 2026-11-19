package rpg.model;

// Partie optionnelle : un héros, avec la description de son type.
// Jackson écrit un champ par getter : hero, un objet avec name, role et level, puis description.
public class HeroDetail {
    private final Hero hero;
    private final String description;

    public HeroDetail(Hero hero, String description) {
        this.hero = hero;
        this.description = description;
    }

    public Hero getHero() { return hero; }
    public String getDescription() { return description; }
}
