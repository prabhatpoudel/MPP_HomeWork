package lab2;

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
	
	public boolean hasFaculty(Faculty f) {
		for (Course c : cour) {
			if (c.getFac().equals(f)) {
				return true;
			}

		}
		return false;
	}
	@Override
	public String toString() {
		return "Student [GPA=" + GPA + ", cour=" + cour + "]";
	}

}
