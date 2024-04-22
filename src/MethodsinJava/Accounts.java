package MethodsinJava;

public class Accounts {
String nameofAccountHolder;
String accountType;
String accountNumber;
double balance;
int pin;
//private int length;
//retrun name of account holder
public String getNameOfTheAccountHolder() {
	return nameofAccountHolder;
}
public double getBalance() {
	return balance;
}
public String getAccountNumber() {
	return accountNumber;
}
public String getAccountType() {
	return accountType;
}
//method with argument or parameter
public boolean validatePin(int pinEntered) {
	if(pin==pinEntered) {
		return true;
	}  
	return false;
}

public Accounts getAccountsIfValidCredentials(String accountNumberEntered, int pinEntered, Accounts[] accounts) {
	Accounts ac=new Accounts();
	for(int i=0;i<accounts.length;i++) {
	if((accounts[i].getAccountNumber().equals(accountNumberEntered))) {
		if(accounts[i].pin==pinEntered) {
			return accounts[i];
			}
		}
	}
	return null;
}
public void displayAccountDetails() {
	System.out.println("Account Holder Name: " +getNameOfTheAccountHolder());
	System.out.println("Type of Account: " +getAccountType());
	System.out.println("Account balance: "+getBalance());

}
}
