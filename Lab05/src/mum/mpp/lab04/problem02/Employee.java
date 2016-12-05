package mum.mpp.lab04.problem02;

import java.util.Calendar;

public abstract class Employee {
	private int empId; 	
	
	public Employee(int empId) {
		this.empId = empId;
	}    
	
	public void print()
	{
		System.out.println("Employee id : " + this.empId);
	}
	
	public Paycheck calcCompensation(Calendar monthOfYear)
	{
		double grossPay = calcGrossPay();
		double fica = 0.23*grossPay;
		double stateTax = 0.05*grossPay;
		double localTax = 0.01*grossPay;
		double medicare = 0.05*grossPay;
		double socialSecurity = 0.075*grossPay;
		
		return new Paycheck(grossPay, fica, stateTax, localTax, medicare, socialSecurity);
	}
	
	public abstract double calcGrossPay ();
}
