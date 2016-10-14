package calproject;

public class LastDoubleIt {
	public static void main(String[] args) {
		/*int lastDoubled = 1;
		for(int i = 1; i <= 10; i++) {
			lastDoubled = 2 * lastDoubled;
			System.out.println(lastDoubled);
		}*/
		
		// Declaring an Array
		int count = 100;
		int[] abc = new int[count];
		
		
		// Initialize the 1st element in the Array
		abc[0] = 2;
		
		// Fill the array 
		
		for(int i = 1; i < count; i++) {
			abc[i] = abc[i-1] * 2;
		}
		
		// Print the array
		
		for(int i = 0; i < count; i++) {
			System.out.println(abc[i]);
		}
	}
}
