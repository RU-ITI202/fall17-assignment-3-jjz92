package assignment3;

public class Janitor extends StoreEmployee {

	public Janitor(String firstName, String lastName, String employeeId) {
		super(firstName, lastName, employeeId);
		// TODO Auto-generated constructor stub
	}
	public  int getHours(){
		return super.getHours()*2; // works twice as many hours
	}
	public double getSalary() {
		return super.getStartingSalary() - 10000 + getTotalBonus(); // makes $10000 less than other employees
	}
	public int getVacationDays() {
		return super.getVacationDays()/2; // get half the vacation days
	}
	public String clean() {
		String a = "Working for the General Store.";
		return a;
	}
}