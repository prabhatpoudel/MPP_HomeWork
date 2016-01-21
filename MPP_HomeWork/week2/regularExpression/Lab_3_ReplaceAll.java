package regularExpression;

import java.util.Scanner;

public class Lab_3_ReplaceAll {
	public static void main (String args[])
	{
		System.out.println("Enter the Number: ");
		Scanner input = new Scanner(System.in);
		String number=input.nextLine();
		input.close();	
		replaceEight(number);
	}
	
	public static void replaceEight(String input)
	{
		System.out.println("Output"+input.replaceAll("[0-9&&[^012345679]]", "Eight"));
		System.out.println("Output"+input.replaceAll("[8]", "Eight"));
		System.out.println("Output"+input.replaceAll("\\b8\\b", "Eight"));
	}

}
