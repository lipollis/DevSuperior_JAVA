package entities;

public class Rent {
    // ATRIBUTOS
    private String name;
    private String email;

    // CONSTRUTOR
    public Rent(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // GETTER & SETTER
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String toString() {
        return name + ", " + email;
    }
}
