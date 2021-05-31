package fa.training.entities;

public class Employee {
	private int employeeId;
	private String name;
	private double salary;
	private int spvrld;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int employeeId, String name, double salary, int spvrld) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.salary = salary;
		this.spvrld = spvrld;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getSpvrld() {
		return spvrld;
	}
	public void setSpvrld(int spvrld) {
		this.spvrld = spvrld;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + ", salary=" + salary + ", spvrld=" + spvrld
				+ "]";
	}
	
}
