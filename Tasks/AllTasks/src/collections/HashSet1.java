package collections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HashSet1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<String>  fruits = new HashSet<String>();
		
		System.out.println("Enter the number of ele");
		int n= sc.nextInt();
		
		for(int i=0;i<n;i++) {
			String input = sc.next();
			fruits.add(input);
		}
		
		System.out.println("Output is : ");
		for(String fruit: fruits) {
			System.out.println(fruit);
		}
		
		

	}

}
