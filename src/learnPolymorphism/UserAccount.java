package learnPolymorphism;

public class UserAccount {
	private String accountNumber;
	private int pin;
	private String userName;
	private String password;
	private double balance = 500;

	public UserAccount(String accountNumber, int pin) {
		super();
		this.accountNumber = accountNumber;
		this.pin = pin;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean validateUser(String acctNumber, int pinEntered) {
		if (acctNumber.equals(accountNumber) && pin == pinEntered) {
			return true;
		}
		return false;
	}
	
	public boolean validateUser(String userName, String password) {
		if (this.userName.equals(userName) && this.password.equals(password)) {
			return true;
		}
		return false;
	}

	public double getBalance() {
		return balance;
	}
}
