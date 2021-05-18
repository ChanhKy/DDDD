package fa.training.main;

import java.awt.geom.Area;
import java.util.Scanner;

import fa.training.entities.Rectangle;
import fa.training.entities.Shape;

public class ShapeTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap do dai cua mang: ");
		int n = scanner.nextInt();
		Rectangle [] rectangs = new Rectangle[3];
		
		rectangs[0] = new Rectangle(2, 3);
		rectangs[1] = new Rectangle(3, 5);
		rectangs[2] = new Rectangle(2, 4);
		
		
		// nhap do dai tu ban phim
//		for(int i = 0; i <n; i++) {
//			System.out.println("Hinh chu nhat thu: " + (i + 1));
//			System.out.println("Nhap chieu dai cua hinh chu nhat: ");
//			int length = scanner.nextInt();
//			System.out.println("Nhap chieu rong cua hinh chu nhat: ");
//			int width = scanner.nextInt();
//			rectangs[i] = new Rectangle(length, width);	
//		}
		// hien thi danh sach hinh chu nhat
		for (Rectangle rectangle : rectangs) {
			System.out.println(rectangle.toString());
		}
		
		int areaMax = 1;
		// tinh dien tich lon nhat
		for ( int i= 0; i < rectangs.length; i++ ) {
			if( rectangs[i].calculateArea() > areaMax) {
				areaMax = rectangs[i].calculateArea() ;
			}
		}
		System.out.println("Hinh chu nhat co dien tich lon nhat: " + areaMax);
		
		
		
		
	}

}
