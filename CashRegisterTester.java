
public class CashRegisterTester {
	public static void main(String [] args) {
		CashRegister myCashRegister = new CashRegister();
		
		Item myItem = new Item(123456, "Tide 160z Detergent", 16.93, 'A');
		myCashRegister.addItem(myItem);
		myCashRegister.addItem(new Item(12345, "New Item", 10.45, 'A'));
		myCashRegister.deleteItem(123456);
		Item item2 = myCashRegister.getItem(12345);
		System.out.println(item2.toString());
		myCashRegister.updateItem(12345, "Tide 160z Detergent", 16.93, 'C');
		myCashRegister.printItemByCategory('C');
		myCashRegister.printAllItems();
	}
}
