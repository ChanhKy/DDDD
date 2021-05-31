package fa.training.entities;

import java.util.Scanner;

public class LineItem {
	private int order;
	private int producId;
	private int quantity;
	private double price;
	
	public LineItem() {
	
	}
	public LineItem(int order, int producId, int quantity, double price) {
		super();
		this.order = order;
		this.producId = producId;
		this.quantity = quantity;
		this.price = price;
		
	}
	
	public void input() {
		Scanner scanner = new Scanner(System.in);
		do {
			try {
				if (order == 0) {
					System.out.print("Enter orderID: ");
					this.order = Integer.parseInt(scanner.nextLine());
				}
				if (producId == 0) {
					System.out.print("Enter product ID : ");
					this.producId = Integer.parseInt(scanner.nextLine());
				}
				if (quantity == 0) {
					System.out.print("Enter quantity: ");
					this.quantity = Integer.parseInt(scanner.nextLine());
					
				}
				if (price == 0) {
					System.out.print("Enter price: ");
					this.price = Double.parseDouble(scanner.nextLine());
				}
				break;
			} catch (Exception e) {
				e.printStackTrace();
			}
		} while (true);
	}
	
	public int getOrder() {
		return order;
	}
	public void setOrder(int order) {
		this.order = order;
	}
	public int getProducId() {
		return producId;
	}
	public void setProducId(int producId) {
		this.producId = producId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "LineItem [order=" + order + ", producId=" + producId + ", quantity=" + quantity + ", price=" + price
				+ "]";
	}
	
}
