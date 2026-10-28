package demo;

public class Dog extends Animal implements Swimmer {

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public String makeSound() {
        return "Wouf";
    }

    @Override
    public String swim() {
        return getName() + " nage la tête hors de l'eau.";
    }
}
