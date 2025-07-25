package oopsTasks;

abstract class shape {
	abstract double area();
}

class Circle extends shape {
	double radius;
	Circle(int r) {
		radius = r;
	}
	double area() {
	
	double res = Math.PI * radius * radius;
	return res;
	}
}

class Rectangle extends shape{
	double l,W;
	Rectangle(int l,int W) {
		l =l;
		W =W;
	}
	double area() {
		
		double res1 = l * W;
		return res1;
	}
}
public class Task4 {

	public static void main(String[] args) {
		Circle c1 = new Circle(5);
		Rectangle r1 = new Rectangle(50, 10);
		
		System.out.println("Area of Circle : " + c1.area());
		System.out.println("Area of Rectangle : " + r1.area());
		
		
	

	}

}
