package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student1 implements Comparator<Student1> {
	
	int marks;
	String name;
	

	public Student1(int marks, String name) {
		super();
		this.marks = marks;
		this.name = name;
	}
public Student1() {
	
}

	@Override
	public int compare(Student1 o1, Student1 o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name) ;
	}


	@Override
	public String toString() {
		return "marks=" + marks + ", name=" + name + "]";
	}
	
	
	
}

public class Task5in2 {

	public static void main(String[] args) {
		ArrayList<Student1> al= new ArrayList<>();
		al.add(new Student1(88, "Alice"));
		al.add(new Student1(99, "Paul"));
		al.add(new Student1(87, "Sunny"));
		al.add(new Student1(100, "Rock"));
		
		Collections.sort(al,new Student1());
		
		for(Student1 s : al) {
			System.out.println(s);
		}
		
	}

}
