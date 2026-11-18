package rpg.model;

public class Hero {
    private final String name;
    private final String role; // warrior, mage, archer ou priest
    private final int level;

    public Hero(String name, String role, int level) {
        this.name = name;
        this.role = role;
        this.level = level;
    }

    public String getName() { return name; }
    public String getRole() { return role; }
    public int getLevel() { return level; }
}
