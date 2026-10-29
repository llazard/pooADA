package playlist;

public class Artist {
    private String name;

    public Artist(String name) { this.name = name; }

    public String getName() { return name; }

    // Étape 2 : renommer l'artiste
    public void rename(String newName) { name = newName; }
}
