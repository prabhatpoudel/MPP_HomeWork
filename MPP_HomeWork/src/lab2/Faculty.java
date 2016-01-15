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
	
	public ArrayList<Course> courses()
	{
		return cour;
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(Salary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((cour == null) ? 0 : cour.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Faculty other = (Faculty) obj;
		if (Double.doubleToLongBits(Salary) != Double.doubleToLongBits(other.Salary))
			return false;
		if (cour == null) {
			if (other.cour != null)
				return false;
		} else if (!cour.equals(other.cour))
			return false;
		return true;
	}
	


}
