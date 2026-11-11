// Pour lancer la calculatrice et voir ce qu'elle rend, avant de la tester avec JUnit.
public class Main {
    public static void main(String[] args) {
        System.out.println("2 + 3 = " + Calculator.add(2, 3));
        System.out.println("7 - 4 = " + Calculator.subtract(7, 4));
        System.out.println("6 x 7 = " + Calculator.multiply(6, 7));
        System.out.println("7 / 2 = " + Calculator.divide(7, 2));
    }
}
