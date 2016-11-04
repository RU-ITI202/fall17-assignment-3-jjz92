
public class FloorAssociate extends StoreEmployee {

  // Constructor
	public FloorAssociate(String firstName, String lastName, String employeeId) {
		super(firstName, lastName, employeeId);
	}
	/**
	 * Identify yourself and approach Customers Politely
	 * @return
	 */
	
	public String assistCustomers(){
		return "This is " + getFirstName() + ". How may I help you?";
	}
	
	/**
	 * Stack the shelves where necessary/
	 */
	public void stockShelves(){
		System.out.println("Empty? Load it up!");
	}
	
	@Override
	public double getSalary() {
		
		return super.getSalary() + 10000;//$10,000 more than general employee
	}

}
