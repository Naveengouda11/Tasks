package oopsTasks;

class Employee {
	static int count = 0;
	String name;
	
	Employee(String name) {
		this.name = name;
		count++;
	}
	static void showcount() {
		System.out.println("Count is : " + count);
	}
}

public class Task2 {

	public static void main(String[] args) {
		Employee emp = new Employee("Alice");
		Employee e = new Employee("Bob");
		emp.showcount();

	}

}
