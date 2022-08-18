package services;

import java.security.InvalidParameterException;

public interface InterestService {
    // Interface é um tipo que define um conjunto de operações que uma classe deve implementar.
    //Estabelece um contrato que a classe deve cumprir.
    double getInterestRate();

    default double payment(double amount, int months) {
        if (months < 1) {
            throw new InvalidParameterException("Months must be greater than zero");
        }
        return amount * Math.pow(1.0 + getInterestRate() / 100.0, months);
    }
}