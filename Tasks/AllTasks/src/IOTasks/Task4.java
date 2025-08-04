package IOTasks;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Task4 {

	public static void main(String[] args) {
		try {
			BufferedReader reader = new BufferedReader(new FileReader("info.txt"));
			BufferedWriter writer = new BufferedWriter(new FileWriter("copy.txt"));
			
			String line;
			while((line = reader.readLine()) != null) {
				writer.write(line);
				writer.newLine();
			}
			reader.close();
			writer.close();
			
			System.out.println("File Coiped");
		}catch (IOException e) {
			e.printStackTrace();
		}

	}

}
