package rpg.controller;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.util.Map;

public class HealthController implements HttpHandler {

    // Appelée par le serveur à chaque requête sur /health.
    @Override
    public void handle(HttpExchange exchange) throws IOException {
        Json.send(exchange, 200, Map.of("status", "ok"));
    }
}
