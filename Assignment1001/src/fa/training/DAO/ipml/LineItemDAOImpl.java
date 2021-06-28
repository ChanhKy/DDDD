package fa.training.DAO.ipml;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import fa.training.DAO.LineItemDAO;
import fa.training.common.DatabaseConnection;
import fa.training.entities.LineItem;

public class LineItemDAOImpl implements LineItemDAO {

	@Override
	public List<LineItemDAO> getAllLine() {
		// TODO Auto-generated method stub
		return null;
	}

	/*Phương thức đọc danh sách chi tiết đơn hàng từ DB
	 * param orderId
	 * return lineItems
	 * 
	 */
	@Override
	public List<LineItem> getAllItemsByOrderId(int orderId) {
	List<LineItem> lineItems = new ArrayList<LineItem>();
	String sql ="SELECT * FROM LineItem WHERE order_id = ?";
	Connection connection = null;
	PreparedStatement statement = null;
	ResultSet result = null;
	try {
		connection = DatabaseConnection.getConnection();
		statement =connection.prepareStatement(sql);
		statement.setInt(1, orderId);
		result = statement.executeQuery();
		if (result.next()) {
			int order_id = result.getInt("order_id");
			int product_id = result.getInt("product_id");
			int quantity = result.getInt("quantity");
			float prices = result.getFloat("price");
			LineItem lineItem = new LineItem(order_id, product_id, quantity, prices);
			lineItems.add(lineItem);
			
		}
	} catch (Exception e ) {
		e.printStackTrace();
	}
		return lineItems;
	}
	
	
	
	@Override
	public boolean addLineItem(LineItem lineItem) {
		String sql = "INSERT INTO LineItem VALUES (?,?,?,?)";
		Connection connection = null;
		PreparedStatement statement = null;
		int result;
		
		try {
			connection = DatabaseConnection.getConnection();
			statement = connection.prepareStatement(sql);
			
			statement.setInt(1, lineItem.getOrder());
			statement.setInt(2, lineItem.getProducId());
			statement.setInt(3, lineItem.getQuantity());
			statement.setDouble(4, lineItem.getPrice());
			result = statement.executeUpdate();
			if (result > 0) {
				return true;
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public void updateLineItem(LineItem lineItem) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteLineItem(int lineItemId) {
		// TODO Auto-generated method stub
		
	}


}
