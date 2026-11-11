package rpg.controller;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import rpg.repository.RoleRepository;

import java.io.IOException;

public class RoleController implements HttpHandler {
    private final RoleRepository repository;

    public RoleController(RoleRepository repository) {
        this.repository = repository;
    }

    // GET /roles : tous les types de héros.
    @Override
    public void handle(HttpExchange exchange) throws IOException {
        Json.send(exchange, 200, repository.findAll());
    }
}
