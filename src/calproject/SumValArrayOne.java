package calproject;

public class SumValArrayOne {

	public static void main(String [] args) {
		
//		int[] xyz = new int[4];
		int[] xyz = {1,2,3,4};
		int sum = 0;
		
/*		xyz[0] = 1;
		xyz[1] = 2;
		xyz[2] = 3;
		xyz[3] = 4;*/
		
		for (int z = 0; z < 4; z++){
			System.out.print(z + ";");
		}
	for (int z = 0; z < 4; z++){
		sum+= z;
		
	}
	System.out.print("");
	System.out.print("The total of the array is =" +sum);
	}
	
	
}
