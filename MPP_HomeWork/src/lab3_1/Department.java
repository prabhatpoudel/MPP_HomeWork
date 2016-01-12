package lab3_1;

public class Department {
	private String name;
	private String location;
	private Company underComp;
	

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
	
	public void print()
	{
		System.out.println(" Name of Department is : "+getName());
	}

}
