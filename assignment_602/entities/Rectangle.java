package fa.training.entities;

public class Rectangle implements Shape{

	private int width;
	private int length;
	
	public Rectangle() {
	
	}
	
	
	
	public Rectangle(int length, int width) {
		super();
		this.length = length;
		this.width = width;
	}



	@Override
	public int calculatePerimeter() {
		return (length + width)*2;
	}
	@Override
	public int calculateArea() {
		return length * width;
	}
	@Override
	public int getLength() {
	
		return length;
	}
	
	@Override
	public int getWidth() {

	
		return width;
	}
	
	@Override
	public int getLengthWidth(int len, int width) {
		// TODO Auto-generated method stub
		return 0;
	}



	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + ", calculatePerimeter()=" + calculatePerimeter()
				+ ", calculateArea()=" + calculateArea() + "]";
	}
	
	
	
}
