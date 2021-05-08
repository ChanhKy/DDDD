package exercise3;

import java.util.Scanner;

public class FrequentNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int n ;
	int count = 0;
	Scanner sc =new Scanner(System.in);
	
	//nhap so phan tu cua mang
	do {
		System.out.println("Nhap so phan tu cua mang: ");
		n = sc.nextInt();
	} while (n <0);
	// khai bao mang
	int []arrayInt = new int [n];
	//nhap so gia tri cho tung phan tu
	System.out.println("Nhap cac phan tu cho mang: ");
	for (int i = 0; i < n ; i++) {
		System.out.println("Phan tu thu " + i + ":");
		arrayInt[i] = sc.nextInt();
	}
	
	//nhap so can  kiem tra
	System.out.println("nhap vao 1 so nguyen bat ky: ");
	int number = sc.nextInt();
	
	// kiem tra trong mang xuat hien so can kiem tra khong, va dem so lan xuat hien
	for (int i = 0; i <n; i++) {
		if (arrayInt[i] == number) {
			count++;
			System.out.println("Chi so xuat hien cua "+number+" la: " + arrayInt[i]);
			
		}
		
	}
	
	System.out.println("So phan tu " + number+ " co trong mang la: " + count);
	
	}

}
