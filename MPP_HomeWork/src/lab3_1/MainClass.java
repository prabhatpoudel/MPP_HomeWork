package lab3_1;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class MainClass {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("yyMMdd");

		Company Microsoft = new Company("Microsoft");
		Department Front = new Department("FrontEnd", "NewYork");
		Department Back = new Department("BackEnd", "Texax");

		Microsoft.addDept(Front);
		Microsoft.addDept(Back);

		Position backEndDev = new Position("BackEnd Developer", "BackEnd Developer for Microsoft");
		Position frontEndDev = new Position("FrontEnd Developer", "BackEnd Developer for Microsoft");

		Front.addPosition(frontEndDev);
		Back.addPosition(backEndDev);

		Employee prabhat = new Employee("0001A123", "Prabhat", "", "Poudel", format.parse("07251988"), "1234-56-789", 10000.0);
		Employee Madan = new Employee("0002A123", "Madan", "Krishna", "Siwakoti", format.parse("06251989"), "2222-22-222",
				15000);
		Employee Gunjan = new Employee("0003B123", "Gunjan", "", "Shkya", format.parse("06251986"), "2222-22-223", 16000);
		Employee Govinda = new Employee("0004B123", "Govinda", "", "Basnet", format.parse("06251990"), "1231-23-123", 17000);

		frontEndDev.addEmp(Madan);
		frontEndDev.addEmp(Govinda);

		backEndDev.addEmp(prabhat);
		backEndDev.addEmp(Gunjan);

		Microsoft.print();

	}

}
