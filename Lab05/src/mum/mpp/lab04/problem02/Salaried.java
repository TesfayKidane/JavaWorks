package mum.mpp.lab04.problem02;

public class Salaried extends Employee {

	private double salary;

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Salaried(double salary, int id) {
		super(id);
		this.salary = salary;
	}

	@Override
	public double calcGrossPay() {
		// TODO Auto-generated method stub
		return this.salary;
	}
	
	
}
