package rpg.service;

import org.springframework.stereotype.Service;
import rpg.model.Hero;
import rpg.repository.HeroRepository;

import java.util.ArrayList;
import java.util.List;

// Le métier : ce qu'on cherche parmi les héros. Ni HTTP ni JSON ici.
@Service
public class HeroService {
    private final HeroRepository heroRepository;

    public HeroService(HeroRepository heroRepository) {
        this.heroRepository = heroRepository;
    }

    public List<Hero> findAll() {
        return heroRepository.findAll();
    }

    // Les héros dont le nom contient le texte cherché, sans tenir compte des majuscules.
    public List<Hero> findByName(String name) {
        List<Hero> result = new ArrayList<>();
        for (Hero hero : heroRepository.findAll()) {
            if (hero.getName().toLowerCase().contains(name.toLowerCase())) {
                result.add(hero);
            }
        }
        return result;
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

    // Les deux filtres à la fois : le nom contient le texte, et le rôle correspond.
    public List<Hero> findByNameAndRole(String name, String role) {
        List<Hero> result = new ArrayList<>();
        for (Hero hero : heroRepository.findAll()) {
            if (hero.getName().toLowerCase().contains(name.toLowerCase())
                    && hero.getRole().equalsIgnoreCase(role)) {
                result.add(hero);
            }
        }
        return result;
    }
}
