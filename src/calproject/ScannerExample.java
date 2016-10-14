package calproject;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//create a new scanner object
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your first name");
		String fName = sc.nextLine();
		System.out.println("Enter your last name");
		String lName = sc.nextLine();
		System.out.println("How many awesome are you? (X.X)");
		double myHeight = sc.nextDouble();
		System.out.println("Your name is " + fName + " " + lName + ", and you are " + myHeight + " units of awesome.");
	}

}
