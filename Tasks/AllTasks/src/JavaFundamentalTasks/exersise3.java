package JavaFundamentalTasks;
//Command line arguments
public class exersise3 {

	public static void main(String[] args) {
		String input = args[0];
		String reversed = new StringBuilder(input).reverse().toString();
		System.out.println("Reversed :" + reversed);

	}

}
