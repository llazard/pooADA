package rpg.service;

// Évolution prévue pour l'exercice 2 : le service de la route de santé avec filtre,
// utilisé par la version commentée de HealthController.
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
