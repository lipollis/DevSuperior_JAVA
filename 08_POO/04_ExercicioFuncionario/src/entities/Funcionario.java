package Entities;

public class Funcionario {

    // ATRIBUTOS
    public String nome;
    public double salarioBruto;
    public double imposto;

    // MÉTODO CALCULO DO SALÁRIO LIQUIDO
    public double salarioLiquido(){
        return salarioBruto - imposto;
    }

    // MÉTODO DE INCREMENTO DE SALÁRIO
    public void incrementoSalario(double porcentagem){
        salarioBruto += salarioBruto * porcentagem / 100;
    }

    //toString
    public String toString(){
        return "\nFuncionário: " + nome + ", " +
               "\nSalário Líquido: $ " + String.format("%.2f", salarioLiquido());
    }

}
