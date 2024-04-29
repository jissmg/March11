package constructorInJava;

import java.util.Scanner;

public class BanquetMain1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Base Cost for booking banquet hall: ");
		double baseCostForBookingHall=sc.nextDouble();
		System.out.println("Enter Cost of Food: ");
		double costOfFood=sc.nextDouble();
		System.out.println("Enter Cost of Beverages: ");
		double costOfBeverages=sc.nextDouble();
		System.out.println("Enter Tax on Food: ");
		double taxOnFood=sc.nextDouble();
		System.out.println("Enter Tax on Beverages: ");
		double taxOnBeverage=sc.nextDouble();
		System.out.println("Enter Tip amount: ");
		double tip=sc.nextDouble();
		System.out.println("Enter No. of Guest: ");
		int noOfGuest=sc.nextInt();
		Banquet1 banquet1= new Banquet1(baseCostForBookingHall,costOfFood,costOfBeverages,taxOnFood,taxOnBeverage,tip);
		double baseCost= banquet1.calculateBaseCost();
		double tax= banquet1.calculateTax(baseCost);
		double Cess=banquet1.calculateCess(noOfGuest, baseCost);
	//	double total=banquet1.calcultateTheTotalCost(baseCost, tax, Cess);
		System.out.println("Total Cost for booking Banquet =$"+banquet1.calcultateTheTotalCost(baseCost, tax, Cess));
	}

}
