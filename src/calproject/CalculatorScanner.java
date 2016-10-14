package calproject;

import java.util.Scanner;

public class CalculatorScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// boolean yesMore = true;
		char moreCalc;
		Scanner sc = new Scanner(System.in);
		do {
		System.out.println("Enter 1st number");
		double fNumber = sc.nextDouble();
		System.out.println("Enter 2nd number");
		double secNumber = sc.nextDouble();
		System.out.println("Select operation: +,-,/,*");
		char ope = sc.next().charAt(0);
		switch(ope) {
		case '+' :
			System.out.println(fNumber + secNumber);
			break;
		case '-' :
			System.out.println(fNumber - secNumber);
			break;
		case '/' :
			System.out.println(fNumber / secNumber);
			break;
		case '*' :
			System.out.println(fNumber * secNumber);
			break;
		default :
			System.out.println("Invalid choice");
			break;
		}
		System.out.println("Do you want to do another calculation? Y/N");
		moreCalc = sc.next().charAt(0);
		/*if(moreCalc == 'Y') {
			continue;
		}
		else if(moreCalc == 'y') {
			continue;
		}
		else {
		
			// break;
			// yesMore = false;
		} */
		}while(moreCalc == 'y' || moreCalc == 'Y');
		System.out.println("Goodbye");
	}

}
