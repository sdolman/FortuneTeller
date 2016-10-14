package calproject;

public class DoWhileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// while loop will only execute if condition is met
		int x = 10;
		while(x < 5) {
			System.out.println("Samson: " + x);
			x++;
		}
	
		//do while will execute once for, then repeat only if condition is true. Total number of times same as while
	int y = 10;
	do {
		System.out.println("Samson Do: " + y);
		y++;
	} while(y < 5);
	
	}

}
