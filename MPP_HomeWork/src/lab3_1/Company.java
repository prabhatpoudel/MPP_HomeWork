package lab3_1;

import java.util.ArrayList;

public class Company {
	private String name;
	ArrayList<Department> dept;
	
	public Company(String name, Department d)
	{
		this.name=name;
		dept=new ArrayList<Department>();
		addDept(d);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void addDept(Department d)
	{	
		dept.add(d);
	}

	public void print() {
		System.out.println(" Name of Comapny: " + getName());
	}
}
