package JavaFundamentalTasks;
//Strings in Java
public class Task8 {

	public static void main(String[] args) {
	
		String greet = "Hello";
		StringBuilder sb = new StringBuilder(greet);
		sb.append(" World");
		System.out.println(sb);
		sb.delete(0, 6);
		System.out.println(sb);
		
		
//		comapring the String using new Key Word
		String str = "Hello";
		String str1 = new String("Hello");
		
		if(str1 == str) {
			System.out.println("Strings are equal");
		}else {
			System.out.println("Strings are not equal");
		}
	}

}
