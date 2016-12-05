package mum.mpp.lab04.problem02;

public class Paycheck {

	private final double grossPay;
	private final double fica;
	private final double state;
	private final double local;
	private final double medicare;
	private final double socialSecurity;
	
	
	
	public Paycheck(double grossPay, double fica, double state, double local, double medicare, double socialSecurity) {
		super();
		this.grossPay = grossPay;
		this.fica = fica;
		this.state = state;
		this.local = local;
		this.medicare = medicare;
		this.socialSecurity = socialSecurity;
	}
	
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
	
	public void print()
	{
		System.out.println("Gross Pay " + getGrossPay());
		System.out.println("Net Pay " + getNetPay());
	}
	
	public double getNetPay()
	{		
		return getGrossPay() - (getFica() + getLocal() + getMedicare() + getSocialSecurity() + getState());
	}
}
