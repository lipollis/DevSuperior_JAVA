package Entities;

public class Product {
    // ATRIBUTOS
    public String name;
    public double price;
    public int quantity;

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
