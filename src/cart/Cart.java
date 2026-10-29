package cart;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private final List<Product> products = new ArrayList<>();

    public void add(Product product) {
        products.add(product);
    }

    // Consigne 2 : plusieurs exemplaires.
    public void add(Product product, int quantity) {
        for (int i = 0; i < quantity; i++) {
            add(product);
        }
    }

    // Consigne 3 : un article saisi à la main.
    public void add(String name, int price) {
        add(new Product(name, price));
    }

    // Partie optionnelle : un nombre variable de produits.
    public void add(Product... several) {
        for (Product product : several) {
            add(product);
        }
    }

    public int total() {
        int total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }

    // Consigne 4 : une remise.
    public double total(int discountPercent) {
        return total() * (100 - discountPercent) / 100.0;
    }

    // Consigne 5 : un seul paramètre, comme la remise, mais d'un autre type.
    public int total(String category) {
        int total = 0;
        for (Product product : products) {
            if (product.getCategory().equals(category)) {
                total += product.getPrice();
            }
        }
        return total;
    }
}
