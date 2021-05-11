package fa.training.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
	private static final String VALID_COURSE_CODE_REGEX = 
			"^(FW)\\d{3}$";
	
	
	public static boolean isCoureCode(String coursCode) {
		Pattern pattern = Pattern.compile(VALID_COURSE_CODE_REGEX);
		Matcher matcher = pattern.matcher(coursCode);
		return matcher.matches();
	}
	
	
	public static boolean isStatus(String status) {
		if ((status.equals("active"))|| (status.equals("no-active"))) {
			return true;
		} 
		return false;
	}
	
	public static boolean isFlag(String flag) {
		if ( (flag.equals("optional")) || (flag.equals("mandatory")) || (flag.equals("N/A"))) {
			return true;
		}	
		   return false;
	}
}


