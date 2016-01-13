package lab2;

import java.util.Date;

public class StaffStudent extends Staff{
	private Date startDate;
	
	public StaffStudent(String name, String phone, int age, double salary, double GPA, Date startDate)
	{
		super(name,phone,age,salary);
		Student stfStud = new Student(name,phone,age,GPA);
		this.startDate=startDate;		
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

}
