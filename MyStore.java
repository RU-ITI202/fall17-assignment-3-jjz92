package assignment3;

public class MyStore {

	public static void main(String[] args) {
		System.out.println("Sales Associate:");
		SalesAssociate sa = new SalesAssociate("Lalit", "Akella", "00005");
		System.out.println("Salary: "+sa.getSalary());
		System.out.println("Hours: "+sa.getHours());
		System.out.println("Vacation Days: " +sa.getVacationDays());
		System.out.println("Vacation form: " +sa.getVacationForm());
		System.out.println(sa.getCashPosition());

		System.out.println("Janitor:");
		Janitor jan = new Janitor("Jorge", "Gonzales", "00007");
		System.out.println("Salary: "+jan.getSalary());
		System.out.println("Hours: "+jan.getHours());
		System.out.println("Vacation Days: " +jan.getVacationDays());
		System.out.println("Vacation form: " +jan.getVacationForm());
		jan.clean();

		System.out.println("Cart Stacker:");
		CartStacker cs = new CartStacker("Geaorge", "Christian", "00009");
		System.out.println("Salary: "+cs.getSalary());
		System.out.println("Hours: "+cs.getHours());
		System.out.println("Vacation Days: " +cs.getVacationDays());
		System.out.println("Vacation form: " +cs.getVacationForm());
		System.out.println(cs.getTheCartsInOrder());

	}

}
