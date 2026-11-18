package rpg.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import rpg.model.HeroDetail;
import rpg.service.HeroService;

import java.util.List;

// Partie optionnelle : les héros, avec la description de leur type.
@RestController
public class HeroDetailController {
    private final HeroService service;

    public HeroDetailController(HeroService service) {
        this.service = service;
    }

    // GET /heroeswithdetail, puis avec un filtre : /heroeswithdetail?name=merl
    @GetMapping("/heroeswithdetail")
    public List<HeroDetail> findAll(@RequestParam(required = false) String name) {
        if (name != null) {
            return service.withDetail(service.findByName(name));
        }
        return service.withDetail(service.findAll());
    }
}
