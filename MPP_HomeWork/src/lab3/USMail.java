package lab3;

import java.text.DecimalFormat;

public class USMail extends Carrier  {
//	private double weight;
//	private String itemName;
//	private String destination;
	
	DecimalFormat df = new DecimalFormat(".00");
	
	public USMail(String name, double weight, String destination)
	{
		super(name,weight,destination);
//		this.itemName=name;
//		this.destination=destination;
//		this.weight=weight;
	}
	
	
	public double calculateRates() {
		double rate=1;
		// TODO Auto-generated method stub
		if(getWeight() > 3)
		{ 
			 rate= Double.valueOf(df.format(0.55*getWeight()));
		}		
		return rate;
	}

/*	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}*/

}
