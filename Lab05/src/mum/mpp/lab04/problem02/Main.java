package mum.mpp.lab04.problem02;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp1 = new Hourly(10.0, 40, 1);		
		Calendar payMonth = new GregorianCalendar(2016, 9, 5);
		Paycheck paycheck = emp1.calcCompensation(payMonth);
		emp1.print();
		paycheck.print();	
		
		
		Employee emp2 = new Salaried(2999, 2);
		Paycheck paycheck2 = emp2.calcCompensation(payMonth);
		emp2.print();
		paycheck2.print();
		
		List<Order> listOrder = new ArrayList<>();
		listOrder.add(new Order(1, new GregorianCalendar(2016, 11, 5), 1));
		listOrder.add(new Order(1, new GregorianCalendar(2016, 11, 5), 2));
		listOrder.add(new Order(1, new GregorianCalendar(2014, 11, 5), 3));
		listOrder.add(new Order(1, new GregorianCalendar(2016, 10, 5), 1));		
		
		Employee emp3 = new Commissioned(10, 1000,listOrder,3);
		emp3.print();
		Paycheck paycheck3 = emp3.calcCompensation(payMonth);
		paycheck3.print();		
		
	}

}
