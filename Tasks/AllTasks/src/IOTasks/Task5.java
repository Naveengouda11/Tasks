package IOTasks;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable {
	String name;
	int rollNo;
	int marks;
	
	
	public Student(String name, int rollNo, int marks) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.marks = marks;
	}
}

public class Task5 {
	public static void main(String[] args) throws ClassNotFoundException {
		
		Student s = new Student("Paul", 101, 95);
		try {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.ser"));
		oos.writeObject(s);
		oos.close();
		System.out.println("Object serialized and written to student.ser");
		}catch (IOException e) {
			e.printStackTrace();
			
		}
		
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.ser"));
			Student obj = (Student) ois.readObject();
			ois.close();
			
			System.out.println("Deserialized Student:");
			System.out.println("Name: " + obj.name);
			System.out.println("Roll No: " + obj.rollNo);
			System.out.println("Marks: " + obj.marks);
			
			
		}catch (IOException | ClassCastException e) {
			e.printStackTrace();
		}

	}

}
