package lab3_1;

import java.util.ArrayList;

public class Department {
	private String name;
	private String location;
	private Company company;
	private ArrayList<Position> pos;
	
	public Department(String name, String location)
	{
		this.name=name;
		this.location=location;
		pos=new ArrayList();
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	public void setcomp(Company c)
	{
		this.company=c;
	}
	
	public void addPosition(Position p)
	{
		p.setdept(this);
		pos.add(p);
	}
	{
		
	}
	
	public void print()
	{
		System.out.println("  Department Name : "+getName());
		System.out.println("  Location: "+getLocation());
		for(Position p: pos)
		{
			p.print();
		}
		System.out.println("\n");
	}

}
