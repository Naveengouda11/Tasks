package oopsTasks;

class Calculator {
	public void add(int a,int b) {
		int res = a + b;
		System.out.println("Addition of numbers : " + res);
		
	}
	public void add(double a,double b) {
		double res = a + b;
		System.out.println("Addition of numbers : " + res);
		
	}
	public void add(String a,String b) {
		String res = a + b;
		System.out.println("Addition of numbers : " + res);
		
	}
}

public class Task6 {

	public static void main(String[] args) {
		Calculator add = new Calculator();
		
		add.add(1, 2);
		add.add(10, 20);
		add.add(100, 200);
		

	}

}
