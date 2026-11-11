package demo;

// Démo du cours : la classe mère, abstraite, de tous les animaux.
public abstract class Animal {

    // Encapsulation : l'état est caché, on ne le lit que par des méthodes.
    private final String name;
    private final int age;

    public Animal(String name, int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Âge invalide");
        }
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Abstraction : chaque animal a un cri, mais Animal ne sait pas lequel.
    public abstract String makeSound();

    // Écrite une seule fois, elle appelle la bonne version de makeSound().
    public String getInformation() {
        return name + " (" + age + " ans) : " + makeSound();
    }

    // Surcharge : trois méthodes eat, distinguées par leurs paramètres.
    public String eat() {
        return name + " mange.";
    }

    public String eat(String food) {
        return name + " mange " + food + ".";
    }

    public String eat(String food, int grams) {
        return name + " mange " + grams + " g de " + food + ".";
    }
}
