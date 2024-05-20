package assignmentOopsPart1;

import java.util.Scanner;

public class OnlineBanking extends BankOperations {
	private String onlineBankingPassword;

	public OnlineBanking(double initialDeposit, String onlineBankingPassword) {
		super(initialDeposit);
		this.onlineBankingPassword = onlineBankingPassword;
	}

	public void performTransaction() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter online banking password: ");
		String enteredPassword = scanner.nextLine();

		if (validatePassword(enteredPassword)) {
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
			System.out.println("Invalid password. Transaction aborted.");
		}
	}

	private boolean validatePassword(String enteredPassword) {
		return enteredPassword.equals(onlineBankingPassword);
	}
}