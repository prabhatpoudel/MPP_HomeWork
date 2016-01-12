package lab12;

import java.util.ArrayList;

public class Student extends Person {
	private double GPA;
	ArrayList<Course> cour = new ArrayList<Course>();
	//Student("John Doe","472-1121",22,4.0);
	
	public Student (String name, String phone, int age, double grade)
	{
		super(name,phone,age);
//		setName(name);
//		setPhone(phone);
//		setAge(age);
		setGPA(grade);
	}
	public double getGPA() {
		return GPA;
	}

	public void setGPA(double gPA) {
		GPA = gPA;
	}

	public int getTotalUnits() {
		return 0;
	}
	public void addCourse(Course c)
	{
		cour.add(c);
	}

}
