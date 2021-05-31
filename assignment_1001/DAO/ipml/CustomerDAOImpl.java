package fa.training.DAO.ipml;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import fa.training.DAO.CustomerDAO;
import fa.training.common.DatabaseConnection;
import fa.training.entities.Customer;

public class CustomerDAOImpl implements CustomerDAO {

	/*Phương thức đọc dữ liệu tất cả khách hàng từ DB
	 * 
	 * @return customers
	 */
	@Override
	public List<Customer> getAllCustomer() {
		List<Customer> customers = new ArrayList<Customer>();
		var sql = "SELECT * FROM Customer";
		Connection connection = null;
		PreparedStatement statement =null;
		ResultSet result = null; 
		try {
			connection = DatabaseConnection.getConnection();
			statement = connection.prepareStatement(sql);
			result = statement.executeQuery();
//			var  customerId = result.getInt(1);
//			var  customerName = result.getString(2);
//			Customer customer = new Customer(customerId, customerName);.
			while (result.next()) {
			
			Customer customer = new Customer(result.getInt("customer_id"), result.getString("customer_name"));
			customers.add(customer);
				
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return customers;
	}

	@Override
	public void addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean deletaCustomer(int customerId) {
		// TODO Auto-generated method stub
		return false;
	}

}
