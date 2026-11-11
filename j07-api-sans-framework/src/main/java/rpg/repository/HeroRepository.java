package rpg.repository;

import rpg.model.Hero;

import java.util.ArrayList;
import java.util.List;

// Les héros, gardés en mémoire : ils repartent de zéro à chaque redémarrage.
public class HeroRepository {
    private final List<Hero> heroes = new ArrayList<>();

    public HeroRepository() {
        heroes.add(new Hero("Conan", "warrior", 12));
        heroes.add(new Hero("Merlin", "mage", 18));
        heroes.add(new Hero("Robin", "archer", 7));
        heroes.add(new Hero("Frère Tuck", "priest", 5));
        heroes.add(new Hero("Morgane", "mage", 9));
        heroes.add(new Hero("Lancelot", "warrior", 15));
    }

    public List<Hero> findAll() {
        return heroes;
    }
}
