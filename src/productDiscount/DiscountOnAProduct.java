package productDiscount;

import java.util.Scanner;

public class DiscountOnAProduct {
	String Promo5,Promo10,Promo20,promo;
	double actualValue,discount,value,discountedvalue;
	boolean isanypromocode;
	Scanner read=new Scanner(System.in);
	void productDiscount() {
		System.out.println("Actual Value of the Product: "+actualValue);
		System.out.println("Discount for every Product is 50%");
		discount=50;
		value=100-50;
		discountedvalue=(value*actualValue/100);
			
		System.out.println("After 50% discount applied :"+discountedvalue);
	
		actualValue=discountedvalue;
		//System.out.println("Enter Your Promo Code: ");
		//promo=read.next();
		
		if(promo==Promo5) {
			System.out.println("Enter Your Promo Code: ");
			promo=read.next();
			
			System.out.println("You have 5% Extra discount on your Promo Code ");
			discount=5;
			value=100-5;
			discountedvalue=(value*actualValue/100);
			System.out.println("Final Discounted value :"+discountedvalue);
		}else if(promo==Promo10){
			System.out.println("Enter Your Promo Code: ");
			promo=read.next();
				
				System.out.println("You have 10% Extra discount on your Promo Code ");
				discount=10;
				value=100-10;
				discountedvalue=(value*actualValue/100);
				System.out.println("Final Discounted value: "+discountedvalue);
			}else if(promo==Promo20) {
			System.out.println("Enter Your Promo Code: ");
				promo=read.next();
				
				
				System.out.println("You have 20% Extra discount on your Promo Code ");
				discount=20;
				value=100-20;
				discountedvalue=(value*actualValue/100);
				System.out.println("Final Discounted value :"+discountedvalue);
			}
		}
		
	}

	


