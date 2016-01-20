package lab5_1;

public class Salaried extends Employee {
	private double salary;

	public Salaried(int empid,double salary) {
		super(empid);
		this.salary = salary;
	}

	@Override
	public double calcGrossPay(DateRange range) {
		// TODO Auto-generated method stub
		return salary;
	}

}
