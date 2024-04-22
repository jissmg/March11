package MethodsinJava;

import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Employee emp1 = new Employee(1234, "JisMaria", "Testing", "jr.Tester", "jis123", "12345");
		Employee emp2 = new Employee(1274, "Maria", "Dev", "Team Lead", "maria123", "12366");
		Employee emp3 = new Employee(1122, "Anu Jose", "Management", "Project Manager", "anu123", "66666");
		Employee[] employee = { emp1, emp2, emp3 };
		System.out.println("Enter Username:");
		String usernameEntered = sc.next();
		System.out.println("Enter Password");
		String passwordEntered = sc.next();

		Employee loggedInEmployee = new Employee(0, usernameEntered, passwordEntered, usernameEntered, passwordEntered,passwordEntered);
		loggedInEmployee = loggedInEmployee.getEmployeeValidCredentials(usernameEntered, passwordEntered, employee);
		if (loggedInEmployee != null) {
			loggedInEmployee.displayEmployee();
		} else {
			System.out.println("Invalid credentials.");
		}

	}

}
