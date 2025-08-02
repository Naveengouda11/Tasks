package collections;

import java.util.HashSet;
import java.util.Scanner;

public class Task2in1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		HashSet<String> fruits = new HashSet<String>();
		
		System.out.println("Enter the number of ele to be added");
		int n = sc.nextInt();
		
		System.out.println("Enter the fruits names");
		for(int i=0;i<n;i++) {
			String input = sc.next();
			fruits.add(input);
		}
		
		System.out.println("Output is : ");
		for(String fruit:fruits) {
			System.out.println(fruit);
		}
			
 		

	}

}
