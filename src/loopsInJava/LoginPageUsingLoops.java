package loopsInJava;

import java.util.Scanner;

public class LoginPageUsingLoops {
	String userId, passWord;
	Scanner scanner = new Scanner(System.in);

	void checkLogin() {
		String actualUserId = "pivotAdmin";
		String actualPassword = "Admin123";

		for (int i = 0; i < 3; i++) {
			System.out.println("Enter User Id: ");
			userId = scanner.next();
			System.out.println("Enter User Password: ");
			passWord = scanner.next();
			if ((userId == actualUserId) && (passWord == actualPassword)) {
				System.out.println("You are logged in to the application");
			} else {
				System.out.println("Incorrect username or password. Please try again.");
			}
		}
		System.out.println("Account Locked!!!!");
	}
}