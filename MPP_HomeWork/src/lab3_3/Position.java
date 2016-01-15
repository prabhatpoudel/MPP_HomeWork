package lab3_3;

import java.util.ArrayList;

public class Position {
	private String title;
	private String description;
	private Department dept;
	
	private Position Superior;
	private ArrayList<Position> inferior;
	
	private ArrayList<Employee> emp;
	
	public Position(String title, String desc)
	{
		this.title=title;
		this.description=desc;
		emp=new ArrayList();
		inferior= new ArrayList<Position>(25);
		
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
	
	public Position getSuperior()
	{
		return this.Superior;
	}
	
	public void setSuperior(Position Superior)
	{
		this.Superior=Superior;
		Superior.addPosition(this);
	}
	
/*	public void addInferior(Position inferior1)
	{
		inferior.add(inferior1);
		inferior1.setSuperior(this);
	}*/
	
	public void addPosition(Position p1)
	{
		inferior.add(p1);
//		p1.setSuperior(this);
	}
	
	public void addEmp(Employee e)
	{
		e.setPosition(this);
		emp.add(e);
	}

	public void print() {
		System.out.println("   Position is : " + getTitle());
		System.out.println("   Description of Position : " + getDescription());
		//System.out.println(emp.size());
		for(Employee e: emp)
		{
			//System.out.println("***********");
			e.print();
		}
	}
	
	public double getSalary()
	{
		double sum=0;
		
		for(Employee e: emp)
		{
			sum+=e.getSalary();
		}
		System.out.println("Total Salary of Position: "+ getTitle()+" is "+sum);
		return sum;
	}
	
	public void printDownLine()
	{
		print();
	  	for(Position p: inferior)
	  	{
	  		//System.out.println("Position"+p.inferior.get(0));
	  		p.print();
	  	}
	}

}
