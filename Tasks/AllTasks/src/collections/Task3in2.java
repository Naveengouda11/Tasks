package collections;

import java.util.HashMap;

public class Task3in2 {

	public static void main(String[] args) {
		
		String input = "Hello";
		
		HashMap<Character, Integer> freqMap = new HashMap<Character, Integer>();
		
		for(char c : input.toCharArray()) {
			if(freqMap.containsKey(c)) {
				freqMap.put(c, freqMap.get(c) + 1);
			}else {
				freqMap.put(c, 1);
			}
		}
		System.out.println("Charcater Frequency : " + freqMap);

	}

}
