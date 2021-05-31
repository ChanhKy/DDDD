package fa.training.service;

import java.util.List;

import fa.training.DAO.ipml.CustomerDAOImpl;
import fa.training.entities.Customer;

public class CustomerService {
	CustomerDAOImpl customerDao = new CustomerDAOImpl();
	
	
	/*
	 *phương thức hiển thị danh sách khách hàng
	 */
	public  void showStudentsInfo() {
		System.out.printf("%-20s%-15s\n", "Mã Khách Hàng", "Họ tên");
		List<Customer> customers = customerDao.getAllCustomer();
		
		for (Customer listCus : customers) {
			System.out.println(listCus);

		}
	}
}


