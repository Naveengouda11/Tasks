package oopsTasks;

class Vehicle {
	String brand;
	int speed;
	
	void displayDetails() {
		System.out.println("Vehicle Name : " + brand + ", " + "Vehicle Speed : " + speed + "km/h");
	}
	
}
class Car extends Vehicle {
	String color = "Black";
}

class Bike extends Vehicle {
	String Color = "White";
}
public class Task5 {

	public static void main(String[] args) {
		Car c1 = new Car();
		c1.brand = "BMW";
		c1.speed = 400;
		c1.displayDetails();
		
		
		Bike b1 = new Bike();
		b1.brand = "Ninja z900";
		b1.speed = 200;
		b1.displayDetails();
		
		

	}

}
