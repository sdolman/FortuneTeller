package calproject;

public class StringArrayAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dudes[] = {"Alex","Jeff","Herman"};
		int howManyDudes = dudes.length;
				System.out.println("There are " + howManyDudes + ":");
				 for(int i = 0; i < howManyDudes - 1; i++) {
					System.out.print(dudes[i] + ", ");
							}
				 for(int i = howManyDudes - 1; i < howManyDudes; i++) {
					 System.out.print("and " + dudes[howManyDudes - 1] + ".");
				 }

}
}