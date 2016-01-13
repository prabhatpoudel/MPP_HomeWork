package lab3_1;

import java.util.ArrayList;

public class Position {
	private String title;
	private String description;
	private Department dept;
	
	private ArrayList<Employee> emp;
	
	public Position(String title, String desc)
	{
		this.title=title;
		this.description=desc;
		emp=new ArrayList();
		
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public void setdept(Department d)
	{
		this.dept=d;
	}
	
	public void addEmp(Employee e)
	{
		e.setPosition(this);
		emp.add(e);
	}

	public void print() {
		System.out.println("   Position is : " + getTitle());
		System.out.println("   Description of Position : " + getDescription());
		for(Employee e: emp)
		{
			e.print();
		}
	}

}
