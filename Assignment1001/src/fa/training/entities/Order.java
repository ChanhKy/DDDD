package fa.training.entities;

import java.util.Date;
import java.util.Scanner;

public class Order {
	private int orderId;
	private Date orderDate;
	private int customerId;
	private int employee;
	private double total;

	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Order(int orderId, Date orderDate, int customerId, int employee, double total) {
		super();
		this.orderId = orderId;
		this.orderDate = orderDate;
		this.customerId = customerId;
		this.employee = employee;
		this.total = total;
	}

	public void input() {
		Scanner scanner = new Scanner(System.in);
		do {
			try {
				if (orderId == 0) {
				System.out.print("Enter orderID: ");
				this.orderId = Integer.parseInt(scanner.nextLine());
				}
				if (orderDate == null) {
					orderDate = new Date();
				}
				
				if (customerId == 0 ) {
					System.out.print("Enter customerID: ");
					this.customerId = Integer.parseInt(scanner.nextLine());
				}
				if (employee == 0 ) { 
					System.out.print("Enter employeeID: ");
					this.employee = Integer.parseInt(scanner.nextLine());
				}
				if (total == 0) {
					System.out.print("Enter order total: ");
					this.total = Double.parseDouble(scanner.nextLine());
				
				}
				break;
				
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} while(true) ;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getEmployee() {
		return employee;
	}

	public void setEmployee(int employee) {
		this.employee = employee;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderDate=" + orderDate + ", customerId=" + customerId + ", employee="
				+ employee + ", total=" + total + "]";
	}

}
