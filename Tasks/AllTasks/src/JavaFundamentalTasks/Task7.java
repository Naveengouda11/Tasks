package JavaFundamentalTasks;
// Array To find Max value
public class Task7 {

	public static void main(String[] args) {
		
		int max_value = Integer.MIN_VALUE;
		
		int arr[] = {50,20,70,75,90};
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] > max_value) {
				max_value = arr[i];
			}	
			
		}
		System.out.println(max_value);
		
//		Array to find Minimum Value
		
		int min_value = Integer.MAX_VALUE;
		
		int arr1[] = {50,20,70,75,90};
		for (int i=0;i<arr.length;i++) {
			if(arr[i]<min_value) {
				min_value = arr[i];
			}
		}
		System.out.println(min_value);

	}

}
