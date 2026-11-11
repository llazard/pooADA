package heroes;

public class Main {
    public static void main(String[] args) {
        Team team = new Team();
        team.add(new Warrior("Conan", 12));
        team.add(new Mage("Merlin", 9));
        team.add(new Archer("Robin", 5));
        team.printAttacks();
        System.out.println("Le plus fort : " + team.strongest().getName());

        // Étape 2 : chaque héros soigne à sa façon, le guerrier et l'archer renvoient 0.
        System.out.println("L'équipe soigne " + team.totalHealing() + " points de vie");
        System.out.println("Le meilleur soigneur : " + team.bestHealer().getName());

        // Étape 3 : on ajoute un héros, Team ne change pas.
        team.add(new Priest("Frère Tuck", 4));
        team.printAttacks();
        System.out.println("L'équipe soigne " + team.totalHealing() + " points de vie");
        System.out.println("Le meilleur soigneur : " + team.bestHealer().getName());

        // Partie optionnelle
        System.out.println("Tours pour vaincre un boss de 200 points de vie : " + team.roundsToDefeat(200));
    }
}
