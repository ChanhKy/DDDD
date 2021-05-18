package fa.training.entities;

public class Truck extends Car {
	private double weight;


	public Truck() {
	
	}

	public Truck(int speed, double regularPrice, String color, double weigth) {
		super(speed, regularPrice, color);
		this.weight = weight;
	
	}

	@Override
	public double getSalePrice() {
		return super.getSalePrice() * ( weight > 2000.0? 0.9 : 0.8);
	}

	
}
