package MethodsinJava;

import java.util.Scanner;

public class AccountMain {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Accounts jisAccount=new Accounts();
		jisAccount.accountNumber="123456789";
		jisAccount.nameofAccountHolder="Jis Georgr";
		jisAccount.accountType="Savings";
		jisAccount.balance=4300;
		jisAccount.pin=2568;
		//String accountNumber=jisAccount.getAccountNumber();
		System.out.println("Jis Account:"+jisAccount.getAccountNumber());
		
		Accounts mariaAccount=new Accounts();
		mariaAccount.accountNumber="876543219";
		mariaAccount.nameofAccountHolder="Maria Georgr";
		mariaAccount.accountType="Savings";
		mariaAccount.balance=43200;
		mariaAccount.pin=2255;
		
		Accounts jemAccount=new Accounts();
		jemAccount.accountNumber="187656789";
		jemAccount.nameofAccountHolder="Jem Georgr";
		jemAccount.accountType="chequing";
		jemAccount.balance=5600;
		jemAccount.pin=1238;
		
	//	String[] names= {"jis","gem","appu"};
		
		Accounts[] accounts= {jisAccount,mariaAccount,jemAccount};
		System.out.println(accounts[0].getBalance());
		System.out.println(accounts[2].getBalance());
		System.out.println("Enter your account number: ");
		String accountNumberEntered=sc.next();
		System.out.println("Enter Your Pin Number:");
		 int pinEntered=sc.nextInt();
		 boolean isAccountValidated=false;
		/*for(int i=0;i<accounts.length;i++) {
			if(accounts[i].getAccountNumber().equals(accountNumberEntered)){
				boolean isPinValid=accounts[i].validatePin(pinEntered);
				if(isPinValid) {
				System.out.println("Account Holder Name: "+accounts[i].getNameOfTheAccountHolder());
				System.out.println("Type of Account: "+accounts[i].getAccountType());
				System.out.println("Account balance: "+accounts[i].getBalance());
				isAccountValidated=true;
				break;
			}if(!isAccountValidated) {
				System.out.println("Pin Is Not Correct");
			}
				}
		}*/
		 
		 Accounts account =new Accounts();
		 account =account.getAccountsIfValidCredentials(accountNumberEntered, pinEntered, accounts );
		 account.displayAccountDetails();
	

}}
