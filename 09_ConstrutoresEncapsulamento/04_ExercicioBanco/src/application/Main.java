package application;

import entities.Account;

import java.util.Locale;
import java.util.Scanner;

/*
Em um banco, para se cadastrar uma conta bancária, é necessário informar o número da conta, o nome do
titular da conta, e o valor de depósito inicial que o titular depositou ao abrir a conta. Este valor de depósito
inicial, entretanto, é opcional, ou seja: se o titular não tiver dinheiro a depositar no momento de abrir sua
conta, o depósito inicial não será feito e o saldo inicial da conta será, naturalmente, zero.
Importante: uma vez que uma conta bancária foi aberta, o número da conta nunca poderá ser alterado. Já
o nome do titular pode ser alterado (pois uma pessoa pode mudar de nome por ocasião de casamento, por
exemplo).
Por fim, o saldo da conta não pode ser alterado livremente. É preciso haver um mecanismo para proteger
isso. O saldo só aumenta por meio de depósitos, e só diminui por meio de saques. Para cada saque
realizado, o banco cobra uma taxa de $ 5.00. Nota: a conta pode ficar com saldo negativo se o saldo não for
suficiente para realizar o saque e/ou pagar a taxa.
Você deve fazer um programa que realize o cadastro de uma conta, dando opção para que seja ou não
informado o valor de depósito inicial. Em seguida, realizar um depósito e depois um saque, sempre
mostrando os dados da conta após cada operação.
 */
public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account conta;

        System.out.print("Entre com o número da conta: ");
        int number = sc.nextInt();
        System.out.print("Informe o nome da conta: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.print("Tem um depósito inicial (s/n)? ");
        char response = sc.next().charAt(0);
        if (response == 's'){
            System.out.print("Informe o valor do depósito inicial: ");
            double initialDeposit = sc.nextDouble();
            conta = new Account(number, holder, initialDeposit);
        } else{
            conta = new Account(number, holder);
        }

        System.out.println("\nDados da conta: " + conta);

        System.out.print("\nEntre com o valor do depósito: ");
        double depositValue = sc.nextDouble();
        conta.deposit(depositValue);
        System.out.println("\nAtualizando a conta: " + conta);

        System.out.print("\nEntre com o valor do saque: ");
        double withdrawValue = sc.nextDouble();
        conta.withdraw(withdrawValue);
        System.out.println("\nAtualizando a conta: " + conta);

        sc.close();
    }
}
