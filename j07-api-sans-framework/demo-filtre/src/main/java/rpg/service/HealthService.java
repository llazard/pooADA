package rpg.service;

// Le métier de la route de santé. Ni HTTP ni JSON ici.
public class HealthService {

    // Lit le filtre : "name=Lucie" donne "Lucie".
    // Un autre filtre donne null.
    public String readName(String query) {
        String[] filter = query.split("="); // ["name", "Lucie"]
        if (filter[0].equals("name")) {
            return filter[1];
        }
        return null;
    }

    public String status(String name) {
        return "ok " + name;
    }
}
