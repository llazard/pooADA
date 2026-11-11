package rpg.controller;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
// import rpg.service.HealthService; // évolution prévue pour l'exercice 2

import java.io.IOException;
import java.util.Map;

public class HealthController implements HttpHandler {

    // Appelée par le serveur à chaque requête sur /health.
    @Override
    public void handle(HttpExchange exchange) throws IOException {
        Json.send(exchange, 200, Map.of("status", "ok"));
    }

    // Évolution prévue pour l'exercice 2 : un filtre dans l'adresse, /health?name=Lucie.
    // Pour l'essayer : décommentez ce bloc et l'import de HealthService, supprimez le
    // handle du dessus, et dans Main, donnez un HealthService au contrôleur.
    //
    // private final HealthService service;
    //
    // public HealthController(HealthService service) {
    //     this.service = service;
    // }
    //
    // // GET /health, avec un filtre éventuel : /health?name=Lucie
    // @Override
    // public void handle(HttpExchange exchange) throws IOException {
    //     // "name=Lucie", ou null sans filtre
    //     String query = exchange.getRequestURI().getQuery();
    //     if (query == null) {
    //         Json.send(exchange, 200, Map.of("status", "ok"));
    //         return;
    //     }
    //     String name = service.readName(query);
    //     if (name == null) {
    //         Json.send(exchange, 400, Map.of("error", "Filtre inconnu : " + query));
    //         return;
    //     }
    //     Json.send(exchange, 200, Map.of("status", service.status(name)));
    // }
}
