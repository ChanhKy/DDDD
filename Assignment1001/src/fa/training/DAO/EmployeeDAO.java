package fa.training.DAO;

import java.util.List;

import fa.training.entities.Employee;

public interface EmployeeDAO {
	public List<Employee> getALLEmployee();
	
	
	public void addEmployee(Employee employee);
	
	
	public void updateEmployee(Employee employee);
	
	public void deleteEmployee(int employeeId);
}
