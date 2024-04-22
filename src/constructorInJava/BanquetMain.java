package constructorInJava;

import java.util.Scanner;

public class BanquetMain {
	/*
	 * Write a program to get complete bill at a Banquet hall by creating a class
	 * named Banquet. The class Banquet takes base cost for booking banquet hall,
	 * cost of food, beverages, taxes on food, taxes on beverage and tip as an
	 * attribute. es. Take all inputs through scanner Only.
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter base booking cost:");
		double baseBookingCost = scanner.nextDouble();
		System.out.println("Enter cost of food:");
		double foodCost = scanner.nextDouble();
		System.out.println("Enter cost of beverages:");
		double beverageCost = scanner.nextDouble();
		System.out.println("Enter tax on food:");
		double taxOnFood = scanner.nextDouble();
		System.out.println("Enter tax on beverages:");
		double taxOnBeverage = scanner.nextDouble();
		System.out.println("Enter tip amount:");
		double tip = scanner.nextDouble();
		System.out.println("Enter number of guests:");
		int numberOfGuests = scanner.nextInt();

		Banquet banquet = new Banquet(baseBookingCost, foodCost, beverageCost, taxOnFood, taxOnBeverage, tip);

		double baseCost = banquet.calculateBaseCost(baseBookingCost, foodCost, beverageCost, tip);
		double tax = banquet.calculateTax(baseCost);
		double cess = banquet.calculateCess(numberOfGuests, baseCost);
		double totalCost = banquet.calculateTheTotalCost(baseCost, tax, cess);

		System.out.println("Total cost of booking banquet hall: $" + totalCost);

	}

}
