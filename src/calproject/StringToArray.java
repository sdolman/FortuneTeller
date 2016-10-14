package calproject;

public class StringToArray {

	public static void main(String args[]) {
		// Create a String
		String fullname = "Seth Haim Dolman";
		
		// Split the String and put it into the array
		String [] eachName = fullname.split("a");
		
		//Print from the array
		for(String x: eachName) {
			System.out.print(x + " . ");
		}
	
	}
	
}
