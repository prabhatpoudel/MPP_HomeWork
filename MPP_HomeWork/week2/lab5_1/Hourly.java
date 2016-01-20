package lab5_1;

public class Hourly extends Employee {
	private double hourlyWage;
	private double hoursPerWeek;

	public Hourly(int empid,double wage, double hours) {
		super(empid);
		this.hourlyWage = wage;
		this.hoursPerWeek = hours;
	}

	@Override
	public double calcGrossPay(DateRange range) {
		// TODO Auto-generated method stub
		return hourlyWage * hoursPerWeek*4;
	}

}
