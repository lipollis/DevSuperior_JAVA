package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add(2, "Marco");   //add uma string numa posição específica
        System.out.println(list.size());
        for (String x : list) { //forEACH que percorre a lista
            System.out.println(x);
        }
        System.out.println("---------------------");
        list.removeIf(x -> x.charAt(0) == 'M'); //predicado - remove todos em que o nome inicia com M, usa função lambda
        for (String x : list) {
            System.out.println(x);
        }
        System.out.println("---------------------");
        System.out.println("Index of Bob: " + list.indexOf("Bob"));//encontra a posição de Bob
        System.out.println("Index of Marco: " + list.indexOf("Marco"));//qdo não encontra, retorna '-1'
        System.out.println("---------------------");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        for (String x : result) {
            System.out.println(x);
        }
        System.out.println("---------------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
        System.out.println(name);
    }
}
