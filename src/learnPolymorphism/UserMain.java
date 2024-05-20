package learnPolymorphism;

import java.util.Scanner;

public class UserMain {

	public static void main(String[] args) {
		UserAccount user = new UserAccount("987654321", 6541);

		user.setUserName("user123");
		user.setPassword("123xyz");

		Scanner sc = new Scanner(System.in);

		System.out.println("Which operation you want to perform: ATM or Online");
		String operationEntered = sc.next();
		boolean isUserValidated = false;
		switch (operationEntered) {
		case "ATM":
			isUserValidated = user.validateUser("987654321", 6541);
			break;
		case "Online":
			isUserValidated = user.validateUser("user123", "123xyz");
			break;
		default:
			System.out.println("Invalid Operation");
			break;
		}
		if (isUserValidated) {
			System.out.println("Balance:" + user.getBalance());
		} else {
			System.out.println("Invalid Credentials");
		}
		sc.close();
	}

}