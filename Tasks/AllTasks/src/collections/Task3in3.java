package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Task3in3 {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		hm.put(111, "Alex");
		hm.put(102, "paul");
		hm.put(131, "Jhon");
		hm.put(105, "Sunny");
		hm.put(125, "Rock");
		
		TreeMap<Integer, String> sort = new TreeMap<Integer, String>(hm);
		for(Map.Entry<Integer, String> e : sort.entrySet()) {
			System.out.println("Roll No : " + e.getKey() + " Name : " + e.getValue());
		}

	}

}
