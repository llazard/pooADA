package rpg.controller;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import rpg.model.Role;
import rpg.service.RoleService;

import java.io.IOException;
import java.util.Map;

public class RoleController implements HttpHandler {
    private final RoleService service;

    public RoleController(RoleService service) {
        this.service = service;
    }

    // GET /roles : tous les types. Partie optionnelle de l'exercice 2 : /roles?name=mage
    @Override
    public void handle(HttpExchange exchange) throws IOException {
        // "name=mage", ou null sans filtre
        String query = exchange.getRequestURI().getQuery();
        if (query == null) {
            Json.send(exchange, 200, service.findAll());
            return;
        }
        String name = UtilsController.readName(query);
        if (name == null) {
            Json.send(exchange, 400, Map.of("error", "Filtre inconnu : " + query));
            return;
        }
        Role role = service.findByName(name);
        if (role == null) {
            Json.send(exchange, 404, Map.of("error", "Type " + name + " introuvable"));
            return;
        }
        Json.send(exchange, 200, role);
    }
}
