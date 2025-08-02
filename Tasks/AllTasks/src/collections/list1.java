package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class list1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<String> ls = new ArrayList<String>();
		
		System.out.println("Enter the number of element to be added");
		
		int n = sc.nextInt();
		
		System.out.println("Eneter the elements");
		
		for(int i=0;i<n;i++) {
			String input = sc.next();
			ls.add(input);
		}
		
		System.out.println("Output");
		
		for(String s : ls) {
			System.out.println(s);
		}
		

	}

}
