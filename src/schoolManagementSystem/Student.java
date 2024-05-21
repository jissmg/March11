package schoolManagementSystem;

public class Student extends Person {

	private String studentID;
	private double percentage;

	public Student(String name, int age, String gender, double percentage, String studentID) {
		super(name, age, gender);
		this.setStudentID(studentID);
		this.percentage = percentage;
	}

	public String determineStream() {
		if (percentage >= 85) {
			return "Non-Medical " + name + " can enroll in courses like Physics and Mathematics ";
		} else if (percentage >= 75) {
			return "Medical " + name + " can enroll in courses like Bilogy and chemistry";
		} else if (percentage >= 65) {
			return "Commerce " + name + " can enroll in courses like Economics and Business ";
		} else {
			return "Arts " + name + " can enroll in courses like History and Literature";
		}

	}

	public void rateTeacher(Teacher teacher, int rating) {
		teacher.addRating(rating);
	}

	@Override
	public void describeRole() {
		System.out.println(name + " is a student.");
	}

	@Override
	public String toString() {
		return super.toString() + ", Academic Percentage: " + percentage;
	}

	public String getStudentID() {
		return studentID;
	}

	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

}
