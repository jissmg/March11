package learnPolymorphism;

public class PolyMorphExample {

	//Compile Time Polymorphism
	//Method OverLoading
	
	public void addNumbers(int num1, int num2) {
		int sum = num1 + num2;
		System.out.println("SUm of the numbers is: " + sum);
	}

	/**
	 *Polymorphism by changing number of arguments
	 */
	public void addNumbers(int num1, int num2, int num3) {
		int sum = num1 + num2 + num3;
		System.out.println("SUm of the numbers is: " + sum);
	}

	/**
	 *Polymorphism by changing type of arguments
	 */
	public void addNumbers(double num1, double num2) {
		double sum = num1 + num2;
		System.out.println("SUm of the numbers is: " + sum);
	}
	
	/**
	 *Polymorphism by changing type of arguments
	 */
	public void addNumbers(int num1, double num2) {
		double sum = num1 + num2;
		System.out.println("SUm of the numbers is: " + sum);
	}
	
	/**
	 *Polymorphism by changing order of arguments
	 */
	public void addNumbers(double num2, int num1) {
		double sum = num1 + num2;
		System.out.println("SUm of the numbers is: " + sum);
	}
	
}