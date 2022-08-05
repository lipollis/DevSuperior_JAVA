package Entities;

public class Notas {

    // ATRIBUTOS
    public String nome;
    public double nota_1;
    public double nota_2;
    public double nota_3;

    // MÉTODO PARA CÁLCULO DA NOTA FINAL
    public double notaFinal() {
        return nota_1 + nota_2 + nota_3;
    }

    // MÉTODO QUE CONTABILIZA QUANTOS PONTOS FALTAM PARA A APROVAÇÃO
    public double missingPoints() {
        if (notaFinal() < 60.0) {
            return 60.0 - notaFinal();
        }
        else {
            return 0.0;
        }
    }
}
