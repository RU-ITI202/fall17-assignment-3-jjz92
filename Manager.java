package assignment3;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;


// A class to represent GeneralStore Manager.

public class Manager extends StoreEmployee {

  	// Constructor
    public Manager(String firstName, String lastName, String employeeId) {
		super(firstName, lastName, employeeId);
	}

		public void monitorEmployees() {
	        System.out.println("Monitoring Empoyees work! Great Job! Keep it going!");
    }
    
    public void assignWork(StoreEmployee employee) {
				DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
				Date date = new Date();
				System.out.println(dateFormat.format(date));
		    System.out.println("Assigning Work to: Associate Name:" + employee.getFirstName() +  " " +employee.getLastName() + " Associate Employee ID:" + employee.getEmployeeId() + " @ " + dateFormat.format(date));
    }