package entities;

public class Account {

    // ATRIBUTOS
    private int number;
    private String holder;
    private double balance;

    // CONSTRUTOR
    public Account(int number, String holder) {
        this.number = number;
        this.holder = holder;
    }

    public Account(int number, String holder, double initialDeposit) {
        this.number = number;
        this.holder = holder;
        deposit(initialDeposit); //Encapsulamento - usa um depósito inicial para nova conta,
                                 // pois o saldo não se altera sem os métodos de deposito e saque
    }

    // GETTER & SETTER - MÉTODOS DE ACESSO
    // NÚMERO DA CONTA NÃO PODE SER ALTERADO, ENTÃO SEM O SET
    // O SALDO SÓ PODE SER ALTERADO POR SAQUE OU DEPÓSITO, ENTÃO TAMBÉM SEM O SET
    public int getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    // MÉTODO DE DEPOSITO
    public void deposit(double amount){
        balance += amount;
    }

    // MÉTODO PARA SAQUE
    public void withdraw(double amount){
        balance -= amount + 5;
    }

    // toString

    @Override
    public String toString() {
        return "\nAccount{" +
               "\nnumber= " + number +
               ", holder= " + holder +
               ", balance= $ " + String.format("%.2f", balance) +
               "\n}";
    }
}
