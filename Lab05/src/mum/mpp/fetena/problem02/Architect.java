package mum.mpp.fetena.problem02;

import java.time.LocalDate;
import java.util.List;

public class Architect extends Employee implements HelperInterface {
	List<SeminarsConducted> seminars;
	public Architect(String name, double salary, LocalDate hireDate, List<SeminarsConducted> reasons) {
		super(name, salary, hireDate);
		this.seminars = reasons;	
	}
	
	@Override
	public double getSalary() {
		return getSalary() + computeBonus(this.getHireDate());
	}
	

	
}

