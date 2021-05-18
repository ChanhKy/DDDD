package fa.training.main;

import fa.training.entities.Car;
import fa.training.entities.Ford;
import fa.training.entities.Sedan;
import fa.training.entities.Truck;

public class MyOwnAutoShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Truck truck = new Truck(350, 10000, "red", 230);
		Ford ford1 = new Ford(325, 9500, "black", 2010, 20);
		Ford ford2 = new Ford(320, 9450, "Yellow", 2011, 40);
		Sedan sedan = new Sedan(300, 9500, "Green", 23);
		
		Car car = new Car(100, 100, "While");
		System.out.println("truck: " + truck.getSalePrice());
		System.out.println("ford1: " + ford1.getSalePrice() );
		System.out.println("fod2: " + ford2.getSalePrice());
		System.out.println("sedan: " + sedan.getSalePrice());
		System.out.println("car: " + car.getSalePrice());
		
		}

}
