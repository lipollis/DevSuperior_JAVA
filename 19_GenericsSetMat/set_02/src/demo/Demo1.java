package demo;

import java.util.HashSet;
import java.util.Set;

public class Demo1 {
//    HashSet - não se importa com a ordem
//    TreeSet - aplica uma ordem
//    LinkedHashSet - apresenta a ordem como foi dada
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("TV");
        set.add("Notebook");
        set.add("Tablet");
        System.out.println(set.contains("Notebook"));
        for (String p : set) {
            System.out.println(p);
        }
    }
}
