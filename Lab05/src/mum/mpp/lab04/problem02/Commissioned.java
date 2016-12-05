package mum.mpp.lab04.problem02;

import java.util.List;
import java.util.Calendar;

public class Commissioned extends Employee{

	private double commission;
	private double baseSalary;
	private List<Order> orders;
	
	public Commissioned(double commission, double baseSalary, List<Order> orders, int id) {
		super(id);
		this.commission = commission;
		this.baseSalary = baseSalary;
		this.orders = orders;
	}

	public double getCommission() {
		return commission;
	}

	public void setCommission(double commission) {
		this.commission = commission;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	@Override
	public double calcGrossPay() {
		// TODO Auto-generated method stub
		
		int totalOrders = 0 ;
		
		for(Order order : orders)
		{
			if(order.getOrderDate().get(Calendar.YEAR)== Calendar.getInstance().get(Calendar.YEAR) &&
			   order.getOrderDate().get(Calendar.MONTH) == Calendar.getInstance().get(Calendar.MONTH))
			{
				totalOrders += order.getOrderAmount();
			}
		}		
		
		return this.baseSalary + this.commission*totalOrders;
	}	
	
}
