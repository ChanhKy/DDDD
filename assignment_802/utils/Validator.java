package fa.training.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Validator {

	public static boolean isDate(String date) {
		SimpleDateFormat dateformat = new SimpleDateFormat("dd/MM/yyy");
		dateformat.setLenient(false);
		try {
			Date d = dateformat.parse(date);
			dateformat = new SimpleDateFormat("yyyy");
			if (Integer.valueOf(dateformat.format(d)) < 1000)
				return false;
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	public static boolean isPhone(String phone) {
		try {
			Integer.valueOf(phone);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	public static boolean isNumber(String number) {
		try {
			Integer.valueOf(number);
		} catch (Exception e) {
			return false;
		}
		return number.length() == 10;
	}
}
