package rpg.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import rpg.model.Hero;
import rpg.service.HeroService;

import java.util.List;
import java.util.Map;

@RestController
public class HeroController {
    private final HeroService service;

    public HeroController(HeroService service) {
        this.service = service;
    }

    // GET /heroes, avec des filtres éventuels : ?name=merl, ?role=mage, ou les deux
    @GetMapping("/heroes")
    public List<Hero> findAll(@RequestParam(required = false) String name,
                              @RequestParam(required = false) String role) {
        if (name != null && role != null) {
            return service.findByNameAndRole(name, role);
        }
        if (name != null) {
            return service.findByName(name);
        }
        if (role != null) {
            return service.findByRole(role);
        }
        return service.findAll();
    }

    // Exercice 2 : POST /heroes, le héros en JSON dans le corps de la requête.
    @PostMapping("/heroes")
    public ResponseEntity<Hero> create(@RequestBody Hero hero) {
        service.create(hero);
        return ResponseEntity.status(HttpStatus.CREATED).body(hero);
    }

    // Exercice 2 : PUT /heroes/Robin, la nouvelle version du héros dans le corps.
    @PutMapping("/heroes/{name}")
    public ResponseEntity<Object> update(@PathVariable String name, @RequestBody Hero hero) {
        Hero updated = service.update(name, hero);
        if (updated == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(Map.of("error", "Héros " + name + " introuvable"));
        }
        return ResponseEntity.ok(updated);
    }

    // Exercice 2 : DELETE /heroes/Conan
    @DeleteMapping("/heroes/{name}")
    public ResponseEntity<Object> delete(@PathVariable String name) {
        if (!service.delete(name)) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(Map.of("error", "Héros " + name + " introuvable"));
        }
        return ResponseEntity.noContent().build();
    }
}
