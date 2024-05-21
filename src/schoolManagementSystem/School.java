package schoolManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class School {
	private String name;
	 List<Teacher> teachers=new ArrayList<>();
	 List<Student> students=new ArrayList<>();

	public School(String name) {
		super();
		this.name = name;
	}

	public School() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public List<Teacher> getTeachers() {
		return teachers;
	}

	public void setTeachers(List<Teacher> teachers) {
		this.teachers = teachers;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void addTeacher(Teacher teacher) {
		teachers.add(teacher);
	}

	public void addStudent(Student student) {
		students.add(student);
	}

	public Teacher getTeacherByName(String name) {
		for (Teacher teacher : teachers) {
			if (teacher.name.equals(name)) {
				return teacher;
			}
		}
		return null;
	}

}
