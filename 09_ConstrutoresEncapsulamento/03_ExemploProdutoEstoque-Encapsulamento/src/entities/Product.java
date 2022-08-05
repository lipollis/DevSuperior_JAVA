package Entities;

public class Product {
    // ATRIBUTOS
    private String name;
    private double price;
    private int quantity;

    // CONSTRUTOR
    public Product(){
    }

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        this.quantity = 0; //opcional
    }

    // MÉTODO QUE CALCULA O ESTOQUE PELO PREÇO UNITÁRIO PELA QUANTIDADE
    public double totalValueInStock(){
        return price * quantity;
    }

    // MÉTODO PARA ADD PRODUTOS NO ESTOQUE
    public void addProducts (int quantity){
        this.quantity += quantity; //soma o argumento 'quantity' ao atributo da classe this.quantity
    }

    // MÉTODO
    public void removeProdutcs (int quantity){
        this.quantity -= quantity;
    }

    // GETTER & SETTER
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    // toString - CONVERTE O OBJETO PARA STRING
    @Override
    public String toString() {
        return name
               + ", $ "
               + String.format("%.2f", price)
               + ", "
               + quantity
               + " units, Total: $ "
               + String.format("%.2f", totalValueInStock());
    }
}
