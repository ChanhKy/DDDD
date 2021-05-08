package assignment_201;

public class CylinderComputation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double radius;
		double height;
		double surfaceArea = 1295.906968125;
		double baseArea = 490.8738515625;
		double volum = 1963.49540625;
		double Sday;
		// Tính diện tích 2 mặt đáy
		Sday = (surfaceArea - baseArea)/2;
		// tính bán kính
		radius = Math.sqrt(Sday/Math.PI);
		// tính chiều cao
		height = baseArea/(2*radius*Math.PI);
		
		System.out.println("ban kinh hinh tru la: " + radius);
		System.out.println("chieu cao hinh tru la : " + height);
		System.out.println("Dien tich xung quanh: " + baseArea);
		System.out.println("dien tich toan phan: " + surfaceArea);
		System.out.println("the tich : " + volum);
		
	}
	
}
