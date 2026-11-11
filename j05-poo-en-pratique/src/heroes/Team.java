package heroes;

import java.util.ArrayList;
import java.util.List;

// L'équipe ne connaît que le contrat Hero, jamais Warrior, Mage ou Archer.
public class Team {
    private final List<Hero> heroes = new ArrayList<>();

    public void add(Hero hero) {
        heroes.add(hero);
    }

    public int totalDamage() {
        int total = 0;
        for (Hero hero : heroes) {
            total += hero.attack();
        }
        return total;
    }

    public Hero strongest() {
        Hero strongest = null;
        for (Hero hero : heroes) {
            if (strongest == null || hero.attack() > strongest.attack()) {
                strongest = hero;
            }
        }
        return strongest;
    }

    // Étape 2
    public int totalHealing() {
        int total = 0;
        for (Hero hero : heroes) {
            total += hero.heal();
        }
        return total;
    }

    public Hero bestHealer() {
        Hero best = null;
        for (Hero hero : heroes) {
            if (best == null || hero.heal() > best.heal()) {
                best = hero;
            }
        }
        return best;
    }

    public void printAttacks() {
        for (Hero hero : heroes) {
            System.out.println(hero.getName() + " inflige " + hero.attack() + " dégâts et soigne "
                    + hero.heal() + " points de vie");
        }
        System.out.println("L'équipe inflige " + totalDamage() + " dégâts");
    }

    // Partie optionnelle : combien de tours pour vaincre un boss ?
    public int roundsToDefeat(int bossHealth) {
        int rounds = 0;
        int remaining = bossHealth;
        while (remaining > 0) {
            remaining -= totalDamage();
            rounds++;
        }
        return rounds;
    }
}
