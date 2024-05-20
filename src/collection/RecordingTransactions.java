package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RecordingTransactions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		PersonAccount jerin = new PersonAccount(10000);
		
		int transactionLimit =5;

		//Create a list to store transactions performed by user
		List<Transaction> transactionsList = new ArrayList<Transaction>();
		
		System.out.println("Enter transaction type");

		String transactionType = sc.next();

		System.out.println("Enter amount : ");

		double amount = sc.nextDouble();
		
		//Code to withdraw amount and deduct balance

		Transaction transaction1 = new Transaction(transactionType, amount, jerin.getBalance());

		transactionsList.add(transaction1);
		


		System.out.println("Enter transaction type");

		transactionType = sc.next();

		System.out.println("Enter amount : ");
		
		amount = sc.nextDouble();

		Transaction transaction2 = new Transaction(transactionType, amount, jerin.getBalance());

		transactionsList.add(transaction2);
		
		//Check if transactions limit is hit or not
		
		if(transactionsList.size()<transactionLimit) {
			System.out.println("You can do more transactions");
		}else {
			System.out.println("try again tomorrow");
		}

	}

}