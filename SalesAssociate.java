package assignment3;

public class SalesAssociate<Timestamp> extends FloorAssociate {

	public SalesAssociate(String firstName, String lastName, String employeeId) {
		super(firstName, lastName, employeeId);
	}
	/**
	 * Identify yourself and approach Customers Politely
	 * @return
	 */
	public double getSalary() {
		return super.getStartingSalary()*1.3 + getTotalBonus(); // makes 30% more salary
	}
	private double getTotalBonus() {
		// TODO Auto-generated method stub
		return 0;
	}
	public int getVacationDays() {
        return super.getVacationDays()+1;  // 1 extra vacation day
    }
	public String getCashPosition()
	{
		Timestamp timeStamp = new Timestamp(System.currentTimeMillis());
		return("Store Location: "+this.getStoreLocation()+
			   "\nEmployee ID: "+this.getEmployeeId()+
			   "\nCash Position: $"+600+
			   "\nTime Stamp: "+ timeStamp);
	}
}