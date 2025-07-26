package ExceptionTasks;

abstract class shape {
	abstract void area();
}

class Circle extends shape {
	double radius;
	Circle(double r) {
		this.radius = r;
	}
	void area() {
		double res = Math.PI * radius *radius;
		System.out.println("Area od Circcle is : " + res);
	}
}
class Rectangle extends shape {
	double length,width;
	 Rectangle(double L,double W) {
		this.length = L;
		this.width = W;
	}
	 void area() {
		 double res = length * width;
		 System.out.println("Arae of Rectangle is : " + res);
	 }
}

public class Task1 {

	public static void main(String[] args) {
		Circle c1 = new Circle(5);
		Rectangle r1 = new Rectangle(10, 5);
		
		c1.area();
		r1.area();

	}

}
