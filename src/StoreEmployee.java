

// A class to represent behavior common to all type of General Store employees.

public class StoreEmployee extends Person{
	
	 private String employeeId;
	
	
	/**
	 * Takes
	 * @param firstName
	 * @param lastName
	 * @param employeeId
	 */
		 
	public StoreEmployee(String firstName, String lastName, String employeeId) {
		super(firstName, lastName);
		this.employeeId=employeeId;
		
	}
	
	
	public String getEmployeeId() {
		return employeeId;
	}


	public int getHours() {
        return 40;           // Standard employee works 40 hours / week
    }

    public double getSalary() {
        return 30000.0;      // Base Salary of $30,000.00 / year
    }

    public int getVacationDays() {
        return 10;           // Base Vacation - 2 weeks
    }

    public String getVacationForm() {
        return "yellow";     // use the yellow vacation slip
    }
    public String getStoreLocation() {
	        return "Rutgers Campus, New Brunswick, NJ";//address of the store where all the employee works for this store
    }
}