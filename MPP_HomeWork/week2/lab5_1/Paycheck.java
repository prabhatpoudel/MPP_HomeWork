package lab5_1;

public class Paycheck {
	private double grossPay;
	private double fica;
	private double state;
	private double local;
	private double medicare;
	private double socialSecurity;
	private DateRange payPeriod;
	private Employee emp;

	public Paycheck(double grossPay, double fica, double state, double local, double medicare, double ssn,
			DateRange period, Employee emp) {
		this.grossPay = grossPay;
		this.fica = fica;
		this.state = state;
		this.local = local;
		this.medicare = medicare;
		this.socialSecurity = ssn;
		this.payPeriod = period;
		this.emp = emp;

	}

	public double getNetPay() {
		return grossPay - fica - state - local - medicare - socialSecurity;
	}

	public void print() {
 
		System.out.println( "PayCheck: GrossPay: " + grossPay + " FICA: " + fica + " State Tax: " + state + " Local Tax: " + local
				+ " Medicare: " + medicare + " Social Security: " + socialSecurity + " Date Range: " + payPeriod);
	}

/*	@Override
	public String toString() {
		return "Paycheck [grossPay=" + grossPay + ", fica=" + fica + ", state=" + state + ", local=" + local
				+ ", medicare=" + medicare + ", socialSecurity=" + socialSecurity + ", payPeriod=" + payPeriod
				+ ", emp=" + emp + "]";
	}*/

	public double getGrossPay() {
		return grossPay;
	}

	public double getFica() {
		return fica;
	}

	public double getState() {
		return state;
	}

	public double getLocal() {
		return local;
	}

	public double getMedicare() {
		return medicare;
	}

	public double getSocialSecurity() {
		return socialSecurity;
	}

	public DateRange getPayPeriod() {
		return payPeriod;
	}

}
