package JavaFundamentalTasks;
//Using Java Keyword
public class Task2 {
	 static final int MAX = 5;

	public static void main(String[] args) {
		 
		        int number = 0;

		        for (int i = 0; i < MAX; i++) {
		            number += i;

		            if (i == 3) {
		                System.out.println("Number is " + number + " at i = 3");
		                break; 
		            } else if (i % 2 == 0) {
		                continue; 
		            }

		            System.out.println("i = " + i);
		        }

		        boolean isDone = false;
		        while (!isDone) {
		            number++;
		            if (number > 10) {
		                isDone = true;
		            }
		        }

		        System.out.println("Final number is: " + number);
		    }
		

		

	}


