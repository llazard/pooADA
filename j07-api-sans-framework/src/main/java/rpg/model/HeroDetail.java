package rpg.model;

// Partie optionnelle de l'exercice 2 : un héros, avec la description de son type.
// Jackson écrit un champ par getter : name, role, level, description.
public class HeroDetail {
    private final String name;
    private final String role;
    private final int level;
    private final String description;

    public HeroDetail(String name, String role, int level, String description) {
        this.name = name;
        this.role = role;
        this.level = level;
        this.description = description;
    }

    public String getName() { return name; }
    public String getRole() { return role; }
    public int getLevel() { return level; }
    public String getDescription() { return description; }
}
