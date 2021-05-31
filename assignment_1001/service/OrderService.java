package fa.training.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import fa.training.DAO.OrderDAO;
import fa.training.DAO.ipml.OrderDAOImpl;
import fa.training.entities.Order;

public class OrderService {

	OrderDAOImpl orderDao = new OrderDAOImpl();

	/*
	 * Phuong thuc nhap vao tu ban phim ma orderID Hien thi danh sách chi tiết đơn
	 * hàng
	 */
	public void getAllorderByCustomerId() {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("Nhap vao ma khach hang: ");
			int id = Integer.parseInt(scanner.nextLine());
			List<Order> orders = orderDao.getAllOrdersByCustomerId(id);
			System.out.println("-----Danh sach mat hang theo ma khac hang -----");
			for (Order order : orders) {
				System.out.println(order);
			}
			System.out.println("Danh sach mat hang trong!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void addOrder() {
		Order order = new Order();
		order.input();
		if (orderDao.addOrder(order)) {
			System.out.println("Add order successfully: ");

		} else {
			System.out.println("Add order failed");
		}

	}
	
	public void updateOrderTotal() {
		Scanner scanner = new Scanner(System.in);
		try {
			Order order = new Order();
			System.out.print("Enter order id: ");
			order.setOrderId(Integer.parseInt(scanner.nextLine()));
			System.out.println("Enter total: ");
			order.setTotal(Double.parseDouble(scanner.nextLine()));
			
			if (orderDao.updateOrderTotal(order)) {
				System.out.println("Update order successfully!");
			} else {
				System.out.println("Update order failed");
			}
		}catch (Exception e) {
			System.out.println("update order failed");
		}
	}
}
