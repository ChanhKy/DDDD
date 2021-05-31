package fa.training.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import fa.training.entities.Airport;
import fa.training.entities.Helicopter;

public class HelicopAvaildator {

	private static final String VALID_HELICOPTER_REGEX = "^(RW)\\d{5}$";
	// dinh dang ID truc thang
	public static boolean isHelicopter(String ID, ArrayList<Airport> airports) {
		for (Airport airport : airports) {
			for (Helicopter helicopter : airport.helicopters) {
				if (helicopter.ID.equals(ID)) 
					throw new RuntimeException("ID da bi trung!");
			}
		}
		if (ID.matches(VALID_HELICOPTER_REGEX)) 
			return true;
		throw new RuntimeException("nhap ID da sai, vi du: RW00001");
	}
	
	public static boolean isMaxTakeOffWeight(double maxTakeOffWeight, double emptyWeight) {
		if (maxTakeOffWeight < (emptyWeight * 1.5)) 
			return true;
		throw new RuntimeException("Trong luong cat canh da lon hon trong luong rong cua truc thang");
	}
//	
//	public static boolean isID(String ID, List<Airport> airports) {
//		for (Airport airport : airports) {
//			airport.helicopters.forEach(helicopter -> {
//				if (helicopter.ID.equals(ID)) throw new RuntimeException("ID has been exits"); 
//			});
//		}
//		if (ID.matches("[R][W][0-9]{5}")) return true;
//		throw new RuntimeException("ID incorret. Ex: RW00001");
//	}
}
