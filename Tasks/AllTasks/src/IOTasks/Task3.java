package IOTasks;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Task3 {

	public static void main(String[] args) {
	int wordcount = 0;
	
	try {
		BufferedReader reader = new BufferedReader(new FileReader("info.txt"));
		String line;
		
		while((line = reader.readLine()) != null) {
			line = line.trim();
			
			if(!line.isEmpty()) {
				String[] words = line.split("\\s+");
						wordcount += words.length;
			}
 				
		}
		reader.close();
		System.out.println("Total words: " + wordcount);
		
	}catch (IOException e) {
		e.printStackTrace();
	}

	}

}
