package rpg.model;

// Un type de héros, et ce qu'il sait faire.
public class Role {
    private final String name;
    private final String description;

    public Role(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() { return name; }
    public String getDescription() { return description; }
}
