package assignment_201;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("nhap so dau tien");
		int a = sc.nextInt();
		System.out.println("nhap so thu 2");
		int b = sc.nextInt();
		System.out.println("nhap so thu 3");
		int c= sc.nextInt();
		System.out.println("nhap so thu 4");
		int d = sc.nextInt();
		System.err.println("nhap so thu 5");
		int e = sc.nextInt();
		int f = a + b + c + d + e;
		System.out.println("Tong 5 so la : " + f);
		
		
	}

}
