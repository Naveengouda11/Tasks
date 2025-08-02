package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task1in2 {

	public static void main(String[] args) {
		List<Integer> ls = new ArrayList<Integer>();
		
		ls.add(10);
		ls.add(5);
		ls.add(2);
		ls.add(7);
		ls.add(3);
		
	
		Collections.sort(ls);
		System.out.print("Asceding Order : " + ls);
		
		System.out.println("");
		Collections.reverse(ls);
		System.out.println("Decending order : " + ls);
	}

}
