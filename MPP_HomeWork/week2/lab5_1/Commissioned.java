package lab5_1;

import java.util.ArrayList;

public class Commissioned extends Employee {
	private double commission;
	private double baseSalary;
	private ArrayList<Order> orders = new ArrayList();

	public Commissioned(int empid, double commission, double salary) {
		super(empid);
		this.baseSalary = salary;
		this.commission = commission;
		
	}

	@Override
	public double calcGrossPay(DateRange range) {
		// TODO Auto-generated method stub
		// System.out.println(range);
		return baseSalary + getCommission(range);
	}

	public void addOrders(Order o) {
		orders.add(o);
	}

	public double getCommission(DateRange range) {
		double sum = 0;
		for (Order o : orders) {
			// System.out.println(range);
			// System.out.println(o.getOrderDate().getTime());
			// System.out.println("I am here"+range.isRange(o.getOrderDate()));
			if (range.isRange(o.getOrderDate())) {
				sum += o.getOrderAmount();
			}
		}
		return 0.07 * sum;
	}

	public void setCommission(double commission) {
		this.commission = commission;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

}
