package ontarioLicence;

import java.util.Scanner;

public class OntarioLicence {
	Scanner read = new Scanner(System.in);
	int age;
	String name, test, G1, G2, G;

	void checkAgeIsOk() {
		System.out.println("Enter Your Name:  ");
		name = read.next();
		System.out.println("Enter Your Age:  ");
		age = read.nextInt();
		if (age >= 18) {
			System.out.println("Hi " + name + " Select your Test: ");
		} else {
			System.out.println("Hi " + name + " Please Try After " + (18 - age) + " Years");
		}
	}

	void checkTheLevelOfLicence() {
		if ((test == G1) || (test == G2) || (test == G)) {
			test = read.next();
			System.out.println(" You are taken  " + test + " Licence Test");

			System.out.println(" Congrats you can use your " + test + " License !!!!!  ");
		} else {
			System.out.println("Sorry you are not approved, Better Luck Next Time!  ");
		}

	}
}
