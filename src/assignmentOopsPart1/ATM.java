package assignmentOopsPart1;

import java.util.Scanner;

public class ATM extends BankOperations {
	private int pin;

	public ATM(double initialDeposit, int pin) {
		super(initialDeposit);
		this.pin = pin;
	}

	public void performTransaction() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Pin Number: ");
		int enteredPin = scanner.nextInt();

		if (validatePin(enteredPin)) {
			System.out.println("Choose operation:");
			System.out.println("1. Deposit");
			System.out.println("2. Withdraw");
			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				System.out.print("Enter deposit amount: $");
				double depositAmount = scanner.nextDouble();
				deposit(depositAmount);
				break;
			case 2:
				System.out.print("Enter withdrawal amount: $");
				double withdrawAmount = scanner.nextDouble();
				withdraw(withdrawAmount);
				break;
			default:
				System.out.println("Invalid choice.");
			}
		} else {
			System.out.println("Invalid PIN. Transaction aborted.");
		}
	}

	private boolean validatePin (int enteredPin) {
		return enteredPin == pin;
	} 
}