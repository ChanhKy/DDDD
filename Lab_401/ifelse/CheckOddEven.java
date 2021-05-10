package exercise.ifelse;

import java.util.Scanner;

public class CheckOddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new  Scanner(System.in);
		
		System.out.println("Enter value for number:");
		int number = scanner.nextInt();
		
		System.out.println("The number is " + number);
		if ( number % 2 == 0 ) {
			System.out.println("Even Number");
		} else {
			System.out.println("Odd Number");
		}
		System.out.println("====================");
		System.out.println("BEY");
	}

}
