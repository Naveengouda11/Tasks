package JavaFundamentalTasks;
//Operators in Java
public class Task5 {

	public static void main(String[] args) {
//		Arithmetic Operators
		
		int a=5,b=10;
		int add = a+b;
		int sub = a-b;
		int mul = a*b;
		int div = a/b;
		
		System.out.println("Addition of numbers : " + add);
		System.out.println("Substration of numbers : " + sub);
		System.out.println("Multiplication of Numbers : " + mul);
		System.out.println("Division of numbers : " + div);
		
//		Relational Operators
		
		if(a == b) {
			System.out.println("a & b are equal");
		}else {
			System.out.println("not equal");
		}
		
		if(a != b) {
			System.out.println("a & b are equal");
		}else {
			System.out.println("not equal");
		}
		
//		Logical Operator
		if(a != b && b > a) {
			System.out.println("B is greater");
		}else {
			System.out.println("A is greater");
		}
		
		if (a == b || b > a) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		
//		Unary operator
		System.out.println(a++);
		System.out.println(++a);
		
		System.out.println(a--);
		System.out.println(--a);
		
//		BitWise Operator
		int x = 10; 
		System.out.println(x >> 1);
		System.out.println(x << 1); 
		
//		Assignment Operator
		int n = 10;
		int sum = 0;
		for (int i=0;i<=n;i++) {
			sum += i;
		}
       System.out.println("Sum of numbers is : " + sum);
  
	}

}
