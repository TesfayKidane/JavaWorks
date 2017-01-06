package mum.mpp.fetena.fpp.problem02;

public final class Staff implements EmployeeData{
	private final String name;
	private final double salary;
	private final int numDependants;
	public Staff(String name, double salary, int numDependants) {
		this.name = name;
		this.salary = salary;
		this.numDependants = numDependants;
	}
	
	public String getName() {
		return name;
	}
        @Override
	public double getSalary() {
		return salary;
	}
	public int getNumDependants() {
		return numDependants;
	}
}
