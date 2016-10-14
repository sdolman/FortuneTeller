package calproject;

import java.util.Scanner; 

public class SwitchStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//char grade = 'C';
		Scanner sc = new Scanner(System.in);
		String grade;
		do{	
			System.out.println("Enter grade");
			grade = sc.nextLine();
			switch(grade) {		
			case "A" :
				System.out.println("Excellent!");
				continue;
			case "C" :
				System.out.println("Well done");
				continue; // break is keyword to exit loop
			default :
				System.out.println("Invalid grade");
				continue;
			}
	//	System.out.println("Your grade is " + grade);
	} while(grade != "X");
		sc.close();
	}
	
}
