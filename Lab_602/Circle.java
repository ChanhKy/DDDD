package exercise;


public class Circle {
	private double radius;

	public Circle() {
		this.radius = 2.0;
	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	
	public double getRadius(){
		return radius;
	}
	
	//lấy giá trị PI từ lớp Math
	//Gọi hàm Math.pow() - tính lũy thừa để tính r ^2
	public double getArea()	{
		return Math.PI * Math.pow(radius,2);
	}
	
	
}
