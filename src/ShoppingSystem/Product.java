package ShoppingSystem;

// Product class representing a product
class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Getters and setters

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
