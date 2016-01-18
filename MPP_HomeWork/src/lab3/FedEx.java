package lab3;

import java.text.DecimalFormat;

public class FedEx extends Carrier {
	/*private double weight;
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

	public String getgetZone()() {
		return getZone();
	}

	public void setgetZone()(String getZone()) {
		this.getZone() = getZone();
	}

	private String itemName;
	private String getZone();*/
	DecimalFormat df = new DecimalFormat(".00");
	
	public FedEx(String name, double weight, String destination)
	{
		super(name,weight,destination);
		/*this.itemName=name;
		this.getZone()=getZone();
		this.weight=weight;*/
	}
	
	public double calculateRates() {
		// TODO Auto-generated method stub
		double rate=1;
		if(getZone() == "IA" || getZone() == "MT" || getZone() == "OR" || getZone() == "CA" )
		{
			rate= Double.valueOf(df.format(getWeight()*0.35));
//			rate=weight*0.35;
		}
		else if(getZone() =="TX" || getZone() =="UT")
		{
			rate= Double.valueOf(df.format(getWeight()*0.30));
//			rate=weight*0.30;
		}
		else if(getZone() =="FL" || getZone()=="MA" ||getZone() == "OH")
		{
			rate= Double.valueOf(df.format(getWeight()*0.55));
//			rate=0.55*weight;
		}
		else 
		{
			rate= Double.valueOf(df.format(getWeight()*0.43));
			//rate =0.43*weight;
		}
		return rate;
	}

}
