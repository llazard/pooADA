package rpg.controller;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import rpg.service.HealthService;

import java.io.IOException;
import java.util.Map;

public class HealthController implements HttpHandler {
    private final HealthService service;

    public HealthController(HealthService service) {
        this.service = service;
    }

    // GET /health, avec un filtre éventuel : /health?name=Lucie
    @Override
    public void handle(HttpExchange exchange) throws IOException {
        // "name=Lucie", ou null sans filtre
        String query = exchange.getRequestURI().getQuery();
        if (query == null) {
            Json.send(exchange, 200, Map.of("status", "ok"));
            return;
        }
        String name = service.readName(query);
        if (name == null) {
            Json.send(exchange, 400, Map.of("error", "Filtre inconnu : " + query));
            return;
        }
        Json.send(exchange, 200, Map.of("status", service.status(name)));
    }
}
