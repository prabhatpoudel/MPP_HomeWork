package lab3_1;

import java.util.Date;

public class Employee {
	private String employeeID;
	private String firstName;
	private String middleInitial;
	private String lastName;
	private Date birthDate;
	private int SSN;
	private double salary;
	
	public Employee(String id,String fname, String mname, String lname, Date dob, int ssn, double salary)
	{
		this.employeeID=id;
		this.firstName=fname;
		this.middleInitial=mname;
		this.lastName=lname;
		this.birthDate=dob;
		this.SSN=ssn;
		this.salary=salary;
	}

	public String getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleInitial() {
		return middleInitial;
	}

	public void setMiddleInitial(String middleInitial) {
		this.middleInitial = middleInitial;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public int getSSN() {
		return SSN;
	}

	public void setSSN(int sSN) {
		SSN = sSN;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void print()
	{
		System.out.println("******Employee Details********");
		System.out.println("ID: "+employeeID + "\nName: "+firstName+" "+middleInitial+" "+lastName);
		System.out.println("DOB: "+ birthDate);
		System.out.printf("SSN %d",SSN);
		System.out.println("Salary: "+salary);
	}

}
