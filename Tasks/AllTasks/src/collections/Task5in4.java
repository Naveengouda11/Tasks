package collections;

import java.util.*;


class Student3 {
	String name;
	String id;
	int marks;
	public Student3(String name, String id, int marks) {
		super();
		this.name = name;
		this.id = id;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student3 [name=" + name + ", id=" + id + ", marks=" + marks + "]";
	}
	
	
}

public class Task5in4 {

	public static void main(String[] args) {
		
		List<Student3> stdList = new ArrayList<>();
		stdList.add(new Student3("Alice", "S101", 88));
		stdList.add(new Student3("Bob", "S102", 75));
        stdList.add(new Student3("Charlie", "S103", 92));
        stdList.add(new Student3("Diana", "S104", 68));
        
        Map<String,Student3> stdMap = new HashMap<String, Student3>();
        for(Student3 s : stdList) {
        	stdMap.put(s.id, s);
        }
        for(Map.Entry<String, Student3> entry : stdMap.entrySet()) {
        	System.out.println("ID : " + entry.getKey() + " -> " + entry.getValue());
        }
	}
	
	

}
