import jdk.swing.interop.SwingInterOpUtils;

import java.util.Locale;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("\n************************************************************");
        System.out.println("****************** CONFERÊNCIA DE SENHA *********************");
        System.out.println("************************************************************\n");

        System.out.println("Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada\n" +
                           " leitura de senha incorreta informada, escrever a mensagem 'Senha Invalida'. Quando a senha\n" +
                           " for informada corretamente deve ser impressa a mensagem 'Acesso Permitido' e o algoritmo \n" +
                           "encerrado. Considere que a senha correta é o valor 2002.");

        Scanner sc_um = new Scanner(System.in);

        int senha_um = sc_um.nextInt();

        while (senha_um != 2002) {
            System.out.println("Senha Invalida");
            senha_um = sc_um.nextInt();
        }

        System.out.println("Acesso Permitido");

        sc_um.close();

        System.out.println("\n************************************************************");
        System.out.println("****************** FIM QUANDO VALOR NULO *******************");
        System.out.println("************************************************************\n");

        System.out.println("Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos\n" +
                           " no sistema cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O\n" +
                           " algoritmo será encerrado quando pelo menos uma de duas coordenadas for NULA (nesta \n" +
                           "situação sem escrever mensagem alguma).");

        Scanner sc_dois = new Scanner(System.in);

        int x_dois = sc_dois.nextInt();
        int y_dois = sc_dois.nextInt();

        while (x_dois != 0 && y_dois != 0) {
            if (x_dois > 0 && y_dois > 0) {
                System.out.println("primeiro");
            }
            else if (x_dois < 0 && y_dois > 0) {
                System.out.println("segundo");
            }
            else if (x_dois < 0 && y_dois < 0) {
                System.out.println("terceiro");
            }
            else {
                System.out.println("quarto");
            }
            x_dois = sc_dois.nextInt();
            y_dois = sc_dois.nextInt();
        }

        sc_dois.close();

        System.out.println("\n************************************************************");
        System.out.println("****************** ESCOLHA DO COMBUSTÍVEL *******************");
        System.out.println("************************************************************\n");

        System.out.println("Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus\n" +
                           " clientes. Escreva um algoritmo para ler o tipo de combustível abastecido (codificado da\n" +
                           " seguinte forma: 1.Álcool 2.Gasolina 3.Diesel 4.Fim). Caso o usuário informe um código\n" +
                           " inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até que seja válido).\n" +
                           " O programa será encerrado quando o código informado for o número 4. Deve ser escrito a\n" +
                           "mensagem: 'MUITO OBRIGADO' e a quantidade de clientes que abasteceram cada tipo de \n" +
                           "combustível, conforme exemplo.");

        Scanner sc_tres = new Scanner(System.in);

        int alcool_tres = 0;
        int gasolina_tres = 0;
        int diesel_tres = 0;

        int tipo_tres = sc_tres.nextInt();

        while (tipo_tres != 4) {
            if (tipo_tres == 1) {
                alcool_tres = alcool_tres + 1;
            }
            else if (tipo_tres == 2) {
                gasolina_tres = gasolina_tres + 1;
            }
            else if (tipo_tres == 3) {
                diesel_tres = diesel_tres + 1;
            }

            tipo_tres = sc_tres.nextInt();
        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool_tres);
        System.out.println("Gasolina: " + gasolina_tres);
        System.out.println("Diesel: " + diesel_tres);

        sc_tres.close();

        System.out.println("\n************************************************************");
        System.out.println("********************* LISTA DE IMPARES **********************");
        System.out.println("************************************************************\n");

        Scanner sc_quatro = new Scanner(System.in);

        int x_quatro = sc_quatro.nextInt();

        for (int i=1; i<=x_quatro; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

        sc_quatro.close();

        System.out.println("\n************************************************************");
        System.out.println("********************* DENTRO OU FORA DO INTERVALO ***********");
        System.out.println("************************************************************\n");

        System.out.println("Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos\n" +
                           " em seguida. Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos \n" +
                           "estão fora do intervalo, mostrando essas informações conforme exemplo (use a palavra 'in' \n" +
                           "para dentro do intervalo, e 'out' para fora do intervalo).");

        Scanner sc_cinco = new Scanner(System.in);

        int n_cinco = sc_cinco.nextInt();

        int in_cinco = 0;
        int out_cinco = 0;

        for (int i=0; i<n_cinco; i++) {
            int x_cinco = sc_cinco.nextInt();
            if (x_cinco >= 10 && x_cinco <= 20) {
                in_cinco = in_cinco + 1;
            }
            else {
                out_cinco = out_cinco + 1;
            }
        }

        System.out.println(in_cinco + " in");
        System.out.println(out_cinco + " out");

        sc_cinco.close();

        System.out.println("\n************************************************************");
        System.out.println("********************* MÉDIA PONDERADA **********************");
        System.out.println("************************************************************\n");

        System.out.println("Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada\n" +
                           " caso de teste consiste de 3 valores reais, cada um deles com uma casa decimal. Apresente\n" +
                           " a média ponderada para cada um destes conjuntos de 3 valores, sendo que o primeiro valor\n" +
                           " tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem peso 5");

        Locale.setDefault(Locale.US);
        Scanner sc_seis = new Scanner(System.in);

        int n_seis = sc_seis.nextInt();

        for (int i=0; i<n_seis; i++) {

            double a_seis = sc_seis.nextDouble();
            double b_seis = sc_seis.nextDouble();
            double c_seis = sc_seis.nextDouble();

            double media_seis = (a_seis * 2.0 + b_seis * 3.0 + c_seis * 5.0) / 10.0;

            System.out.printf("%.1f%n", media_seis);
        }

        sc_seis.close();

        System.out.println("\n************************************************************");
        System.out.println("********************* DIVISÃO IMPOSSIVEL ********************");
        System.out.println("************************************************************\n");

        System.out.println("Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão\n" +
                           " do primeiro pelo segundo. Se o denominador for igual a zero, mostrar a mensagem " +
                           "'divisao impossivel'.");

        Scanner sc_sete = new Scanner(System.in);

        int n_sete = sc_sete.nextInt();

        for (int i=0; i<n_sete; i++) {

            int x_sete = sc_sete.nextInt();
            int y_sete = sc_sete.nextInt();

            if (y_sete == 0) {
                System.out.println("divisao impossivel");
            }
            else {
                double div_sete = (double) x_sete / y_sete;
                System.out.printf("%.1f%n", div_sete);
            }
        }

        sc_sete.close();

        System.out.println("\n************************************************************");
        System.out.println("********************* FATORIAL ******************************");
        System.out.println("************************************************************\n");

        System.out.println("Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de\n" +
                           " N = N * (N-1) * (N-2) * (N-3) * ... * 1. Lembrando que, por definição, fatorial de 0 é 1.");

        Scanner sc_oito = new Scanner(System.in);

        int n_oito = sc_oito.nextInt();

        int fat_oito = 1;
        for (int i=1; i<=n_oito; i++) {
            fat_oito = fat_oito * i;
        }

        System.out.println(fat_oito);

        sc_oito.close();

        System.out.println("\n************************************************************");
        System.out.println("********************* CALCULAR DIVISORES *******************");
        System.out.println("************************************************************\n");

        System.out.println("Ler um número inteiro N e calcular todos os seus divisores.");

        Scanner sc_nove = new Scanner(System.in);

        int n_nove = sc_nove.nextInt();

        for (int i=1; i<=n_nove; i++) {
            if (n_nove % i == 0) {
                System.out.println(i);
            }
        }

        sc_nove.close();

        System.out.println("\n************************************************************");
        System.out.println("********************* QUADRADO E CUBO DE N *****************");
        System.out.println("************************************************************\n");

        System.out.println("Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na\n" +
                           " tela N linhas, começando de 1 até N. Para cada linha, mostrar o número da linha, depois\n" +
                           " o quadrado e o cubo do valor, conforme exemplo.");

        Scanner sc_dez = new Scanner(System.in);

        int n_dez = sc_dez.nextInt();

        for (int i=1; i<=n_dez; i++) {

            int primeiro_dez = i;
            int segundo_dez = i * i;
            int terceiro_dez = i * i * i;
            System.out.printf("%d %d %d%n", primeiro_dez, segundo_dez, terceiro_dez);
        }

        sc_dez.close();

        System.out.println("\n************************************************************");
        System.out.println("************************ DO WHILE ***************************");
        System.out.println("************************************************************\n");

        System.out.println("Fazer um programa para ler uma temperatura em Celsius e mostrar o equivalente em\n" +
                           "Fahrenheit. Perguntar se o usuário deseja repetir (s/n). Caso digite 's' repetir o\n" +
                           "programa. Formula: F=(9*C/5)+32");

        Locale.setDefault(Locale.US);
        Scanner sc_onze = new Scanner(System.in);

        char resp_onze;

        do{
            System.out.println("Digite a temperatura em Celsius: ");
            double C_onze = sc_onze.nextDouble();
            double F_onze = (9*C_onze/5)+32;
            System.out.printf("Equivalente em Fahrenheit: %.2f%n", F_onze);

            System.out.print("Deseja repetir (s/n)? ");
            resp_onze = sc_onze.next().charAt(0);
        } while (resp_onze != 'n');

        sc_onze.close();
    }
}
