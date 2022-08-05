package Application;

import Entities.Notas;

import java.util.Locale;
import java.util.Scanner;

/*
Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres do ano
(primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar qual a nota final do aluno no
ano. Dizer também se o aluno está aprovado (PASS) ou não (FAILED) e, em caso negativo, quantos pontos faltam
para o aluno obter o mínimo para ser aprovado (que é 60% da nota). Você deve criar uma classe Student para
resolver este problema
 */

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Notas aluno = new Notas();

        System.out.print("Nome do aluno: ");
        aluno.nome = sc.nextLine();
        System.out.print("Informe a nota 01: ");
        aluno.nota_1 = sc.nextDouble();
        System.out.print("Informe a nota 02: ");
        aluno.nota_2 = sc.nextDouble();
        System.out.print("Informe a nota 03: ");
        aluno.nota_3 = sc.nextDouble();

        System.out.printf("FINAL GRADE: %.2f%n", aluno.notaFinal());

        if (aluno.notaFinal() < 60.0) {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS%n", aluno.missingPoints());
        }
        else {
            System.out.println("PASS");
        }
        sc.close();

    }
}
