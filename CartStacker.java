package assignment3;

public class CartStacker extends StoreEmployee {

	public CartStacker(String firstName, String lastName, String employeeId) {
		super(firstName, lastName, employeeId);
		// TODO Auto-generated constructor stub
	}
	public double getSalary() {
		return super.getSalary()*1.05; // 5% more salary
	}
	public int getHours() {
		return super.getHours() + 5; // 5 more hours
	}
	public String getVacationForm() {
		return super.getVacationForm() + super.getVacationForm() + super.getVacationForm(); // returns three vacation forms
	}
	public String getTheCartsInOrder() {
		String b = "Move-in! Move-in!";
		return b;
	}
}