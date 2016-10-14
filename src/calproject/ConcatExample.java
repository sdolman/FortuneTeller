package calproject;

public class ConcatExample {

	public static void main(String args[]) {
		//Create 1st String
		String myString = "Is a string immutable?";
		
		// myString = myString.concat(" Yes it is.");
		myString += "Yes it is.";
		System.out.println(myString);
		
		//IndexOf Example
		int positionImmutable = myString.indexOf("immutable");
		System.out.println("The position is " + positionImmutable);
		
	}
}
