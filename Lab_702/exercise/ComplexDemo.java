package exercise;

public class ComplexDemo {
	public static void main(String[] args) {
		Complex currenNumber = new Complex(1000,2000);
		Complex otherNumber = new Complex(600,800);
		
		
		Complex resultNumber = currenNumber.add(otherNumber);
		
		System.out.println(resultNumber);
	}
}
