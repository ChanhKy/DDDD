package exercise;

public class StringSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// String bat bien
		System.out.println("==String Immutable: always create new object"
				+ "when chaing==");
		String value = "fpt";
		System.out.println("Berfoce change: " + value);
		value.concat("software");
		value.toUpperCase();
		System.out.println("After change: " + value);
		
		
		// String
		System.out.println("\n === String Literal:" + "the same reference to" 
		+ " only one value in the string pool ==");
		String firstString = "Vietnam";
		String secondString = "Vietnam";
		String thirdString = "Japan";
		
		System.out.println("firstString == secondString: " + (firstString == secondString));
		System.out.println("firstStrin == thirdString" + (firstString == thirdString));
		
		
		// String Object
		System.out.println("\n -- String Object: the differrence reference in heap space --");
		String fourString = new String("Vietnam");
		String fiveString = new String("Vietnam");
		String sixString = new String ("Japan");
		
		System.out.println("fourString == fiveString: " + (fourString == fiveString));
		System.out.println("foursString == sixString: " + (fourString == sixString));
		
		// String method
		System.out.println("\n -- String method: --" );
		String str = "Fpt Software";
		System.out.println("concat() method:"+ str.concat(" VietNam"));
		System.out.println("toUpperCase() method: " + str.toUpperCase());
		System.out.println("toLowerCase() method: " + str.toLowerCase());
		System.out.println("subString(0,4) method: " + str.substring(0,4));
		System.out.println("length() method: " + str.length());
		System.out.println("indexOf(\"t\") method  " + str.indexOf("t"));
		System.out.println("lastIndexOf() method: " + str.lastIndexOf("t"));
		System.out.println("charArt(8) method: " + str.charAt(8));
		System.out.println("contains(\"ware\" method: " + str.contains("ware"));
		
		String s1 = "FPT";
		String s2 = new String("FPT");
		System.out.println("s1 == s2 " + (s1 == s2));
		System.out.println("s1.equals(s2): " + (s1.equals(s2)));
	}

}
