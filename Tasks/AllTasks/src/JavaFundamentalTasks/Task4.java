package JavaFundamentalTasks;
//Data Types in Java
public class Task4 {

	public static void main(String[] args) {
		        // Reference Type: String
		        String name = "Java Developer";

		        // Reference Type: Array of integers
		        int[] scores = {85, 90, 95};

		        System.out.println("Name: " + name);

		        System.out.print("Scores: ");
		        for (int score : scores) {
		            System.out.print(score + " ");
		        }

		        System.out.println("\nTotal subjects: " + scores.length);
		        
		        char[] c = {'H','E','L','L','O'};
		        System.out.println(c);
	
	}

}
