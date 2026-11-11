package rpg.controller;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import rpg.repository.HeroRepository;

import java.io.IOException;

public class HeroController implements HttpHandler {
    private final HeroRepository repository;

    public HeroController(HeroRepository repository) {
        this.repository = repository;
    }

    // GET /heroes : tous les héros. Jackson écrit la liste en JSON.
    @Override
    public void handle(HttpExchange exchange) throws IOException {
        Json.send(exchange, 200, repository.findAll());
    }
}
