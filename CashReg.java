
import java.util.Scanner;

public class CashReg  extends CashRegister {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		{
			System.out.println("Select an option:"
					+ "1. Add new Item in Cash register"
					+ "2. Update price for Iten in Cash Register"
					+ "3. Delete Item from Cash Register"
					+ "4. Display all Items stored in Cash Register"
					+ "5. Display Item Detail (ask for barcode)"
					+ "6. Display Iten for Selected Category"
					+ "7.Exit"); /** creates a list of options for a user to choose from**/
			Scanner scan = new Scanner(System.in);
			int i = scan.nextInt();
			
		int input1 = 1;
		switch(input1)/**allows for the various inputs to be used, and the output to be dependent on specific inputs**/
		{
		case '1' :
			System.out.println("Please add the new item");
			break;
		case '2' :
			System.out.println("Update the price for the item");
			break;
		case '3' :
			System.out.println("Delete an item");
		case '4' :
			System.out.println("You have selected to display all items stored"
					+ "Barcode: 123456, Name: Test Item, Cost: $20.50, Category: Other");
		case '5':
			System.out.println("Enter barcode to display item detail");
		case '6' :
			System.out.println("Display Item for Selected categoy");
		case '7' :
			System.out.println("Thank you for using Cash Register. Have a good day!");
		}
	}

}

	private static Object charAt(int i) {
		// TODO Auto-generated method stub
		return null;
	} }