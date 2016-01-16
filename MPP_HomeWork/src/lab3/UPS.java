package lab3;

import java.text.DecimalFormat;

public class UPS implements Carier {

	private double weight;
	private String itemName;
	private String destination;
	
	DecimalFormat df = new DecimalFormat(".00");
//	df.setRoundingMode(RoundingMode.CEILING);
	
	
	public UPS(String name, double weight, String destination)
	{
		this.itemName=name;
		this.destination=destination;
		this.weight=weight;
	}
	@Override
	public double calculateRates() {
		// TODO Auto-generated method stub
		
		double rate= Double.valueOf(df.format(0.45*weight));		
		return rate;
	}
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

}
