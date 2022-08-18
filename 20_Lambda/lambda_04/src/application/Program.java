package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import entities.Product;

public class Program {

    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        // primeiro converte uma list em strem, depois aplica a função UpperCase para todos os elementos
        // (coleção de valores) e, por fim transforma de novo a stream em list
        List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());
//        List<String> names = list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());
//        List<String> names = list.stream().map(Product::nonStaticUpperCaseName).collect(Collectors.toList());

//        Function<Product, String> func = p -> getName().toUpperCase();
//        List<String> names = list.stream().map(func).collect(Collectors.toList());

        names.forEach(System.out::println);

    }
}