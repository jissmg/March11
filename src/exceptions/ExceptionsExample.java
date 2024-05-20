package exceptions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import collection.Transaction;

public class ExceptionsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = null;

		//System.out.println(" First char of string :" + s.charAt(0));

		List<Transaction> finTransactions = new ArrayList<Transaction>();

		

		Scanner sc = new Scanner(System.in);
		int i = 0;
		
		while (i < 3) {
			
			Transaction transaction = null;
			
			System.out.println("Enter type of transaction");
			String trans_Action = sc.next();

			System.out.println("Enter amount");
			double amount = sc.nextDouble();

			if (!trans_Action.equalsIgnoreCase("Viewbalance")) {
				transaction = new Transaction(trans_Action, amount, 1000);
			}

			finTransactions.add(transaction);
			
			i++;

		}
		
		for(Transaction transaction:finTransactions) {
			System.out.println(transaction.getAmount());
		}

	}

}