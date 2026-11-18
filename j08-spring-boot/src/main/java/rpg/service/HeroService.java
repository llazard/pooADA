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

    // Exercice 2 : le héros qui porte exactement ce nom, sans tenir compte des majuscules,
    // ou null.
    public Hero findOneByName(String name) {
        for (Hero hero : heroRepository.findAll()) {
            if (hero.getName().equalsIgnoreCase(name)) {
                return hero;
            }
        }
        return null;
    }

    // Exercice 2 : ajouter un héros.
    public void create(Hero hero) {
        heroRepository.create(hero);
    }

    // Exercice 2 : remplace le héros qui porte ce nom, à la même place dans la liste.
    // Renvoie null s'il n'existe pas.
    public Hero update(String name, Hero updated) {
        Hero hero = findOneByName(name);
        if (hero == null) {
            return null;
        }
        List<Hero> heroes = heroRepository.findAll();
        heroes.set(heroes.indexOf(hero), updated);
        return updated;
    }

    // Exercice 2 : supprime le héros qui porte ce nom. Renvoie false s'il n'existe pas.
    public boolean delete(String name) {
        Hero hero = findOneByName(name);
        if (hero == null) {
            return false;
        }
        heroRepository.findAll().remove(hero);
        return true;
    }
}
