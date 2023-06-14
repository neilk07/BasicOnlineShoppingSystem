package ShoppingSystem;

import java.util.ArrayList;
import java.util.HashMap;
public class OnlineShoppingSystem {
    private HashMap<String, User> users;
    private ArrayList<Product> products;

    public OnlineShoppingSystem() {
        users = new HashMap<>();
        products = new ArrayList<>();
    }

    // Method to register a new user
    public void registerUser(String name, String email, String password) {
        User user = new User(name, email, password);
        users.put(email, user);
    }

    // Method to add a product
    public void addProduct(String name, double price) {
        Product product = new Product(name, price);
        products.add(product);
    }

    // Method to display the product catalog
    public void displayCatalog() {
        for (Product product : products) {
            System.out.println(product.getName() + " - " + product.getPrice());
        }
    }

    public static void main(String[] args) {
        OnlineShoppingSystem system = new OnlineShoppingSystem();

        // Register users
        system.registerUser("John Doe", "john@example.com", "password123");
        system.registerUser("Jane Smith", "jane@example.com", "password456");

        // Add products
        system.addProduct("Product 1", 10.0);
        system.addProduct("Product 2", 20.0);

        // Display the product catalog
        System.out.println("Product Catalog:");
        system.displayCatalog();
    }
}
