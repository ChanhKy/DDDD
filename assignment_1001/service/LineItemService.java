package fa.training.service;

import java.util.List;
import java.util.Scanner;

import fa.training.DAO.LineItemDAO;
import fa.training.DAO.ipml.LineItemDAOImpl;
import fa.training.entities.LineItem;

public class LineItemService {
	// tạo 1 đối tượng từ ItemDaoimpl để gọi các phương thức
	
	LineItemDAO lineItemDAO = new LineItemDAOImpl();
	
	/*
	 * phương thức hiển thị ra chi tiết các mặt hàng của 1 đơn hàng
	 * 
	 */
	public void getAllItemsByOrderId() {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println(" Nhap ma don hang:");
			int id = Integer.parseInt(scanner.nextLine());
			List <LineItem> lineItems = lineItemDAO.getAllItemsByOrderId(id);
			System.out.println("------Chi tiet don hang cua 1 mat hang -----");
			for (LineItem lineItem : lineItems) {
				System.out.println(lineItem);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/*
	 * Phương thức thêm 1 mặt hàng vào cơ sỡ dữ liệu
	 */
	public void addLineitem() {
		LineItem lineItem = new LineItem();
		lineItem.input();
		if (lineItemDAO.addLineItem(lineItem)) {
			System.out.println("Add lineItem Success! ");
		} else {
			System.out.println("Add lineItem failed!");
		}
	}
	
}
