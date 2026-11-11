package demo;

public class Duck extends Animal implements Swimmer {

    public Duck(String name, int age) {
        super(name, age);
    }

    @Override
    public String makeSound() {
        return "Coin coin";
    }

    @Override
    public String swim() {
        return getName() + " flotte et pagaie.";
    }
}
