package lab2;

import java.util.ArrayList;


public class Department {

	private String Name;
	ArrayList<Person> per = new ArrayList<Person>();
	ArrayList<Student> stud = new ArrayList<Student>();
	
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
			
			else if(p instanceof StaffStudent)
			{
				sum+= ((StaffStudent) p).getSalary();
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
			else if(p instanceof StaffStudent)
			{
				System.out.println("Name : "+((StaffStudent) p).getName());
				System.out.println("Phone : "+((StaffStudent) p).getPhone());
				System.out.println("Age : "+((StaffStudent) p).getAge());
				System.out.println("Course Start Date : "+((StaffStudent) p).getStartDate());
				System.out.println("Type : StaffStudent");
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
	
	public void showAllStudent(Object name)
	{
		for(Object p: per)
		{
			if(p instanceof Faculty)
			{
			  if(((Faculty) p).getName().equals(name))
			  {
				  
			  }
			}
	}
	}
	
	public Faculty faculty(String name) {
		for (Person p : per) {
			if (p instanceof Faculty & p.getName().equals(name)) {
				return (Faculty) p;
			}
		}
		return null;
	}
	
	public ArrayList<Student> listStudent()
	{
		for(Person p: per)
		{
			if(p instanceof Student)
			{
				stud.add((Student)p);
			}
		}
		return stud;
	}
	
	public void displayStudent(String name)
	{
		Faculty fac= faculty(name);
		
		ArrayList<Student> stu1 = listStudent();
		ArrayList<Student> facultyStudents = (ArrayList<Student>) stu1.clone();
		if(fac!=null)
		{
			for  (Course c: fac.courses()){
				
				for(Student s : stu1){
					if(s.hasFaculty(fac)){
						//System.out.println(s.getName());
						facultyStudents.remove(s);
					}
				}
			}
			
			for (Student fs : facultyStudents){
				System.out.println(fs.getName());
			}
		}
	}


}
