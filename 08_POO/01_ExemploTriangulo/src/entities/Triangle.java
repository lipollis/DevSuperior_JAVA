package Entities;

public class Triangle {

    // ATRIBUTOS DA CLASSE
    public double a;
    public double b;
    public double c;

    // MÉTODO: FUNÇÃO PARA CALCULAR A ÁREA
    public double area(){
        double p = (a + b + c) /2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
