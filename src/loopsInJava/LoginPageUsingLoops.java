package loopsInJava;

import java.util.Scanner;

public class LoginPageUsingLoops {
	/*
	 * Write a program which takes username and password from user via console and
	 * compares it with a user name and password saved in your class. Saved user id
	 * and password are as below UserId pivotAdmin password Admin123
	 * 
	 * If the username and password entered by user matches with the one saved in
	 * your class, then print “You are logged in to the application“ other wise
	 * print “Incorrect User id or password.Try again”. Also a user gets 3 chances
	 * enter the correct user name and password. If the user enters incorrect user
	 * name or password more than 3 times then print “ Account locked”
	 * 
	 */
	String CORRECT_USERNAME = "pivotAdmin";
	String CORRECT_PASSWORD = "Admin123";
	int MAX_ATTEMPTS = 3;
	Scanner scanner = new Scanner(System.in);

	void checkLogin() {
		for (int attempts = 0; attempts < MAX_ATTEMPTS; attempts++) {
			System.out.print("Enter username: ");
			String username = scanner.nextLine();
			System.out.print("Enter password: ");
			String password = scanner.nextLine();
			if (username.equals(CORRECT_USERNAME) && password.equals(CORRECT_PASSWORD)) {
				//to compare the string add .equals()method
				System.out.println("You are logged in to the application.");
				break;
			} else {
				if (attempts == MAX_ATTEMPTS - 1) {
					System.out.println("Account locked.");
				} else {
					System.out.println("Incorrect User id or password. Try again.");
				}
			}

		}
	}
}
