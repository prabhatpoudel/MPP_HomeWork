package regularExpression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lab_2_3_Pattern_Patcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please Enter the License: ");
		Scanner io = new Scanner(System.in);
		String input = io.nextLine();

		lab_2(input);

		System.out.println("Please Enter the Number: ");

		 input = io.nextLine();

		 lab_3(input);

	}

	public static void lab_2(String license) {
		Pattern pattern = Pattern.compile("[A-Z]{2} - [0-9]{4} - [A-Z]{3}");
		Matcher matcher = pattern.matcher(license);
		
		if(matcher.matches())
		{

			System.out.println("Given License Plate: "+ license +" is Valid");
		}
		else 
			System.out.println("Given License Plate: "+ license +" is InValid");
		
	}

	public static void lab_3(String number) {
		Pattern pattern = Pattern.compile("[8]");
		Matcher matcher = pattern.matcher(number);
//		String op="";
		System.out.println(matcher.replaceAll("Eight"));
//		while(matcher.find())
//		{
//			op=matcher.replaceAll("Eight");
//		}
//		System.out.println(op);
	}

}
