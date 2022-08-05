package Application;

import Entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com os dados do produto: ");
        System.out.print("Nome: ");
        String name = sc.nextLine();
        System.out.print("Preço: ");
        double price = sc.nextDouble();
        System.out.print("Quantidade em estoque: ");
        int quantity = sc.nextInt();

        Product product = new Product(name, price, quantity);

        System.out.println("\nDados do produto: " + product.toString());

        System.out.print("\nEntre com o número de produtos adicionados ao estoque: ");
        quantity = sc.nextInt();
        product.addProducts(quantity);

        System.out.println("\nAtualização: " + product);

        System.out.print("\nEntre com a quantidade de produtos removidos do estoque: ");
        quantity = sc.nextInt();
        product.removeProdutcs(quantity);

        System.out.println("\nAtualização: " + product);

        sc.close();
    }
}
