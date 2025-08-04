package IOTasks;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Task1 {

	public static void main(String[] args) {
		File obj = new File("info.txt");
		System.out.println("File Created");
		try {
			if(obj.createNewFile()) {
				System.out.println("File Created : " + obj.getName());
			}else {
				System.out.println("File Not Exist");
			}
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
		FileWriter writer = new FileWriter("info.txt");
		writer.write("Java I/O is powerful!\n");
		writer.write("Learn Java step-by-step\n");
		writer.close();
		}
		catch (IOException e) {
	e.printStackTrace();
		}

	}

}
