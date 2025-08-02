package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> al = new ArrayList<String>();
		
		System.out.println("Enter the number of value to be added");
		
		int n = sc.nextInt();
		
		System.out.println("Enter the names that could be added to the list");
		for(int i=0;i<n;i++) {
			String input = sc.nextLine();
			al.add(input);
		}
		
		System.out.println("The entered values are : ");
		for(String s: al) {
			System.out.println(s);
		}
		
		

	}

}
