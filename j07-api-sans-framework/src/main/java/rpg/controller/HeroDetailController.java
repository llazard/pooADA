package rpg.controller;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import rpg.service.HeroService;

import java.io.IOException;
import java.util.Map;

// Partie optionnelle de l'exercice 2 : les héros, avec la description de leur type.
public class HeroDetailController implements HttpHandler {
    private final HeroService service;

    public HeroDetailController(HeroService service) {
        this.service = service;
    }

    // GET /heroeswithdetail, puis avec un filtre : /heroeswithdetail?name=merl
    @Override
    public void handle(HttpExchange exchange) throws IOException {
        // "name=merl", ou null sans filtre
        String query = exchange.getRequestURI().getQuery();
        if (query == null) {
            Json.send(exchange, 200, service.withDetail(service.findAll()));
            return;
        }
        String name = UtilsController.readName(query);
        if (name != null) {
            Json.send(exchange, 200, service.withDetail(service.findByName(name)));
            return;
        }
        Json.send(exchange, 400, Map.of("error", "Filtre inconnu : " + query));
    }
}
