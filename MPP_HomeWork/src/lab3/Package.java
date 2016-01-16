package lab3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Package {
	private String packageName;
	private double weight;
	private String zone;

	Carier c;
	UPS ups;
	USMail uMail;
	FedEx fedex;

//	ArrayList<UPS> ups = new ArrayList();
	

	public void getRates() throws IOException {
		System.out.println("Please Enter the Package: ");
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		packageName = br.readLine();

		System.out.println("Please Enter the Weight in pound: ");
		weight = (Double.valueOf(br.readLine()));

		System.out.println("Please enter the Zone: E.g IA for IOWA: ");
		zone = br.readLine();

		ups = new UPS(packageName, weight, zone);
		uMail = new USMail(packageName, weight, zone);
		fedex = new FedEx(packageName, weight, zone);
		
		getMinimumRate();
	}

	public String getMinimumRate() {
		if (ups.calculateRates() < uMail.calculateRates()) {
			if (ups.calculateRates() < fedex.calculateRates()) {
				return packageName + "     $" + ups.calculateRates() + "             UPS\n";
			}
			else
				return  packageName + "     $" + fedex.calculateRates() + "             FedEx\n";
		}
		if (uMail.calculateRates() < ups.calculateRates()) {
			if (uMail.calculateRates() < fedex.calculateRates()) {
				return packageName + "     $" + uMail.calculateRates() + "             US Mail\n";
			}

			else
				return packageName + "     $" + fedex.calculateRates() + "             FedEx\n";
		}
		else return null;

	}

}
