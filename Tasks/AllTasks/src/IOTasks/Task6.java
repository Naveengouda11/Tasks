package IOTasks;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the name: " );
	String name = sc.nextLine();
	
	System.out.println("Enter Email: " );
	String email = sc.nextLine();
	
	System.out.println("Enter Address: " );
	String address = sc.nextLine();
	
	try {
		BufferedWriter writer = new BufferedWriter(new FileWriter("userdate.txt"));
		writer.write(name + "\n");
		writer.write(email + "\n");
		writer.write(address + "\n");
		writer.close();
		
		System.out.println("User data saved in userdata.txt successfully");
	}catch (Exception e) {
		e.printStackTrace();
	}

	}

}
