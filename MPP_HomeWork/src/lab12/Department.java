package lab12;

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
		double sum =0;
		for(Object p: per)
		{
			if(p instanceof Faculty)
			{
				sum+= ((Faculty) p).getSalary();
			}
			else if(p instanceof Staff)
			{
				sum+= ((Staff) p).getSalary();
			}
		}
		return sum;
		
	}
	
	public void showAllMembers()
	{
		for(Object p: per)
		{
			if(p instanceof Faculty)
			{
				System.out.println("Name : "+((Faculty) p).getName());
				System.out.println("Phone : "+((Faculty) p).getPhone());
				System.out.println("Age : "+((Faculty) p).getAge());
				System.out.println("Type : Faculty");
			}
			
			else if(p instanceof Staff)
			{
				System.out.println("Name : "+((Staff) p).getName());
				System.out.println("Phone : "+((Staff) p).getPhone());
				System.out.println("Age : "+((Staff) p).getAge());
				System.out.println("Type : Staff");
			}
			
		}
	}
	
	public void unitsPerFaculty()
	{
		for(Object p: per)
		{
			if(p instanceof Faculty)
			{
				System.out.println("Name : "+((Faculty) p).getName());
				System.out.println("Phone : "+((Faculty) p).getPhone());
				System.out.println("Age : "+((Faculty) p).getAge());
				System.out.println("Units :"+ ((Faculty) p).getTotalUnits());
			}
		}
	}
	
	public void addPerson(Person p)
	{
		per.add(p);
	}
	


}
