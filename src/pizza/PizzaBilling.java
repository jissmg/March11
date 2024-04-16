package pizza;

import java.util.Scanner;

public class PizzaBilling {
	/*Write a program to prepare the bill for a pizza shop.
Assume an order and work out the final bill.
Take the Cheese Pizza prices as: Small Pizza: $15, Medium Pizza: $20, Large Pizza: $25
For additional pepperoni topping: Pepperoni for Small Pizza: +$2, Pepperoni for Medium or Large Pizza: +$3
Extra cheese for any size pizza: + $1
For eg: If the Pizza is medium, pepperoni with extra cheese the program should calculate the final bill as 20+3+1 = $24 and print as
“Your final bill is $24”*/
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
		String pepperoniChoice = scanner.next();
		double pepperoniPrice = 0;
		switch (pepperoniChoice) {
		case "Y":
		case "y":
			if (sizeChoice == "Small") {
				pepperoniPrice = 2;
			} else {
				pepperoniPrice = 3;
			}
			break;
		case "N":
		case "n":
			break;
		default:
			System.out.println("Invalid choice. Please choose Y or N.");
			return;
		}

		System.out.println("Do you want extra cheese? (Y/N)");
		String cheeseChoice = scanner.next();
		double cheesePrice = 0;
		switch (cheeseChoice) {
		case "Y":
		case "y":
			cheesePrice = 1;
			break;
		case "N":
		case "n":
			break;
		default:
			System.out.println("Invalid choice. Please choose Y or N.");
			return;
		}

		double finalBill = basePrice + pepperoniPrice + cheesePrice;
		System.out.println("Your final bill is $" + finalBill);
	}
}
