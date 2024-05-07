package assignmentOopsPart1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Person person = new Person("123456789", "Jis George", 10000, 2255, "Mypass");
		// Create instances of ATM and OnlineBanking
		ATM atm = new ATM(person.getTotalFundsAvailable(), person.getPin());
		OnlineBanking onlineBanking = new OnlineBanking(person.getTotalFundsAvailable(),
				person.getOnlineBankingPassword());
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome, " + person.getName() + "!");

		System.out.println("Choose banking service:");
		System.out.println("1. ATM");
		System.out.println("2. Online Banking");
		int serviceChoice = scanner.nextInt();

		switch (serviceChoice) {
		case 1:
			atm.performTransaction();
			break;
		case 2:
			onlineBanking.performTransaction();
			break;
		default:
			System.out.println("Invalid choice.");
		}
	}
}