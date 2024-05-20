package assignmentOopsPart1;

final public class Person {
	private String accountNumber;
	private String name;
	private double totalFundsAvailable;
	private int pin;
	private String onlineBankingPassword;

	public Person(String accountNumber, String name, double totalFundsAvailable, int pin,
			String onlineBankingPassword) {
		this.accountNumber = accountNumber;
		this.name = name;
		this.totalFundsAvailable = totalFundsAvailable;
		this.pin = pin;
		this.onlineBankingPassword = onlineBankingPassword;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public String getName() {
		return name;
	}

	public double getTotalFundsAvailable() {
		return totalFundsAvailable;
	}

	public int getPin() {
		return pin;
	}

	public String getOnlineBankingPassword() {
		return onlineBankingPassword;
	}
}