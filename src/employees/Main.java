package employees;

public class Main {
    public static void main(String[] args) {
        Employee alice = new Developer("Alice", 2500);
        System.out.println(alice.getInformation());
    }
}
