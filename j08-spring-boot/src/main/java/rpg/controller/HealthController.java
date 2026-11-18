package rpg.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import rpg.service.HealthService;

import java.util.Map;

@RestController
public class HealthController {
    private final HealthService service;

    // Pas de new : Spring crée le HealthService, et le donne au contrôleur.
    public HealthController(HealthService service) {
        this.service = service;
    }

    // GET /health, avec un filtre éventuel : /health?name=Lucie
    @GetMapping("/health")
    public Map<String, String> health(@RequestParam(required = false) String name) {
        if (name == null) {
            return Map.of("status", "ok");
        }
        return Map.of("status", service.status(name));
    }
}
