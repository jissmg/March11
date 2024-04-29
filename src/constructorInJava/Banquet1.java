package constructorInJava;

import java.util.Scanner;

public class Banquet1 {
	double baseCostForBookingHall;
	double costOfFood;
	double costOfbeverages;
	double taxOnFood;
	double taxOnBeverage;
	double tip;
	public Banquet1(double baseCostForBookingHall, double costOfFood, double costOfbeverages, double taxOnFood,
			double taxOnBeverage, double tip) {
		super();
		this.baseCostForBookingHall = baseCostForBookingHall;
		this.costOfFood = costOfFood;
		this.costOfbeverages = costOfbeverages;
		this.taxOnFood = taxOnFood;
		this.taxOnBeverage = taxOnBeverage;
		this.tip = tip;
	}
	public double calculateBaseCost() {
		double baseCost=baseCostForBookingHall+costOfFood+tip+costOfbeverages;
		return baseCost;
	}
	public double calculateTax(double baseCost) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the specific tax rate: ");
		double taxRate=sc.nextDouble();
		taxRate=taxRate/100;
		double tax= baseCost*taxRate;
		return tax;
	}
	public double calculateCess(int noOfGuest,double baseCost) {
		double cessRate;
		if(noOfGuest<=40) {
			cessRate=0.04;
		}
		if((noOfGuest>40)&&(noOfGuest<=80)) {
			cessRate=0.08;
		}
		if((noOfGuest>80)&&(noOfGuest<150)) {
			cessRate=0.1;
		}else {
			cessRate=0.125;
		}
		return baseCost*cessRate;
	}
	public double calcultateTheTotalCost(double baseCost, double tax,double cess) {
		double total= baseCost+tax+cess;
		return total;
		
	}
	

}
