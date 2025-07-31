package javaWrapperTask;

import java.util.ArrayList;
import java.util.List;

//AutoBoxing and UnBoxing
public class Task2 {

	public static void main(String[] args) {
		
		double sum = 0;
		
		double d1 = 100.5;
		double d2 = 120.45;
		double d3 = 150.55;
		
		List<Double> ld  = new ArrayList<Double>();
		
		ld.add(d1);
		ld.add(d2);
		ld.add(d3);
		
		for(int i=0;i<ld.size();i++) {
			sum += ld.get(i);
			
		}
		
		double avg = sum / ld.size();
		System.out.println("Sum od all values : " + sum);
		System.out.println("Average of numbers : " + avg);
	}
	
	

}
