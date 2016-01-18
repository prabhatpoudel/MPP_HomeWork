package lab3;

public abstract class Carrier {
	private String packagename;
	private double weight;
	private String zone;
	public Carrier(String name,double weight, String zone)
	{
		this.packagename=name;
		this.weight=weight;
		this.zone=zone;
	}
	public String getPackagename() {
		return packagename;
	}
	public void setPackagename(String packagename) {
		this.packagename = packagename;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String getZone() {
		return zone;
	}
	public void setZone(String zone) {
		this.zone = zone;
	}
	
	public String toString() {
		return String.format("%10s %6.2f %20s ",packagename,calculateRates(), this.getClass().getSimpleName());
	}
	
	public abstract double calculateRates();

}
