package services;

public interface OnlinePaymentService {
    // Interface é um tipo que define um conjunto de operações que uma classe deve implementar.
    //Estabelece um contrato que a classe deve cumprir.

    double paymentFee(double amount);
    double interest(double amount, int months);
}