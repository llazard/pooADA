package heroes;

public class Main {
    public static void main(String[] args) {
        Hero conan = new Warrior("Conan", 12);
        System.out.println(conan.getName() + " inflige " + conan.attack() + " dégâts");
    }
}
