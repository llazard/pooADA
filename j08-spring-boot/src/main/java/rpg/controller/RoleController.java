package rpg.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import rpg.model.Role;
import rpg.service.RoleService;

import java.util.Map;

// Partie optionnelle : les types de héros.
@RestController
public class RoleController {
    private final RoleService service;

    public RoleController(RoleService service) {
        this.service = service;
    }

    // GET /roles : tous les types. Avec un filtre : /roles?name=mage
    @GetMapping("/roles")
    public ResponseEntity<Object> findAll(@RequestParam(required = false) String name) {
        if (name == null) {
            return ResponseEntity.ok(service.findAll());
        }
        Role role = service.findByName(name);
        if (role == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(Map.of("error", "Type " + name + " introuvable"));
        }
        return ResponseEntity.ok(role);
    }
}
