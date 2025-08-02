package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

class Student4 {
	String sid;
	String name;
	int marks;
	public Student4(String sid, String name, int marks) {
		super();
		this.sid = sid;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return sid + ", name=" + name + ", marks=" + marks;
	}
	
}
public class Task5in5 {

	public static void main(String[] args) {
		
		List<Student4> students = new ArrayList<>();
        students.add(new Student4("S101", "Alice", 88));
        students.add(new Student4("S102", "Bob", 75));
        students.add(new Student4("S103", "Charlie", 92));
        students.add(new Student4("S104", "Diana", 68));
        students.add(new Student4("S105", "Ethan", 95));
        students.add(new Student4("S106", "Fiona", 81));
        
        PriorityQueue<Student4> pq = new PriorityQueue<Student4>((s1,s2) 
        		-> Integer.compare(s2.marks, s1.marks));
        
        pq.addAll(students);
        
        for(int i=0;i<3 && !pq.isEmpty();i++) {
        	System.out.println(pq.poll());
        }
        		

	}

}
