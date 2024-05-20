package schoolManagementSystem;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		School school = new School("Springfield High School");

		Teacher teacher1 = new Teacher("Alice Johnson", 30, "Female", "T001", 50000, Arrays.asList("Math", "Physics"));
		Teacher teacher2 = new Teacher("Manoj M", 40, "Male", "T100", 60000, Arrays.asList("Biology", "Chemistry"));
		Teacher teacher3 = new Teacher("Anu Jose", 27, "Female", "T003", 30000, Arrays.asList("Economics", "Business"));
		Teacher teacher4 = new Teacher("George Varghese", 37, "Male", "T006", 50000,Arrays.asList("History", "Literature"));
		school.addTeacher(teacher1);
		school.addTeacher(teacher2);
		school.addTeacher(teacher3);
		school.addTeacher(teacher4);

		System.out.println("Welcome to Springfield High School Stream Allocation and Teacher Rating System!");
		System.out.print("Please enter the student's name: ");
		String studentName = scanner.nextLine();
		System.out.print("Please enter the student's age: ");
		int studentAge = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Please enter the student's gender: ");
		String studentGender = scanner.nextLine();
		System.out.print("Please enter the student's academic percentage: ");
		double percentage = scanner.nextDouble();
		scanner.nextLine(); 

		// Create a new student and determine their stream
		Student student = new Student(studentName, studentAge, studentGender, percentage, "S001");
		school.addStudent(student);
		System.out.println("-- Stream Allocation Result --");
		System.out.println(student);
		System.out.println("Allocated Stream: " + student.determineStream());
		scanner.nextLine(); 
		
		// Rating a teacher
		System.out.print("Please enter the teacher's name you wish to rate: ");
		String teacherName = scanner.nextLine();
		Teacher teacherToRate = school.getTeacherByName(teacherName);
		if (teacherToRate != null) {
			System.out.print("Please enter your rating for " + teacherName + " (1-5): ");
			int rating = scanner.nextInt();
			student.rateTeacher(teacherToRate, rating);
			System.out.println("-- Updated Teacher Rating --");
			System.out.println("Teacher: " + teacherName);
			System.out.println("New Average Rating: " + teacherToRate.calculateAverageRating());
		} else {
			System.out.println("Teacher not found.");
		}

		scanner.close();
	}
}