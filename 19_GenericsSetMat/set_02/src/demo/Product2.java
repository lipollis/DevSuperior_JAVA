package demo;

public class Product2 implements Comparable<Product2> {
    private String name;
    private Double price;
    public Product2(String name, Double price) {
        this.name = name;
        this.price = price;
    }
    // (... get / set / hashCode / equals)
    @Override
    public String toString() {
        return "Product [name=" + name + ", price=" + price + "]";
    }
    @Override
    public int compareTo(Product2 other) {
        return name.toUpperCase().compareTo(other.getName().toUpperCase());
    }
}
