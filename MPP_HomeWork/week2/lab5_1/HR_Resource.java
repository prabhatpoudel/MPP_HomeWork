package lab5_1;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class HR_Resource {

	public static void main(String[] args) throws ParseException {
		
		ArrayList<Employee> employees = new ArrayList();
//		ArrayList<Order> order = new ArrayList();
		Calendar cal = new GregorianCalendar(2016, 11, 3);
		employees.add(new Hourly(1,30,40));
		employees.add(new Salaried(2,4000));
		Commissioned c1 = new Commissioned(3,10.0,3000);
		
		Order o1 = new Order(1,(GregorianCalendar) cal,1000,c1);
		Order o2 = new Order(2,(GregorianCalendar) cal,1234,c1);
		Order o3 = new Order(3,(GregorianCalendar) cal,2345,c1);
		
		c1.addOrders(o1);
		c1.addOrders(o2);
		c1.addOrders(o3);
		employees.add(c1);
		

		
		Paycheck p1 ;
//		Employee h1 = new Hourly(1,30,40);
//		Employee s1 = new Salaried(2,4000);
//		Employee c1 = new Commissioned(3,10.0,3000);

//		Paycheck p1 = h1.CalcCompensation(11, 2016);
//		Paycheck p2 = s1.CalcCompensation(10, 2016);
////		Paycheck p3 = c1.CalcCompensation(9, 2016);
//		h1.print();
		
		
		for(Employee e: employees)
		{
			 p1 = e.CalcCompensation(11, 2016);
			e.print();
		}
	}

}
