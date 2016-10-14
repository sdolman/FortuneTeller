package calproject;

import java.util.Scanner;

public class NextLineTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter integer");
		int i = sc.nextInt();
		System.out.println("Enter string");
		sc.nextLine(); // crucial for clearing return from previous nextInt
		String uText = sc.nextLine();
		System.out.println("String: " + uText);
		sc.close();
	}

}
