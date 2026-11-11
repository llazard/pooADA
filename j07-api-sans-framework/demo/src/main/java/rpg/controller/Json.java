package rpg.controller;

import com.sun.net.httpserver.HttpExchange;
import tools.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.OutputStream;

// Fourni : toutes les réponses passent par ici. Jackson transforme l'objet en JSON, puis
// send écrit l'en-tête Content-Type, le code, et le corps.
public class Json {
    private static final ObjectMapper mapper = new ObjectMapper();

    public static void send(HttpExchange exchange, int status, Object body) throws IOException {
        byte[] bytes = mapper.writeValueAsBytes(body);
        exchange.getResponseHeaders().set("Content-Type", "application/json; charset=utf-8");
        exchange.sendResponseHeaders(status, bytes.length);
        try (OutputStream output = exchange.getResponseBody()) {
            output.write(bytes);
        }
    }

    // Exercice 3 : lit le JSON du corps de la requête, et en fait un objet Java.
    public static <T> T read(HttpExchange exchange, Class<T> type) {
        return mapper.readValue(exchange.getRequestBody(), type);
    }
}
