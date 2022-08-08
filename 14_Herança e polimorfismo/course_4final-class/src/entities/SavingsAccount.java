package entities;

public final class SavingsAccount extends Account {
	// O FINAL CLASS EVITA QUE SEJAM CRIADAS SUBCLASSES DE SavingsAccount
	// NÃO SERÁ HERDADA POR OUTRA CLASSE
	private Double interestRate;
	
	public SavingsAccount() {
		super();
	}

	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void updateBalance() {
		balance += balance * interestRate;
	}
	
	@Override //IMPLEMENTAÇÃO DE UM MÉTODO DE SUPERCLASSE DENTRO DA SUBCLASSE
	public final void withdraw(double amount) {
		balance -= amount;
	}
}
