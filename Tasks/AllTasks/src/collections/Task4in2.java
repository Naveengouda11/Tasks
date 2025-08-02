package collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class Task4in2 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("Apple");
		al.add("JackFruit");
		al.add("Ananus");
		al.add("Mango");
		al.add("Banana");
		
		
		ListIterator<String> litr = al.listIterator();
		
		System.out.println("Forward trevarsal: ");
		
		while(litr.hasNext()) {
			System.out.println(litr.next());
		}
		System.out.println("\nBackword Traversal: ");
		while(litr.hasPrevious()) {
			System.out.println(litr.previous());
		}
	}

}
