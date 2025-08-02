package collections;

import java.util.HashSet;
import java.util.Set;

public class Task1in3 {

	public static void main(String[] args) {
		Set<String> language = new HashSet<String>();
		
		language.add("Java");
		language.add("C");
		language.add("Java");
		language.add("Python");
		
		System.out.println("Duplicate language is removed : " + language);

	}

}
