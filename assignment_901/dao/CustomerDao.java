package dao;

import java.util.List;

public interface CustomerDao {
	List<String> createCustomer();
	List<String> findAll();
	void showAll();
	boolean remove (String phone);
	public List<String> search(String phone);
}
