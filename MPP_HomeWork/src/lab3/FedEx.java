package lab3;

import java.text.DecimalFormat;

public class FedEx implements Carier {
	private double weight;
	public double getWeight() {
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
	}

	private String itemName;
	private String destination;
	DecimalFormat df = new DecimalFormat(".00");
	
	public FedEx(String name, double weight, String destination)
	{
		this.itemName=name;
		this.destination=destination;
		this.weight=weight;
	}
	
	@Override
	public double calculateRates() {
		// TODO Auto-generated method stub
		double rate=1;
		if(destination == "IA" || destination == "MT" || destination == "OR" || destination == "CA" )
		{
			rate= Double.valueOf(df.format(weight*0.35));
//			rate=weight*0.35;
		}
		else if(destination =="TX" || destination =="UT")
		{
			rate= Double.valueOf(df.format(weight*0.30));
//			rate=weight*0.30;
		}
		else if(destination =="FL" || destination=="MA" ||destination == "OH")
		{
			rate= Double.valueOf(df.format(weight*0.55));
//			rate=0.55*weight;
		}
		else 
		{
			rate= Double.valueOf(df.format(weight*0.43));
			//rate =0.43*weight;
		}
		return rate;
	}

}
