package collection;

public class Transaction {

	private  String type;
	private  double amount;
	private double balance;
	
	
	public Transaction(String type, double amount, double balance) {
		super();
		this.type = type;
		this.amount = amount;
		this.balance = balance;
	}
	
	
	public String getType() {
		return type;
	}
	


	public void setType(String type) {
		this.type = type;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Transaction [type=" + type + ", amount=" + amount + "]";
	}
}