package cart;

public class Main {
    public static void main(String[] args) {
        // Consigne 1 : deux constructeurs.
        Product notebook = new Product("Carnet", 4, "papeterie");
        Product pen = new Product("Stylo", 2);
        System.out.println(notebook.getName() + " : " + notebook.getCategory());
        System.out.println(pen.getName() + " : " + pen.getCategory());

        // Consigne 2 : plusieurs exemplaires.
        Cart cart = new Cart();
        cart.add(notebook);
        cart.add(pen, 3);
        System.out.println("Total : " + cart.total() + " €");

        // Consigne 3 : un article saisi à la main.
        cart.add("Gomme", 1);
        System.out.println("Total : " + cart.total() + " €");

        // Consigne 4 : une remise.
        System.out.println("Avec 10 % de remise : " + cart.total(10) + " €");

        // Consigne 5 : le total d'une catégorie.
        System.out.println("Papeterie : " + cart.total("papeterie") + " €");
        System.out.println("Divers : " + cart.total("divers") + " €");

        // Partie optionnelle
        cart.add(new Product("Règle", 3), new Product("Colle", 2));
        System.out.println("Total : " + cart.total() + " €");
    }
}
