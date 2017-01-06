package mum.mpp.fetena.fpp.problem02;
import java.util.*;
public class Statistics {
	/** 
	 * Polymorphically computes and returns the sum
	 * of all the salaries of all the staff/teachers in the list.
         * @param aList
         * @return 
	 */
	public static double computeSumOfSalaries(List<EmployeeData> aList) {
                double sum = 0.0 ;
                
                for(EmployeeData e : aList)
                {
                    sum = sum + e.getSalary(); // polymorphism.
                }
		return sum;
	}
}
