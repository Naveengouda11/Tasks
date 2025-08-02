package collections;

import java.util.ArrayList;

public class Task1 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("Java");
		al.add("c++");
		al.add("C");
		al.add("Ruby");
		al.add("Python");
		
		
		al.remove(2);
		
		System.out.println(al);
	}

}
