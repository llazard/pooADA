package rpg.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import rpg.model.Hero;
import rpg.service.HeroService;

import java.util.List;

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
}
