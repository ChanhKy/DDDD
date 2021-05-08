package assignment_201;

import java.util.Scanner;

public class Exercise2 {

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
		
		if (a==b&&c==d&&a==c) {
			System.out.println("Cac con so bang nhau");
		}else {
				System.out.println("Cac con so khong bang nhau");
			
			
		
		}
		
	}

}
