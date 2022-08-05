import jdk.swing.interop.SwingInterOpUtils;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n************************************************************");
        System.out.println("****************** NEGATIVO E POSITIVO *********************");
        System.out.println("************************************************************\n");

        System.out.println("Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.");

        Scanner sc_um = new Scanner(System.in);

        int N_um = sc_um.nextInt();

        if (N_um < 0) {
            System.out.println("NEGATIVO");
        }
        else {
            System.out.println("NAO NEGATIVO");
        }

        sc_um.close();

        System.out.println("\n************************************************************");
        System.out.println("********************** PAR E IMPAR *************************");
        System.out.println("************************************************************\n");

        System.out.println("Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.");

        Scanner sc_dois = new Scanner(System.in);

        int N_dois = sc_dois.nextInt();

        if (N_dois % 2 == 0) {
            System.out.println("PAR");
        }
        else {
            System.out.println("IMPAR");
        }

        sc_dois.close();

        System.out.println("\n************************************************************");
        System.out.println("******************** NÚMEROS MÚLTIPLOS *********************");
        System.out.println("************************************************************\n");

        System.out.println("Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma \n" +
                           "mensagem 'Sao Multiplos' ou 'Nao sao Multiplos', indicando se os \n" +
                           "valores lidos são múltiplos entre si. Atenção: os números devem poder\n" +
                           " ser digitados em ordem crescente ou decrescente.");

        Scanner sc_tres = new Scanner(System.in);

        int A_tres = sc_tres.nextInt();
        int B_tres = sc_tres.nextInt();

        if (A_tres % B_tres == 0 || B_tres % A_tres == 0) {
            System.out.println("Sao Multiplos");
        }
        else {
            System.out.println("Nao sao Multiplos");
        }

        sc_tres.close();

        System.out.println("\n************************************************************");
        System.out.println("******************** DURAÇÃO DE UM JOGO *********************");
        System.out.println("************************************************************\n");

        Scanner sc_quatro = new Scanner(System.in);

        int horaInicial_quatro = sc_quatro.nextInt();
        int horaFinal_quatro = sc_quatro.nextInt();

        int duracao_quatro;
        if (horaInicial_quatro < horaFinal_quatro) {
            duracao_quatro = horaFinal_quatro - horaInicial_quatro;
        }
        else {
            duracao_quatro = 24 - horaInicial_quatro + horaFinal_quatro;
        }

        System.out.println("O JOGO DUROU " + duracao_quatro + " HORA(S)");

        sc_quatro.close();

        System.out.println("\n************************************************************");
        System.out.println("******************** ESCOLHA SEU PEDIDO *********************");
        System.out.println("************************************************************\n");

        System.out.println("Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade\n" +
                           " deste item. A seguir, calcule e mostre o valor da conta a pagar.\n" +
                           "CODIGO | --- ESPECIFICAÇÃO --- | PREÇO\n" +
                           "  1    | Cachorro quente       | R$ 4.00\n" +
                           "  2    | X-Salada              | R$ 4.50\n" +
                           "  3    | X-Bacon               | R$ 5.00\n" +
                           "  4    | Torrada simples       | R$ 2.00\n" +
                           "  5    | Refrigerante          | R$ 1.50\n");

        Scanner sc_cinco = new Scanner(System.in);

        int codigo_cinco = sc_cinco.nextInt();
        int quantidade_cinco = sc_cinco.nextInt();

        double total_cinco;
        if (codigo_cinco == 1) {
            total_cinco = quantidade_cinco * 4.0;
        }
        else if (codigo_cinco == 2) {
            total_cinco = quantidade_cinco * 4.5;
        }
        else if (codigo_cinco == 3) {
            total_cinco = quantidade_cinco * 5.0;
        }
        else if (codigo_cinco == 4) {
            total_cinco = quantidade_cinco * 2.0;
        }
        else {
            total_cinco = quantidade_cinco * 1.5;
        }

        System.out.printf("Total: R$ %.2f%n", total_cinco);

        sc_cinco.close();

        System.out.println("\n************************************************************");
        System.out.println("******************** INTERVALOS DE OP **********************");
        System.out.println("************************************************************\n");

        System.out.println("Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem\n" +
                           " dizendo em qual dos seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) \n" +
                           "este valor se encontra. Obviamente se o valor não estiver em nenhum destes \n" +
                           "intervalos, deverá ser impressa a mensagem “Fora de intervalo”.");

        Locale.setDefault(Locale.US);
        Scanner sc_seis = new Scanner(System.in);

        double numero_seis = sc_seis.nextDouble();

        if (numero_seis < 0.0 || numero_seis > 100.0) {
            System.out.println("Fora de intervalo");
        }
        else if (numero_seis <= 25.0) {
            System.out.println("Intervalo [0,25]");
        }
        else if (numero_seis <= 50.0) {
            System.out.println("Intervalo (25,50]");
        }
        else if (numero_seis <= 75.0) {
            System.out.println("Intervalo (50,75]");
        }
        else {
            System.out.println("Intervalo (75,100]");
        }

        sc_seis.close();

        System.out.println("\n************************************************************");
        System.out.println("******************** DETERMINE O QUADRANTE *****************");
        System.out.println("************************************************************\n");

        Locale.setDefault(Locale.US);
        Scanner sc_sete = new Scanner(System.in);

        double x_sete = sc_sete.nextDouble();
        double y_sete = sc_sete.nextDouble();

        if (x_sete == 0.0 && y_sete == 0.0) {
            System.out.println("Origem");
        }
        else if (x_sete == 0.0) {
            System.out.println("Eixo Y");
        }
        else if (y_sete == 0.0) {
            System.out.println("Eixo X");
        }
        else if (x_sete > 0.0 && y_sete > 0.0) {
            System.out.println("Q1");
        }
        else if (x_sete < 0.0 && y_sete > 0.0) {
            System.out.println("Q2");
        }
        else if (x_sete < 0.0 && y_sete < 0.0) {
            System.out.println("Q3");
        }
        else {
            System.out.println("Q4");
        }

        sc_sete.close();

        System.out.println("\n************************************************************");
        System.out.println("************************ CÁLCULO DO IR **********************");
        System.out.println("************************************************************\n");

        System.out.println("Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar seus\n" +
                           " impostos, pois sabem que nele não existem políticos corruptos e os recursos arrecadados\n" +
                           " são utilizados em benefício da população, sem qualquer desvio. A moeda deste país é o \n" +
                           "Rombus, cujo símbolo é o R$. Leia um valor com duas casas decimais, equivalente ao salário\n" +
                           " de uma pessoa de Lisarb. Em seguida, calcule e mostre o valor que esta pessoa deve pagar\n" +
                           " de Imposto de Renda, segundo a tabela abaixo.\n" +
                           "--------- Renda ------------ | ---- IR -----\n" +
                           "de 0.00 a R$ 2000.00         |    Isento\n" +
                           "de R$ 2000.01 até R$ 3000.00 |       8%\n" +
                           "de R$ 3000.01 até R$ 4500.00 |       18%\n" +
                           "acima de R$4500.00           |       28%\n" +
                           "\nLembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, \n" +
                           "pois a faixa de salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. \n" +
                           "No exemplo fornecido (abaixo), a taxa é de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que \n" +
                           "resulta em R$ 80.36 no total. O valor deve ser impresso com duas casas decimais.");

        Locale.setDefault(Locale.US);
        Scanner sc_oito = new Scanner(System.in);

        double salario_oito = sc_oito.nextDouble();

        double imposto_oito;
        if (salario_oito <= 2000.0) {
            imposto_oito = 0.0;
        }
        else if (salario_oito <= 3000.0) {
            imposto_oito = (salario_oito - 2000.0) * 0.08;
        }
        else if (salario_oito <= 4500.0) {
            imposto_oito = (salario_oito - 3000.0) * 0.18 + 1000.0 * 0.08;
        }
        else {
            imposto_oito = (salario_oito - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
        }

        if (imposto_oito == 0.0) {
            System.out.println("Isento");
        }
        else {
            System.out.printf("R$ %.2f%n", imposto_oito);
        }

        sc_oito.close();

        System.out.println("\n************************************************************");
        System.out.println("************************ MAIOR DADO **********************");
        System.out.println("************************************************************\n");

        System.out.println("Solicitar 3 entradas e mostrar qual número é o maior entre as entradas.");

        Locale.setDefault(Locale.US);
        Scanner sc_nove = new Scanner(System.in);

        System.out.println("Entre com três números: ");
        int a_nove = sc_nove.nextInt();
        int b_nove = sc_nove.nextInt();
        int c_nove = sc_nove.nextInt();

        int higher_nove = max(a_nove, b_nove,c_nove);
        showResult(higher_nove);

        if (a_nove > b_nove && a_nove > c_nove){
            System.out.println("Higher: " + a_nove);
        } else if (b_nove > c_nove){
            System.out.println("Higher: " +b_nove);
        } else {
            System.out.println("Higher: " +c_nove);
        }

        sc_nove.close();
    }

    public static int max(int x_nove, int y_nove, int z_nove){
        int aux_nove;
        if (x_nove > y_nove && x_nove > z_nove){
            aux_nove = x_nove;
        } else if (y_nove > z_nove){
            aux_nove = y_nove;
        } else {
            aux_nove = z_nove;
        }
        return aux_nove;
    }

    public static void showResult(int value){
        System.out.println("Higher: "+value);
    }


}
