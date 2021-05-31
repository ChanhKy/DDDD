package fa.training.server;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import fa.training.entities.Airport;
import fa.training.entities.Fixedwing;
import fa.training.entities.Helicopter;

public class AirportService {
	/**
	 * 	Phương thức tìm tìm Airport theo mã ID cho trước
	 * @param ID được cho trước
	 * @param airports	sách các airport
	 * @return
	 */
	public static boolean searchAirport(String ID, ArrayList<Airport> airports) {
		for (Airport airport : airports) {
			if (airport.ID.equals(ID)) {
				System.out.println(airport);
				return true;
			}
		}
		return false;
	}
	/**
	 * Phương thức này hiển thị danh sách các Airport được sắp xếp 
	 * @param airports
	 */
	public static void displayBySortID(ArrayList<Airport> airports) {
		System.out.println("List information of Airport: ");
		Comparator<Airport> com = new Comparator<Airport>() {

			@Override
			public int compare(Airport o1, Airport o2) {
				// TODO Auto-generated method stub
				return o1.getID().compareTo(o2.getID());
			}
		};
		Collections.sort(airports, com);
		System.out.println(airports);
	}
	/**
	 * Phương thức này để hiển thị danh sách các Fiwedwing theo ID, name 
	 * Nếu danh sách trống sẽ in ra không có fiwedwing nào
	 * @param airports
	 */
	public static void displayFixdwing(ArrayList<Airport> airports) {
		System.out.println("List of fixedwing:");
		for (Airport airport : airports) {
			for (Fixedwing fixedwing : airport.fixedwings) {
				System.out.println(fixedwing + "AirportID" + airport.ID + "AirName: " + airport.name);
			}

		}
		
		System.out.println("Not Found ");
	}
	/**
	 * 	phương thức này để hiển thị danh sách các Helicopter theo ID và name
	 * 	Nếu danh sách rỗng sẽ in ra màn hình không có helicopter nào
	 * @param airports
	 */
	public static void displayHelicopter(ArrayList<Airport> airports) {
		System.out.println(" List of Helicopter");
		for (Airport airport : airports) {
			for (Helicopter helicopter : airport.helicopters) {
				System.out.println(helicopter + "AirportID: " + airport.ID + "AirportName: " + airport.name);
			}
			
		}
		System.out.println("Not Found ");
		
	}
	/**
	 * 	Phương thức để thêm mới 1 Airport
	 * 	Gọi đến phương thức nhập từ bàn phím
	 * @param airports
	 */
	public static void addAirport(ArrayList<Airport> airports) {
		System.out.println("Create airport: ");
		Airport airport = new Airport();
		airport.input(airports);
		airports.add(airport);
	}
	/**
	 * Phương thức này để thêm 1 Fixedwing, 
	 * Nó sẽ kiểm tra có Airport nào hiện sẵn sàng không và thêm vào Airport đó
	 * Nếu không có Airport nào sẽ in ra Không có ID
	 * @param airports
	 */
	public static void addFixedwing(ArrayList<Airport> airports) {
		System.out.println("Enter the Airport ID to add fixedwing: ");
		Scanner sc = new Scanner(System.in);
		String ID = sc.nextLine();
		if (searchAirport(ID, airports)) {
			FixedwingService.addFiwedwing(airports, ID);
		} else {
			System.out.println("Not found ID = " + ID);
		}
	}
	/**
	 * Phu
	 * @param airports
	 */
	public static void addHelicopter(ArrayList<Airport> airports) {
		System.out.println("Enter Airport ID to add helicopter:");
		Scanner sc = new Scanner(System.in);
		String ID = sc.nextLine();
		if (searchAirport(ID, airports)) {
			HelicopService.addHelicopter(airports, ID);
		} else {
			System.out.println("NOt Found Id = " + ID);
		}

	}

	public static void removeFixedwing(ArrayList<Airport> airports) {
		displayFixdwing(airports);
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the fixedwing ID to remove");
		String ID = sc.nextLine();
		boolean check = false;
		for (int i = 0; i < airports.size(); i++) {
			if (check)
				break;
			for (int j = 0; j < airports.get(i).fixedwings.size(); j++) {
				if (airports.get(i).fixedwings.get(j).ID.equals(ID)) {
					System.out.println("Remove: " + airports.get(i).fixedwings.get(j));
					airports.get(i).fixedwings.remove(j);
					check = true;
					break;

				}
			}
		}
		if (check) {
			System.out.println("Not found ID " + ID);
		}
	}

	public static void removeHelicopter(ArrayList<Airport> airports) {
		displayHelicopter(airports);
		Scanner sc = new Scanner(System.in);
		System.out.println("enter th Helicopter Id to remove: ");
		String ID = sc.nextLine();
		boolean check = false;

		for (int i = 0; i < airports.size(); i++) {
			if (check)
				break;
			for (int j = 0; j < airports.get(i).helicopters.size(); j++) {
				if (airports.get(i).helicopters.get(j).ID.equals(ID)) {
					System.out.println("Remove : " + airports.get(i).helicopters.get(j));
					airports.get(i).helicopters.remove(j);
					check = true;
					break;
				}
			}
		}
		if (check) {
			System.out.println("Not found ID " + ID);
		}
	}
	
	public static void chanePlaneTypeAndRunwaySizeOffFixedwing(ArrayList<Airport> airports) {
		displayFixdwing(airports);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the fixedwing ID to change:");
		String ID = sc.nextLine();
		boolean check =false;
		
		for (int i =0; i <airports.size(); i++) {
			if (check) break;
			for (int j = 0; j < airports.get(i).fixedwings.size(); j++) {
				if (airports.get(i).fixedwings.get(j).ID.equals(ID)) {
					System.out.println("Change: " + airports.get(i).fixedwings.get(i));
					FixedwingService.chanePlaneTypeAndRunwaySizeOffFixedwing(airports.get(i).fixedwings.get(j), airports.get(i).maxFixWingPark);
					check =true;
					break;
					
				}
			}
		}
		if (!check) System.out.println("Not found ID : " + ID);
	}
	
	public static void displayStatusAirport(ArrayList<Airport> airports) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the airport: ");
		String ID = sc.nextLine();
		if (!searchAirport(ID, airports)) 
			System.out.println("Not found ID: " + ID);
	}
}
