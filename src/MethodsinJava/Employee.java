package MethodsinJava;

public class Employee {
	private int empId;
	String empName;
	public String empDepartment;
	public String empPosition;
	private String empUsername;
	private String empPassword;
	public Employee(int id, String name,String dep,String pos,String usern,String pass) {
		empId = id;
		empName = name;
		empDepartment = dep;
		empPosition = pos;
		empUsername = usern;
		empPassword = pass;
	}
	public int getEmployeeId() {
	
		return empId;
	}

	public String getEmployeeName() {
		return empName;
	}

	public String getDepartmentOfEmployee() {
		return empDepartment;
	}

	public String getPositionOfEmployee() {
		return empPosition;
	}

	public boolean validateEmployee(String usernameEntered, String passwordEntered) {
		if ((empUsername).equals(usernameEntered) && (empPassword).equals(passwordEntered)) {
			return true;

		}
		return false;
	}

	public Employee getEmployeeValidCredentials(String usernameEntered, String passwordEntered, Employee[] employee) {
		// Employee em = new Employee();
		boolean isValidateLogin = false;
		for (int i = 0; i < employee.length; i++) {
			isValidateLogin = employee[i].empUsername.equals(usernameEntered)&& (employee[i].empPassword.equals(passwordEntered));
			if (isValidateLogin) {
				return employee[i];
			}
		}

		return null;
	}

	public void displayEmployee() {
		System.out.println("Employee Name:" + empName);
		System.out.println("Employee Department:" + empDepartment);
		System.out.println("Employee Position:" + empPosition);

	}

}
