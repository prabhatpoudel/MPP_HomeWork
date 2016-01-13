package lab2;

import java.util.ArrayList;

public class Faculty extends Person {
	private double Salary;
    ArrayList<Course> cour ;
	//Faculty("Frank Moore","472-5921",43,10000)
	public Faculty(String name, String phone, int age, double salary)
	{
		super(name,phone,age);
//		setName(name);
//		setPhone(phone);
//		setAge(age);
		setSalary(salary);
		cour= new ArrayList<Course>();
	}
	public double getSalary() {
		return Salary;
	}

	public void setSalary(double salary) {
		Salary = salary;
	}

	public int getTotalUnits() {
		int sum=0;
		for(Object o: cour)
		{
			sum+=((Course) o).getUnits();
		}
		return sum;
	}
	
	public void addCourse(Course c)
	{
		cour.add(c);
	}
	
	

}
