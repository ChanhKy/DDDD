package dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Customer;
import entities.Order;
import service.OrderService;
import utils.Validator;

public class CustomerDaoImpl implements CustomerDao {
	private List<String> list = new ArrayList<String>();

	@Override
	public List<String> createCustomer() {
		Scanner sc = new Scanner(System.in);
		Customer c = new Customer();
		OrderService odService = new OrderService();
		list.addAll(list);
		System.out.println("----Enter Customer Information----");
		boolean check;
		String phone = "";
		do {
			System.out.println("Enter name");
			c.setName(sc.nextLine());
			do {
				System.out.println("Enter phone");
				phone = sc.nextLine();
			} while (!Validator.isOrderNumber(phone));
			c.setPhoneNumber(phone);
			System.out.println("Enter address");
			c.setAddress(sc.nextLine());
			System.out.println("Enter order info");
			List<Order> orderList = odService.createListOrder();
			c.setListOfOrder(orderList);
			list.add(c.toString());
			System.out.println("Enter N or n to finish entering customer information. Press any key to continue");
			String r = sc.nextLine();
			check = (r.equals("n") || r.equals("N")) ? false : true;
		} while (check);
		return list;
	}

	@Override
	public void showAll() {
		if (list.size() > 0) {
			for (String sList : list) {
				System.out.println(sList);
			}
		} else {
			System.out.println("No customer");
		}
	}

	@Override
	public boolean remove(String phone) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).contains("phoneNumber=" + phone)) {
				list.remove(i);
				return true;
			}
		}
		return false;
	}

	@Override
	public List<String> search(String phone) {
		List<String> newList = new ArrayList<String>();
		for (String item : list) {
			if (item.contains(phone)) {
				newList.add(item);
			}
		}
		return newList;
	}

	
	
	
	
	
	
	
	
	
	@Override
	public List<String> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
}
