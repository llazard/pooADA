package cart;

public class Main {
    public static void main(String[] args) {
        Cart cart = new Cart();
        cart.add(new Product("Carnet", 4));
        System.out.println("Total : " + cart.total() + " €");
    }
}
