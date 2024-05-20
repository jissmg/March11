package schoolManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class School {
	private String name;
	private List<Teacher> teachers;
	private List<Student> students;

	public School(String name) {
		super();
		this.setName(name);
		this.setTeachers(new ArrayList<>());
		this.setStudents(new ArrayList<>());
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

	@Override
	public String toString() {
		return "School: " + name + ", Teachers: " + teachers.size() + ", Students: " + students.size();
	}
}
