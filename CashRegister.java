import java.util.List;
import java.util.ArrayList;

public class CashRegister {
	private List<Item> itemList = new ArrayList<Item>();
	
	public void addItem(Item item) {
		if (itemIsValid(item)) {
			itemList.add(item);
		}
		else {
			System.out.println("The barcode is not unique");
		}
	}
	
	private boolean itemIsValid(Item item) {
		for (Item i : itemList) {
			if (item.getBarcode() == i.getBarcode()) {
				return false;
			}
		}
		
		return true;
	}
	
	public void deleteItem(int barcode) {
		for (int i = 0; i < itemList.size(); i++) {
			Item item = itemList.get(i);
			if (item.getBarcode() == barcode) {
				itemList.remove(i);
			}
		}
	}
	
	public Item getItem(int barcode) {
		for (Item item : itemList) {
			if (item.getBarcode() == barcode) {
				return item;
			}
		}
		
		return null;
	}
	
	public void updateItem(int barcode, String name, double cost, char category) {
		Item item = getItem(barcode);
		item.setName(name);
		item.setCost(cost);
		item.setCategory(category);
	}
	
	public void printItemByCategory(char category) {
		for (Item item: itemList) {
			if (item.getCategory() == category) {
				System.out.println(item.toString());
				System.out.println();
			}
		}
	}
	
	public void printAllItems() {
		for (Item item: itemList) {
			System.out.println(item.toString());
			System.out.println();
		}
	}
}
