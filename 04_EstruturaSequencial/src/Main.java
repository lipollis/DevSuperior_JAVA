import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n************************************************************");
        System.out.println("********************* SOMA DE INTEIROS *********************");
        System.out.println("************************************************************\n");

        System.out.println("\nFaça um programa para ler dois valores inteiros, e depois mostrar \n" +
                           "na tela a soma desses números com uma mensagem explicativa, conforme \n" +
                           "exemplos.\n");
        Scanner sc_um = new Scanner(System.in);

        int A_um, B_um, soma_um;
        System.out.println("Digite A: ");
        A_um = sc_um.nextInt();
        System.out.println("Digite B: ");
        B_um = sc_um.nextInt();

        soma_um = A_um + B_um;

        System.out.println("SOMA = " + soma_um);

        sc_um.close();

        System.out.println("\n************************************************************");
        System.out.println("******************* RAIO E ÁREA DO CIRCULO *****************");
        System.out.println("************************************************************\n");

        System.out.println("Faça um programa para ler o valor do raio de um círculo, e depois \n" +
                           "mostrar o valor da área deste círculo com quatro\n" +
                           "casas decimais conforme exemplos.\n" +
                           "Fórmula da área: area = π . raio2\n" +
                           "Considere o valor de π = 3.14159");

        Locale.setDefault(Locale.US);
        Scanner sc_dois = new Scanner(System.in);

        double R_dois, A_dois, pi_dois = 3.14159;

        System.out.println("Digite o valor do raio: ");
        R_dois = sc_dois.nextDouble();

        A_dois = pi_dois * R_dois * R_dois;

        System.out.printf("A=%.4f%n", A_dois);

        sc_dois.close();

        System.out.println("\n************************************************************");
        System.out.println("******************* DIFERENÇA ENTRE PRODUTOS ***************");
        System.out.println("************************************************************\n");

        System.out.println("Fazer um programa para ler quatro valores inteiros A, B, C e D. \n" +
                           "A seguir, calcule e mostre a diferença do produto\n" +
                           "de A e B pelo produto de C e D segundo a fórmula: \n" +
                           "DIFERENCA = (A * B - C * D).\n");

        Scanner sc_tres = new Scanner(System.in);

        int A_tres, B_tres, C_tres, D_tres, dif_tres;

        A_tres = sc_tres.nextInt();
        B_tres = sc_tres.nextInt();
        C_tres = sc_tres.nextInt();
        D_tres = sc_tres.nextInt();

        dif_tres = A_tres * B_tres - C_tres * D_tres;

        System.out.println("DIFERENCA = " + dif_tres);

        sc_tres.close();

        System.out.println("\n************************************************************");
        System.out.println("******************* CÁLC DE HORAS E SALÁRIO ****************");
        System.out.println("************************************************************\n");

        System.out.println("Fazer um programa que leia o número de um funcionário, seu número de \n" +
                           "horas trabalhadas, o valor que recebe por hora e calcula o salário \n" +
                           "desse funcionário. A seguir, mostre o número e o salário do funcionário, \n" +
                           "com duas casas decimais.");

        Locale.setDefault(Locale.US);
        Scanner sc_quatro = new Scanner(System.in);

        int numero_quatro, horas_quatro;
        double valorHora_quatro, salario_quatro;

        numero_quatro = sc_quatro.nextInt();
        horas_quatro = sc_quatro.nextInt();
        valorHora_quatro = sc_quatro.nextDouble();

        salario_quatro = valorHora_quatro * horas_quatro;

        System.out.println("NUMBER = " + numero_quatro);
        System.out.printf("SALARY = U$ %.2f%n", salario_quatro);

        sc_quatro.close();

        System.out.println("\n************************************************************");
        System.out.println("******************* CÁLCULO DO VALOR DE PGTO ***************");
        System.out.println("************************************************************\n");

        System.out.println("Fazer um programa para ler o código de uma peça 1, o número de peças 1,\n" +
                           " o valor unitário de cada peça 1, o código de uma peça 2, o número de \n" +
                           "peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a \n" +
                           "ser pago.");

        Locale.setDefault(Locale.US);
        Scanner sc_cinco = new Scanner(System.in);

        int cod1_cinco, cod2_cinco, qte1_cinco, qte2_cinco;
        double preco1_cinco, preco2_cinco, total_cinco;

        cod1_cinco = sc_cinco.nextInt();
        qte1_cinco = sc_cinco.nextInt();
        preco1_cinco = sc_cinco.nextDouble();

        cod2_cinco = sc_cinco.nextInt();
        qte2_cinco = sc_cinco.nextInt();
        preco2_cinco = sc_cinco.nextDouble();

        total_cinco = preco1_cinco * qte1_cinco + preco2_cinco * qte2_cinco;

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total_cinco);

        sc_cinco.close();

        System.out.println("\n************************************************************");
        System.out.println("********************* ÁREAS GEOMÉTRICAS ********************");
        System.out.println("************************************************************\n");

        System.out.println("Fazer um programa que leia três valores com ponto flutuante de dupla \n" +
                           "precisão: A, B e C. Em seguida, calcule e mostre:\n" +
                           "a) a área do triângulo retângulo que tem A por base e C por altura.\n" +
                           "b) a área do círculo de raio C. (pi = 3.14159)\n" +
                           "c) a área do trapézio que tem A e B por bases e C por altura.\n" +
                           "d) a área do quadrado que tem lado B.\n" +
                           "e) a área do retângulo que tem lados A e B.");

        Locale.setDefault(Locale.US);
        Scanner sc_seis = new Scanner(System.in);

        double A_seis, B_seis, C_seis, triangulo_seis, circulo_seis, trapezio_seis, quadrado_seis, retangulo_seis;

        A_seis = sc_seis.nextDouble();
        B_seis = sc_seis.nextDouble();
        C_seis = sc_seis.nextDouble();

        triangulo_seis = A_seis * C_seis / 2.0;
        circulo_seis = 3.14159 * C_seis * C_seis;
        trapezio_seis = (A_seis + B_seis) / 2.0 * C_seis;
        quadrado_seis = B_seis * B_seis;
        retangulo_seis = A_seis * B_seis;

        System.out.printf("TRIANGULO: %.3f%n", triangulo_seis);
        System.out.printf("CIRCULO: %.3f%n", circulo_seis);
        System.out.printf("TRAPEZIO: %.3f%n", trapezio_seis);
        System.out.printf("QUADRADO: %.3f%n", quadrado_seis);
        System.out.printf("RETANGULO: %.3f%n", retangulo_seis);

        sc_seis.close();
    }
}
