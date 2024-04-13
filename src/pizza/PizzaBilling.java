package pizza;

import java.util.Scanner;

public class PizzaBilling {
	Scanner scanner = new Scanner(System.in);

	public void pizzaBillingSwitchCase() {
		System.out.println("Welcome to the Pizza Hut!");
		System.out.println("Choose your pizza size: Small,  Medium, Large");

		String sizeChoice = scanner.next();

		double basePrice = 0;
		switch (sizeChoice) {
		case "Small":
			basePrice = 15;
			break;
		case "Medium":
			basePrice = 20;
			break;
		case "Large":
			basePrice = 25;
			break;
		default:
			System.out.println("Invalid choice. Please choose a valid option.");
			return;
		}

		System.out.println("Do you want pepperoni topping? (Y/N)");
		char pepperoniChoice = scanner.next().charAt(0);
		double pepperoniPrice = 0;
		switch (pepperoniChoice) {
		case 'Y':
		case 'y':
			if (sizeChoice == "Small") {
				pepperoniPrice = 2;
			} else {
				pepperoniPrice = 3;
			}
			break;
		case 'N':
		case 'n':
			break;
		default:
			System.out.println("Invalid choice. Please choose Y or N.");
			return;
		}

		System.out.println("Do you want extra cheese? (Y/N)");
		char cheeseChoice = scanner.next().charAt(0);
		double cheesePrice = 0;
		switch (cheeseChoice) {
		case 'Y':
		case 'y':
			cheesePrice = 1;
			break;
		case 'N':
		case 'n':
			break;
		default:
			System.out.println("Invalid choice. Please choose Y or N.");
			return;
		}

		double finalBill = basePrice + pepperoniPrice + cheesePrice;
		System.out.println("Your final bill is $" + finalBill);

		scanner.close();
	}
}
