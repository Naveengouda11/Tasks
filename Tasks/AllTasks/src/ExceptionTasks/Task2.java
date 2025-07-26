package ExceptionTasks;
//Abstract /Non-abstract
abstract class shapee {
	
	abstract void area();
	 void displayShapeType() {
		System.out.println("It is Non Abstract Method");
	}
}
class Circle1 extends shapee {
	double radius = 5;
	void area() {
		System.out.println(Math.PI *radius*radius );
	}
}



public class Task2 {

	public static void main(String[] args) {
		shapee s = new Circle1();
		s.area();
		s.displayShapeType();
	

	}

}
