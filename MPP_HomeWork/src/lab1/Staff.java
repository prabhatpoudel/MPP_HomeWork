package lab1;

public class Staff extends Person {
	private double Salary;
//new Staff("Frank Gore","472-3321",33,4050);
	public Staff(String name, String phone, int age, double salary)
	{
		super(name,phone,age);
//		setName(name);
//		setPhone(phone);
//		setAge(age);
		setSalary(salary);
	}
	public double getSalary() {
		return Salary;
	}

	public void setSalary(double salary) {
		Salary = salary;
	}

}
