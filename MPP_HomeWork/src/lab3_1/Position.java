package lab3_1;

import java.util.ArrayList;

public class Position {
	private String title;
	private String description;
	private Department underDept;
	
	ArrayList<Employee> emp;
	
	public Position(String title, String desc, Department dept)
	{
		this.title=title;
		this.description=desc;
		this.underDept=dept;
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

	public void print() {
		System.out.println(" Name of Department is : " + getTitle());
	}

}
