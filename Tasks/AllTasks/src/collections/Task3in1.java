package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Task3in1 {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		hm.put(101, "Alex");
		hm.put(102, "paul");
		hm.put(103, "Jhon");
		hm.put(105, "Rock");
		hm.put(104, "Sunny");
		
		
		hm.remove(104);
		
		for(Map.Entry<Integer, String> e : hm.entrySet()) {
			System.out.println("Roll No : " + e.getKey() + " , Name: " + e.getValue());
		}

	}

}
