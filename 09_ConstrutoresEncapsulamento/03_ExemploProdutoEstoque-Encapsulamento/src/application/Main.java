package Application;

import Entities.Product;

import java.util.Locale;
import java.util.Scanner;
// USO DO GETTER E SETTER
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com os dados do produto: ");
        System.out.print("Nome: ");
        String name = sc.nextLine();
        System.out.print("Preço: ");
        double price = sc.nextDouble();

        Product product = new Product(name, price);
        // TESTANDO O ENCAPSULAMENTO
        product.setName("Computer");
        System.out.print("Atualizando o nome: " + product.getName());

        //
        System.out.println("\nDados do produto: " + product.toString());

        System.out.print("\nEntre com o número de produtos adicionados ao estoque: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);

        System.out.println("\nAtualização: " + product);

        System.out.print("\nEntre com a quantidade de produtos removidos do estoque: ");
        quantity = sc.nextInt();
        product.removeProdutcs(quantity);

        System.out.println("\nAtualização: " + product);

        sc.close();
    }
}
