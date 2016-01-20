package lab5_1;

import java.text.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public abstract class Employee {
	private int empid;
	private ArrayList<Paycheck> paycheck = new ArrayList();

	public Employee(int empid) {
		this.empid = empid;
	}

	public abstract double calcGrossPay(DateRange daterange);

	public void print() {
		System.out.println("EmployeeId: " + empid);
		for (Paycheck p : paycheck) {
			// System.out.println(p);
			p.print();
		}
	}

	public Paycheck CalcCompensation(int month, int year) throws ParseException {

		Calendar cal = new GregorianCalendar(year, month, 1);

		DateRange range;// = new
						// DateRange(DateRange.getFirstDayOfMonth((GregorianCalendar)
						// cal),DateRange.getLastDayOfMonth((GregorianCalendar)
						// cal));
		//
		double totalPay = calcGrossPay(new DateRange(DateRange.getFirstDayOfMonth((GregorianCalendar) cal),
				DateRange.getLastDayOfMonth((GregorianCalendar) cal)));

		double fica = totalPay * 0.23;
		double state = totalPay * 0.05;
		double local = totalPay * 0.01;
		double medicare = totalPay * 0.03;
		double ssn = totalPay * 0.075;

		// System.out.println(totalPay);
		Paycheck pc1 = new Paycheck(totalPay, fica, state, local, medicare, ssn,
				new DateRange(DateRange.getFirstDayOfMonth((GregorianCalendar) cal),
						DateRange.getLastDayOfMonth((GregorianCalendar) cal)),
				this);
		paycheck.add(pc1);
		return pc1;
	}

}
