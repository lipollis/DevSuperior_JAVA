package Entities;

public class Retangulo {

    // ATRIBUTOS
    public double largura;
    public double altura;

    // MÉTODO PARA O CÁLCULO DA ÁREA
    public double area(){
        return largura * altura;
    }

    // MÉTODO PARA O CÁLCULO DO PREÍMETRO
    public double perimetro(){
        return 2 * largura + 2 * altura;
    }

    // MÉTODO PARA O CÁLCULO DA DIAGONAL
    public double diagonal(){
        return Math.sqrt(largura * largura + altura * altura);
    }

    // toString
    @Override
    public String toString() {
        return "Retangulo{ 3" +
               "\nlargura=" + largura + ", altura=" + altura +
               "\nArea: " + String.format("%.2f", area()) +
               "\nPerimetro: " + String.format("%.2f", perimetro()) +
               "\nDiagonal: " + String.format("%.2f", diagonal()) +
               "\n}";
    }
}
