package Application;
import Entities.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class Main_POO {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Enter the measures of triangle X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Enter the measures of triangle Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("Triângulo X tem área: %.4f%n", areaX);
        System.out.printf("Triângulo Y tem área: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("Maior área é de X.");
        } else {
            System.out.println("Maior área é de Y.");
        }
    }
}

