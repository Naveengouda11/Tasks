package collections;

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.plaf.basic.BasicPasswordFieldUI;

public class Task4in1 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("Apple");
		al.add("JackFruit");
		al.add("Ananus");
		al.add("Mango");
		al.add("Banana");
		
		Iterator<String> itr = al.iterator();
		
		while(itr.hasNext()) {
			String word = itr.next();
			if(word.startsWith("A") || word.startsWith("a")) {
				itr.remove();
			}
		}
		System.out.println("Filtered List : " + al);

	}

}
