package schoolManagementSystem;

import java.util.ArrayList; 
import java.util.List;

public class Teacher extends Person {
    private String employeeID;
    private double salary;
    List<Integer> ratings=new ArrayList<>();
    List<String> coursesTaught=new ArrayList<String>();
    public Teacher(String name, int age, String gender, String employeeID, double salary,List<String> coursesTaught) {
        super(name, age, gender);
        this.setEmployeeID(employeeID);
        this.setSalary(salary);
    }

    @Override
    public void describeRole() {
		System.out.println(name + " is a Teacher.");
	}

    public void addRating(int rating) {
        if (rating >= 1 && rating <= 5) {
            ratings.add(rating);
           
        } else {
            System.out.println("Rating should be between 1 and 5.");
        }
    }

    public double calculateAverageRating() {
        if (ratings.isEmpty()) {
            return 0;
        }
        int total = 0;
        for (int rating : ratings) {
            total += rating;
        }
        double average = (double) total / ratings.size();
        return average;
    }

    @Override
    public String toString() {
        return super.toString() + ", Courses Taught: " + coursesTaught;
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