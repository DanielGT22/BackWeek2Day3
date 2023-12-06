import entities.Product;

import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Product> products = List.of(
                new Product(1, "Corso Fullstack Epicode", "Education", 5300.0),
                new Product(2, "Berserk Eclipse Edition", "Books", 300.9),
                new Product(3, "Berserk Deluxe Edition", "Books", 50.0),
                new Product(4, "Amd RYZEN 5 3600 6x4.2GHZ", "Electronics", 109.80)
        );

        List<Product> libriCostosi = products.stream()
                .filter(product -> product.getCategory().equals("Books") && product.getPrice() >= 100)
                .collect(Collectors.toList());
        System.out.println(" Libri sopra i 100 euro: ");
        libriCostosi.forEach(product -> System.out.println(product));
    }
}