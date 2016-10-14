package calproject;

public class SubstringExample {
	public static void main(String args[]) {
		String xyz = "abcdef";
		
		//To split the string at abcd
		String myString = xyz.substring(0, 4); // start index up to but not including end
		System.out.println(myString);
		
		//To split the string at ef
		String endString = xyz.substring(4,6);
		System.out.println(endString);
	}
}
