package fa.training.DAO;

import java.util.List;

import fa.training.entities.Customer;

public interface CustomerDAO {
	public List<Customer> getAllCustomer();
	
	
	public void addCustomer(Customer customer);
	
	
	public void updateCustomer(Customer customer);
	
	
	public boolean deletaCustomer(int customerId);
	
}
