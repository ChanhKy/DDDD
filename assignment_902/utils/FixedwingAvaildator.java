package fa.training.utils;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import fa.training.entities.Airport;
import fa.training.entities.Fixedwing;

public class FixedwingAvaildator {
	private static final String VALID_FIXEDWING_REGEX = "^(FW)\\d{5}$";
	
	// dinh dang ID may bay
	public static boolean isID(String ID, ArrayList<Airport> airports){
		for (Airport airport : airports) {
			for (Fixedwing fixedWing: airport.fixedwings) {
				if(fixedWing.ID.equals(ID)) {
					throw new RuntimeException("ID da bi trung");
				}
			}
		} 
		if (ID.matches(VALID_FIXEDWING_REGEX)) 
			return true;
		throw new RuntimeException("ID khong chinh xac!!!");
		
	}
	
	// dinh dang MODEl may bay
	public static boolean isType(String type) {
		if ((type.equals("CAG")) || (type.equals("LGR")) || (type.equals("PRV")))
			return true;
			throw new RuntimeException("Nhap loai may bay sai!!!");
	}
	
	//yeu cau ve kich thuoc duong bang toi thieu
	
	public static boolean isParked(double minNeedRunSize, double maxFixedwingParkingPlace) {
		if (minNeedRunSize <= maxFixedwingParkingPlace) return true;
		throw new RuntimeException("Duong bay toi thieu cua may bay khong duoc vuot qua duong bay cua san bay ");
		
	}
	

}
