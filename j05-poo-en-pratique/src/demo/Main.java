package demo;

public class Main {
    public static void main(String[] args) {
        Dog rex = new Dog("Rex", 4);
        Cat felix = new Cat("Félix", 2);
        Duck donald = new Duck("Donald", 3);

        // Polymorphisme par héritage : une boucle, la bonne version de makeSound().
        Animal[] animals = { rex, felix, donald };
        for (Animal animal : animals) {
            System.out.println(animal.getInformation());
        }

        // Polymorphisme de méthode : le compilateur choisit selon les paramètres.
        System.out.println(felix.eat());
        System.out.println(felix.eat("des croquettes"));
        System.out.println(felix.eat("poisson", 50));

        // Interface : un chien et un canard, deux classes qui savent nager.
        Swimmer[] swimmers = { rex, donald };
        for (Swimmer swimmer : swimmers) {
            System.out.println(swimmer.swim());
        }
    }
}
