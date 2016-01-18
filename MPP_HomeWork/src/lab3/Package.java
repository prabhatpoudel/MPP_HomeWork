package lab3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Package {
	private String packageName;
	private double weight;
	private String zone;
	
	ArrayList<Carrier> carrier= new ArrayList<Carrier>();

	


//	ArrayList<UPS> ups = new ArrayList();
	

	public String getRates() throws IOException {
		System.out.println("Please Enter the Package: ");
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		packageName = br.readLine();

		System.out.println("Please Enter the Weight in pound: ");
		weight = (Double.valueOf(br.readLine()));

		System.out.println("Please enter the Zone: E.g IA for IOWA: ");
		zone = br.readLine();
		
		carrier.add(new UPS(packageName, weight, zone));
		carrier.add(new USMail(packageName, weight, zone));
		carrier.add(new FedEx(packageName, weight, zone));
		
		return getMinimumRate();
	}

	public String getMinimumRate() {
		Carrier minimum = carrier.get(0);
	//	System.out.println(minimum.getClass().getSimpleName()+"1");
		for(Carrier c:carrier)
		{ 
//			System.out.println(minimum.getClass().getSimpleName()+" 2  "+minimum.calculateRates());
			if(c.calculateRates()<minimum.calculateRates())
			{
//				System.out.println("**********"+c.calculateRates()+"   "+minimum.calculateRates()+"      "+minimum.getClass().getSimpleName());
				minimum=c;
			}
		}
		

	return String.format("%s %10.2f %10s ",minimum.getPackagename(),minimum.calculateRates(), minimum.getClass().getSimpleName());

	}

	
	

}
