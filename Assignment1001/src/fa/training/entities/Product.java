package fa.training.entities;

import java.util.Date;

public class Product {
	private int orderIn;
	private Date orderDate;
	private int cuxtomerId;
	private int emplooyee;
	private double total;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int orderIn, Date orderDate, int cuxtomerId, int emplooyee, double total) {
		super();
		this.orderIn = orderIn;
		this.orderDate = orderDate;
		this.cuxtomerId = cuxtomerId;
		this.emplooyee = emplooyee;
		this.total = total;
	}
	public int getOrderIn() {
		return orderIn;
	}
	public void setOrderIn(int orderIn) {
		this.orderIn = orderIn;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public int getCuxtomerId() {
		return cuxtomerId;
	}
	public void setCuxtomerId(int cuxtomerId) {
		this.cuxtomerId = cuxtomerId;
	}
	public int getEmplooyee() {
		return emplooyee;
	}
	public void setEmplooyee(int emplooyee) {
		this.emplooyee = emplooyee;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	@Override
	public String toString() {
		return "Product [orderIn=" + orderIn + ", orderDate=" + orderDate + ", cuxtomerId=" + cuxtomerId
				+ ", emplooyee=" + emplooyee + ", total=" + total + "]";
	}
	
	
}
