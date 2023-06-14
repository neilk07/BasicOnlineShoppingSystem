package ShoppingSystem;

// User class representing a user of the system
class User {
    private String name;
    private String email;
    private String password;

    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    // Getters and setters

    public String getName() {
        return name;
    }
}
