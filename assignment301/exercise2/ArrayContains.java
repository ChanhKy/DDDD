package exercise2;

import java.util.Arrays;

public class ArrayContains {
	public static void main(String[] args) {
		String [] stringArray = new String [4];
		String sValues = "Fresher";
		stringArray[0] = "FPT";
		stringArray[1] = "Fresher";
		stringArray[2] = "Acedemyy";
		stringArray[3] = "2018";
		
		// kiểm tra trong mảng stringArray có chứa giá trị biến sValuess
		if (Arrays.asList(stringArray).contains(sValues)) {
			System.out.println("check" + sValues + " in Array Contained");
		} else {
			System.out.println(" check" + sValues + "in Array No Contained");
		}
		
	}
}
