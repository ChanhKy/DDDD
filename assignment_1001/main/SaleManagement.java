package fa.training.main;

import java.util.Scanner;

import fa.training.common.DatabaseConnection;

import fa.training.service.CustomerService;
import fa.training.service.LineItemService;
import fa.training.service.OrderService;

public class SaleManagement {
	public static void main(String[] args) {
		DatabaseConnection connection = new DatabaseConnection();
		DatabaseConnection.getConnection();
		System.out.println("=============*===========");
		CustomerService cus = new CustomerService();
		OrderService ord = new OrderService();
		LineItemService lineItem = new LineItemService();

		Scanner scanner = new Scanner(System.in);
		int choice;

		do {
			showMenu();
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				cus.showStudentsInfo();
				break;
			case 2:
				ord.getAllorderByCustomerId();
				break;
			case 3:
				lineItem.getAllItemsByOrderId();
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				break;
			case 7:
				break;
			case 8:
				ord.addOrder();
				break;
			case 9:
				lineItem.addLineitem();
				break;
			case 10:
				ord.updateOrderTotal();
				break;
			default:
				System.out.println("Vui long chon lai ... ");
				break;
			}

		} while (choice != 0);

	}

	public static void showMenu() {
		System.out.println("+----------------------------------------------+");
		System.out.println("|                CHỌN CHỨC NĂNG                |");
		System.out.println("| 1. Liệt kê tất khách hàng (ID + Name)        |");
		System.out.println("| 2. Liệt kê tất cả đơn hàng theo mã khách hàng|");
		System.out.println("| 3. Liệt kê chi tiết đơn hàng theo mã đơn hàng|");
		System.out.println("| 4.                                           |");
		System.out.println("| 5.                                           |");
		System.out.println("| 6.                                           |");
		System.out.println("| 7.                                           |");
		System.out.println("| 8. Tạo đơn hàng vào Cơ sở dữ liệu            |");
		System.out.println("| 9. Tạo chi tiết đơn hàng vào Cơ sở dữ liệu   |");
		System.out.println("| 10.Cập nhật tổng đơn hàng theo mã hóa đơn    |");
		System.out.println("| 0. Chọn 0 để thoát chương trình              |");
		System.out.println("+----------------------------------------------+");
	}
}
