package calproject;

import java.util.Scanner; // for Scanner functions
import java.text.DecimalFormat; 

public class GPACalculator {

	public static void main(String args[]) {
		
		//Create a new scanner object
		Scanner val = new Scanner(System.in);
		
		System.out.println("How many classes have you taken?");
		int nClasses = val.nextInt();
		
		// Create an array of double for grade point values
		double[] gPoints = new double[nClasses];
		String gLetter; 
		
		// Get grades and convert to grade points
		// Assign grade point to array using case switch
		
		
		for(int i = 0; i < nClasses; i++) {
			System.out.println("Enter grade for class #" + (i+1) + " (A/B/C/D/F): ");
			gLetter = val.next(); 
			switch(gLetter) {
			
			case "A":
				gPoints[i] = 4.0;
				continue;
			case "B":
				gPoints[i] = 3.0;
				continue;
			case "C":
				gPoints[i] = 2.0;
				continue;
			case "D":
				gPoints[i] = 1.0;
				continue;
			case "F":
				gPoints[i] = 0.0;
				continue;
			default:
				System.out.println("Invalid grade. Please try again.");
				i--;
				continue;
			}
			
		}
			// Calculate GPA from Array
			double gPointsTotal = 0;
			
			for(int iT = 0; iT < nClasses; iT++) {
				gPointsTotal += gPoints[iT];
			}
			
			DecimalFormat formattingObject = new DecimalFormat("0.00");
			String gPA = formattingObject.format(gPointsTotal/nClasses);
			System.out.println("Your GPA is " + gPA);
			val.close();
				
			}
}
