package schoolManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person {
	private String employeeID;
	private double salary;
	private List<String> coursesTaught;
	private List<Integer> ratings;

	public Teacher(String name, int age, String gender, String employeeID, double salary, List<String> coursesTaught) {
		super(name, age, gender);
		this.setEmployeeID(employeeID);
		this.setSalary(salary);
		this.coursesTaught= new ArrayList<>(coursesTaught);
		this.ratings = new ArrayList<>();
	}
	public void addRating(int rating) {
		ratings.add(rating);
	}

	public double calculateAverageRating() {
		if (ratings.isEmpty()) {
			return 0;
		}
		int total = 0;
		for (int rating : ratings) {
			total += rating;
		}
		double rating = (double) total / ratings.size();
		return rating;
	}

	@Override
	public void describeRole() {
		System.out.println(name + " is a teacher.");
	}

	@Override
	public String toString() {
		return "Name: " + name + ", Age: " + age + ", Gender: " + gender + ", Courses Taught: " + coursesTaught;
	}

	public String getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
}
