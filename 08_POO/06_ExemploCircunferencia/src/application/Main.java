package Application;

import Util.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class Main {
/* VERSÃO 3 */
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com o valor do raio: ");
        double raio = sc.nextDouble();

        double c = Calculator.circunferencia(raio);
        double v = Calculator.volume(raio);

        System.out.printf("Circunferência: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("Valor de PI: %.2f%n", Calculator.PI);


        sc.close();

    }

    /* VERSÃO 2
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Calculator calc = new Calculator();
        System.out.print("Entre com o valor do raio: ");
        double raio = sc.nextDouble();

        double c = calc.circunferencia(raio);
        double v = calc.volume(raio);

        System.out.printf("Circunferência: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("Valor de PI: %.2f%n", calc.PI);


        sc.close();
    }*/

    /* VERSÃO 1
    public static final double PI = 3.14159; //valor constante sempre em maiúsculo
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com o valor do raio: ");
        double raio = sc.nextDouble();

        double c = circunferencia(raio);
        double v = volume(raio);

        System.out.printf("Circunferência: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("Valor de PI: %.2f%n", PI);


        sc.close();
    }

    public static double circunferencia(double raio){
        return 2 * PI * raio;
    }

    public static double volume(double raio){
        return 4 * PI * raio * raio * raio /3;
    }*/
}
