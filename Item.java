
public class Item {
	private int barcode;
	private double cost;
	private String name;
	private char category;
	
	public Item() {
		
	}
	
	public Item(int barcode, String name, double cost, char category) {
		this.barcode = barcode;
		this.name = name;
		this.cost = cost;
		this.category = category;
	}
	
	public void setBarcode(int barcode) {
		this.barcode = barcode;
	}
	
	public int getBarcode() {
		return barcode;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setCost(double cost) {
		this.cost = cost;
	}
	
	public double getCost() {
		return this.cost;
	}
	
	public void setCategory(char category) {
		this.category = category;
	}
	
	public char getCategory() {
		return this.category;
	}
	
	public String toString() {
		return "Name is " + this.name + "\nCategory is " + this.category + "\nbarcode is " + this.barcode;
	}
}
