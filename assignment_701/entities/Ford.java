package fa.training.entities;

public class Ford extends Car{
	
	private int year;
	private int manufactureDiscount;
	
	
	
	public Ford() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Ford(int speed, double regularPrice, String color) {
		super(speed, regularPrice, color);
		// TODO Auto-generated constructor stub
	}
	public Ford(int speed, double regularPrice, String color, int year, int manufactureDiscount) {
		super(speed, regularPrice, color);
		this.year = year;
		this.manufactureDiscount = manufactureDiscount;
	}	
		public double getSalePrice () {
			return super.getSalePrice() - manufactureDiscount;
		}
		
	}


