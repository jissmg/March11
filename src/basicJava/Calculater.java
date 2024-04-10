package basicJava;

public class Calculater {
	int num1 = 5;
	int num2 = 10;
	int result = 0;

	void SubtractionofTwoNumbers() {
		System.out.println("Subtraction of two numbers");
		result = num1 - num2;
		System.out.println("Subtraction :" + result);

	}

	void multiplicationOfTwoNumbers() {
		System.out.println("Multiplication of two numbers");
		result = num1 * num2;
		System.out.println("Multiplication :" + result);
	}

	void getQueOfTwoNumbers() {
		System.out.println(" Que of two numbers");
		result = num1 / num2;
		System.out.println("Que of two numbers :" + result);
	}

	void getreminderOfTwoNumbers() {
		System.out.println("Reminder of two numbers");
		result = num1 % num2;
		System.out.println("Reminder of two numbers :" + result);
	}

}
