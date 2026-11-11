package rpg.controller;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import rpg.service.HeroService;

import java.io.IOException;
import java.util.Map;

public class HeroController implements HttpHandler {
    private final HeroService service;

    public HeroController(HeroService service) {
        this.service = service;
    }

    // GET /heroes, avec un filtre éventuel : /heroes?name=merl ou /heroes?role=mage
    @Override
    public void handle(HttpExchange exchange) throws IOException {
        // "name=merl", ou null sans filtre
        String query = exchange.getRequestURI().getQuery();
        if (query == null) {
            Json.send(exchange, 200, service.findAll());
            return;
        }
        String name = UtilsController.readName(query);
        if (name != null) {
            Json.send(exchange, 200, service.findByName(name));
            return;
        }
        String role = UtilsController.readRole(query);
        if (role != null) {
            Json.send(exchange, 200, service.findByRole(role));
            return;
        }
        Json.send(exchange, 400, Map.of("error", "Filtre inconnu : " + query));
    }
}
