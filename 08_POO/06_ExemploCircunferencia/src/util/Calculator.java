package Util;

public class Calculator {
    /* VERSÃO 3*/
    public static final double PI = 3.14159; //valor constante sempre em maiúsculo

    public static double circunferencia(double raio){
        return 2 * PI * raio;
    }

    public static double volume(double raio){
        return 4 * PI * raio * raio * raio /3;
    }

    /* VERSÃO 2
    public final double PI = 3.14159; //valor constante sempre em maiúsculo

    public double circunferencia(double raio){
        return 2 * PI * raio;
    }

    public double volume(double raio){
        return 4 * PI * raio * raio * raio /3;
    }*/
}
