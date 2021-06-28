package fa.training.DAO;

import java.util.List;

import fa.training.entities.Order;

public interface OrderDAO {
	public List<Order> getALLOrder();
	
	
	public List<Order> getAllOrdersByCustomerId (int customerId);
	
	
	public boolean addOrder(Order order);
	
	public boolean updateOrder(Order order);
	
	
	public boolean updateOrderTotal(Order orderId) ;
	
	public void deleteOrder(int orderId);
}
