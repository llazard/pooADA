package cart;

import java.util.ArrayList;
import java.util.List;
public class Cart {
    private final List<Product> products = new ArrayList<>();
    public void add(Product product) { products.add(product); }
    public int total() {
        int total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }
}
