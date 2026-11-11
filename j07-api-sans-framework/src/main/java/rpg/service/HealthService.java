package rpg.service;

// Évolution prévue pour l'exercice 2 : le service de la route de santé avec filtre,
// utilisé par la version commentée de HealthController.
// Le métier de la route de santé. Ni HTTP ni JSON ici.
public class HealthService {

    public String status(String name) {
        return "ok " + name;
    }
}
