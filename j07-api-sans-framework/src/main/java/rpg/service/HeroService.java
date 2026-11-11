package rpg.service;

import rpg.model.Hero;
import rpg.model.HeroDetail;
import rpg.model.Role;
import rpg.repository.HeroRepository;

import java.util.ArrayList;
import java.util.List;

// Le métier : ce qu'on cherche parmi les héros. Ni HTTP ni JSON ici.
public class HeroService {
    private final HeroRepository heroRepository;
    private final RoleService roleService; // partie optionnelle

    public HeroService(HeroRepository heroRepository, RoleService roleService) {
        this.heroRepository = heroRepository;
        this.roleService = roleService;
    }

    public List<Hero> findAll() {
        return heroRepository.findAll();
    }

    public List<Hero> findByRole(String role) {
        List<Hero> result = new ArrayList<>();
        for (Hero hero : heroRepository.findAll()) {
            if (hero.getRole().equalsIgnoreCase(role)) {
                result.add(hero);
            }
        }
        return result;
    }

    // Les héros dont le nom contient le texte cherché, sans tenir compte des majuscules.
    public List<Hero> findByName(String text) {
        List<Hero> result = new ArrayList<>();
        for (Hero hero : heroRepository.findAll()) {
            if (hero.getName().toLowerCase().contains(text.toLowerCase())) {
                result.add(hero);
            }
        }
        return result;
    }

    // Partie optionnelle : chaque héros de la liste, avec la description de son type.
    public List<HeroDetail> withDetail(List<Hero> heroes) {
        List<HeroDetail> result = new ArrayList<>();
        for (Hero hero : heroes) {
            Role role = roleService.findByName(hero.getRole());
            result.add(new HeroDetail(hero.getName(), hero.getRole(), hero.getLevel(),
                    role.getDescription()));
        }
        return result;
    }
}
