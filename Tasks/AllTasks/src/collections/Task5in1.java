package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

class Student implements Comparable<Student> {
	
	int marks;
	String name;
	

	public Student(int marks, String name) {
		super();
		this.marks = marks;
		this.name = name;
	}
	
	


	@Override
	public int compareTo(Student o) {
		
		return this.marks - o.marks;
	}




	@Override
	public String toString() {
		return name + " (" + marks + ")" ;
	}
	
	
	
}

public class Task5in1 {

	public static void main(String[] args) {
		ArrayList<Student> al= new ArrayList<>();
		al.add(new Student(88, "Alice"));
		al.add(new Student(99, "Paul"));
		al.add(new Student(87, "Sunny"));
		al.add(new Student(100, "Rock"));
		
		Collections.sort(al);
		
		System.out.println("Asending order on marks");
		for(Student s : al) {
			System.out.println(s);
		}
		

	}

}
