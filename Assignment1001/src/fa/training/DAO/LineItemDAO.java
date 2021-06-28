package fa.training.DAO;

import java.util.List;

import fa.training.entities.LineItem;

public interface LineItemDAO {
	public List<LineItemDAO> getAllLine();
	
	
	
	public boolean addLineItem(LineItem lineItem) ;
	
	
	public void updateLineItem(LineItem lineItem);
	
	
	public void deleteLineItem(int lineItemId);
	
	public List<LineItem> getAllItemsByOrderId(int Id);
}
