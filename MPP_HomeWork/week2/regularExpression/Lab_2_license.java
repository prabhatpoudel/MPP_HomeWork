package regularExpression;

import java.util.Scanner;

public class Lab_2_license {
	private static String license_plate= "[A-Z]{2} - [0-9]{4} - [A-Z]{3}";
	public static void main(String args[])
	{
		System.out.println("Enter the License Plate Number: ");
		Scanner input = new Scanner(System.in);
		String lp=input.nextLine();
		input.close();
//		 lp="PP - 1234 - XXX";
		validation(lp);
		
		
	}
	
	public static void validation(String lp)
	{
		if(lp.matches(license_plate))
		{
			System.out.println("Given License Plate: "+ lp +" is Valid");
		}
		else 
			System.out.println("Given License Plate: "+ lp +" is InValid");
	}
	
	

}
