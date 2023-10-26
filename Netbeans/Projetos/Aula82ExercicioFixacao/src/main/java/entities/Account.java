package entities;

public class Account {

	private int number;
	private String holder;
	private double balance;

	public void deposit(double amount) {
		balance += amount;
	}

	public void withdraw(double amount) {
		balance -= amount + 5.00;
	}

	public Account(int number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit); /* Aqui eu estou alterando o atributo protegido 
		pelo método deposit passando como parâmentro initialDeposit*/
		
	}

	public Account(int number, String holder) {
		this.number = number;
		this.holder = holder;

		/*
		 * Nós criamos 2 construtores (sobrecarga) porque no enunciado informa que o
		 * cliente pode abrir conta informando os 3 parâmentos ou somente 2
		 */
	}

	public int getNumber() {
		return number;
		/*
		 * O número da conta não pode ser alterado por isso só criamos o get
		 */
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public String getHolder() {
		return holder;
	}

	public double getBalance() {
		return balance;
		/*
		 * O saudo da conta só pode ser alterado por saque e depósito ou seja, pelos
		 * métodos
		 */
	}

	public String toString() {
		return "Account "
				+ number
				+", Holder: "
				+holder
				+", Balance: $ "
				+ String.format("%.2f", balance);
	}
}
