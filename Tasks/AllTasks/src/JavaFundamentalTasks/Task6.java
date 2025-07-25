package JavaFundamentalTasks;

import java.util.Scanner;

//Control Flow Statements
public class Task6 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int age = sc.nextInt();
//	If Statement
	if(age >=18) {
		System.out.println("Able to Vote");
	}else {
		System.out.println("Unable to vote under age");
	}
	
//	Switch Statement
	System.out.println("Enter the number1 :");
	int num1 = sc.nextInt();
	
	System.out.println("Enter the number2 :");
	int num2 = sc.nextInt();
	
	System.out.println("Choose the Operator(+,-,/,*");
	char op = sc.next().charAt(0);
	
	double res;
	
	switch(op) {
	case '+' : 
		res = num1 +num2;
		System.out.println("Addition : " + res );
		break;
		
	case '-' : 
		res = num1 -num2;
		System.out.println("Substraction : " + res );
		break;
	case '*' : 
		res = num1 *num2;
		System.out.println("Multiplication : " + res );
		break;
	case '/' : 
		if(num2 != 0) {
		res = num1 /num2;
		System.out.println("Division : " + res );
		}else {
			System.out.println("Can't devide by zero");
		}
		break;
		
	}
	
//	Do While Loop
	int count = 1;

    do {
        System.out.println("Count: " + count);
        count++;
    } while (count <= 5);
}
	
	

}
