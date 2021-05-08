package exercise4;

public class ArrayReverse {
	public static void main(String[] args) {
		
		int [] myIntArray = {43, 32,53,23,12,34,3,12,43,32};
		
		// in ra cac phan tu cua mang truoc khi dao nguoc
		System.out.println("Cac phan tu cua mang: "+ " "  );
		for (int i =0 ; i <myIntArray.length; i++) {
			System.out.print(myIntArray[i] + "\t" );
		}
		
		//thuc hien dao nguoc thu tu cac phan tu
		// su dung bien trung gian de thuc hien
		for(int i = 0; i < myIntArray.length /2; i++) {
			int temp = myIntArray[i];
			myIntArray[i] = myIntArray[myIntArray.length - 1 -i];
			myIntArray[myIntArray.length - 1 -i] = temp;
		}
		//in ra mang da dao nguoc
		System.out.println("|");
		System.out.println("Reverse array: " + "\n" );
		for ( int i = 0; i < myIntArray.length; i++) {
			System.out.print(myIntArray[i] + "\t");
		}
	
	}
}
