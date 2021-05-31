package fa.training.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AirplanceAvaildator {
//	private static final String VALID_MODELFIXED_REGEX = "^([0-3][0-9]||40)$";

	public static boolean isModel(String model) {
		if (model.length() <= 40) 
			return true;
		throw new RuntimeException("Chieu dai phai duoi 40 ki tu!");
	}
	

}
