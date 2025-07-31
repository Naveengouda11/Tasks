package javaWrapperTask;

public class Task3 {
	
	void parseXxx() {
		String num1 = "123";
		String num2 = "45.67";
		String flag = "true";
		
		int n1 = Integer.parseInt(num1);
		double n2 = Double.parseDouble(num2);
		boolean f = Boolean.parseBoolean(flag);
		
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(f);
	}

	public static void main(String[] args) {
		Task3 t1 = new Task3();
		t1.parseXxx();
		
		
	}

}
