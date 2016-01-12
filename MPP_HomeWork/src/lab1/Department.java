package lab1;

import java.util.ArrayList;


public class Department {

	private String Name;
	ArrayList<Person> per = new ArrayList<Person>();
	
	public Department(String Name)
	{
		setName(Name);
	}
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}	
	public double getTotalSalary()
	{
		return 0.0;
	}
	
	public void showAllMembers()
	{
		
	}
	
	public int unitsPerFaculty()
	{
		return 0;
	}
	
	public void addPerson(Person p)
	{
		per.add(p);
	}
	


}
