package assignmentOopsPart1;

 public class BankOperations {
	private double balance;

	public BankOperations(double initialDeposit) {
		this.balance = initialDeposit;
	}

	public void withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println("Withdrawal of $" + amount + " successful.");
			displayBalance();
		} else {
			System.out.println("Insufficient funds or invalid withdrawal amount.");
		}
	}

	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("Deposit of $" + amount + " successful.");
			displayBalance();
		} else {
			System.out.println("Invalid deposit amount.");
		}
	}

	final public void viewBalance() {
		System.out.println("Current Balance: $" + balance);
	}

	private void displayBalance() {
		viewBalance();
	}
}