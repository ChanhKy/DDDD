package fa.training.DAO;

import java.util.List;

import fa.training.entities.Product;

public interface  ProductDAO {
	
	public List<Product> getALLProduct();
	
	public void addProduct(Product product);
	
	
	public void updateProduct(Product product);
	
	
	public void deleteProduct(int producId);
}
