package lab3_3;

import java.util.Date;

public class MainClass {
	

	public static void main(String args[])
	{
		Company google = new Company("Google");
		
		Department gmail = new Department("Gmail", "Norway");
		Department youtube = new Department("Youtube", "NewYork");
		
		Position developer= new Position("GmailDeveloper","Develop the Code for Gmail");
		Position jdeveloper= new Position("GmailJuniorDeveloper","JuniorDevelop the Code for Gmail");
		Position videoDev= new Position("VideoDeveloper","Develop the Video for Youtube");
		Position jvideoDev= new Position("JuniorVideoDeveloper","JuniorDevelop the Video for Youtube");
		
		Employee prabhat= new Employee("001A","Prabhat", "", "Poudel", "1988/07/25", "123-123-123", 1000.10);
		Employee Gunjan= new Employee("001B","Gunjan", "", "Shakya", "1986/07/25", "123-123-124", 2000.10);
		
		google.addDept(gmail);
		google.addDept(youtube);
		
		gmail.addPosition(developer);
		youtube.addPosition(videoDev);
		
		developer.addEmp(prabhat);
		videoDev.addEmp(Gunjan);
		
		developer.addPosition(jdeveloper);
		videoDev.addPosition(jvideoDev);
		
//		google.getSalary();
//		gmail.getSalary();
//		developer.getSalary();
		google.printReportingHierarchy();
	}

}
