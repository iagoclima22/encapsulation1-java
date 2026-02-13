package entities;

public class Account {
	
	private int number;
	private String holder;
	private double balance;
	
	public Account(int number, String holder, double initialBalance) {
		this.number = number;
		this.holder = holder;
		this.balance = initialBalance;
	}
	
	public Account(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}
	
	public void setHolder(String holder) {
		this.holder = holder;
	}
	
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= amount + 5.0;
	}
	
	public String toString() {
		return "Account "
			+ number
			+ ", Holder: "
			+ holder
			+ ", Balance: $"
			+ String.format("%.2f", balance);
	}

}
