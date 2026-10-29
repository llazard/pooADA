package cart;

public class Product {

    private final String name;
    private final int price; // en euros
    private final String category;

    public Product(String name, int price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    // Surcharge du constructeur : sans catégorie, on appelle l'autre avec this(...).
    public Product(String name, int price) {
        this(name, price, "divers");
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }
}
