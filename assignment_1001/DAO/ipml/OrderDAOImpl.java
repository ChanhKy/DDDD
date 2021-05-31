package fa.training.DAO.ipml;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.crypto.Data;

import fa.training.DAO.OrderDAO;
import fa.training.common.DatabaseConnection;
import fa.training.entities.Order;
import jdk.jfr.DataAmount;

public class OrderDAOImpl implements OrderDAO {

	@Override
	public List<Order> getALLOrder() {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * Phương thức đọc tất cả các đơn hàng thông qua mã khách hàng từ DB
	 * 
	 * @param customerId
	 * 
	 * @return Orders
	 */
	@Override
	public List<Order> getAllOrdersByCustomerId(int customerId) {
		List<Order> orders = new ArrayList<Order>();
		String sql = "SELECT * FROM Orders WHERE customer_id = ?";
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet result = null;
		try {
			connection = DatabaseConnection.getConnection();
			statement = connection.prepareStatement(sql);
			statement.setInt(1, customerId);
			result = statement.executeQuery();
			if (result.next()) {
				int order_id = result.getInt("order_id");
				Date order_date = result.getDate("order_date");
				int customer_id = result.getInt("customer_id");
				int employee_id = result.getInt("employee_id");
				float total = result.getFloat("total");
				Order order = new Order(order_id, order_date, customer_id, employee_id, total);
				orders.add(order);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return orders;
	}
	/*
	 * Phương thức thêm mới 1 row vào cơ sở dữ liệu
	 * @param order
	 * @return true if add success else fasle
	 */
	@Override
	public boolean addOrder(Order order) {
		String  sql = "INSERT INTO Orders VALUES (?,?,?,?,?) ";
		Connection connection = null;
		PreparedStatement statement = null;
		int result;
		try {
			connection = DatabaseConnection.getConnection();
			statement = connection.prepareStatement(sql);
			
			statement.setInt(1, order.getOrderId());
			statement.setDate(2, new java.sql.Date(order.getOrderDate().getTime()));
			statement.setInt(3, order.getCustomerId());
			statement.setInt(4, order.getEmployee());
			statement.setDouble(5,  order.getTotal());
			
			result = statement.executeUpdate();
			if (result > 0) return true;
			}catch (Exception e) {
				e.printStackTrace();
				return false;
		} 
		return false;
	}
	/*
	 * Phuong thuc cap nhat du lieu tren QB
	 * @param order
	 * return true if total update, else false 
	 */
	@Override
	public boolean updateOrderTotal(Order order) {
		String sql = "UPDATE Orders SET total = ? WHERE order_id = ?";
		Connection connection = null;
		PreparedStatement statement = null;
		try {
			connection = DatabaseConnection.getConnection();
			statement = connection.prepareStatement(sql);
			statement.setDouble(1, order.getTotal());
			statement.setInt(2, order.getOrderId());
			if(statement.executeUpdate() > 0) {
				return true;
			}
		}catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return false;
	}
	
	
	
	
	@Override
	public boolean updateOrder(Order order) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public void deleteOrder(int orderId) {
		// TODO Auto-generated method stub

	}

}
