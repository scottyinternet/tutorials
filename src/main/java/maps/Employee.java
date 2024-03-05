package maps;

public class Employee {
	private String employeeId;
	private String name;
	private String department;

	public Employee(String employeeId, String name, String department) {
		this.employeeId = employeeId;
		this.name = name;
		this.department = department;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public String getName() {
		return name;
	}

	public String getDepartment() {
		return department;
	}

	@Override
	public String toString() {
		return "Employee{" +
				"employeeId='" + employeeId + '\'' +
				", name='" + name + '\'' +
				", department='" + department + '\'' +
				'}';
	}
}
