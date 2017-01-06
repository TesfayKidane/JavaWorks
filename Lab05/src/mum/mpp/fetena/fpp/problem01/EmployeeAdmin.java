package mum.mpp.fetena.fpp.problem01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeAdmin {
	
	/**
		Returns a list of Employees whose social security number is on the input list socSecNums
		and whose salary is > 80000. The list must be ordered by social security number,
		from lowest to highest. To sort, you must use a Collections sorting method
		and you must define your own Comparator to be used to compare Employees by ssn. 
	*/
	public static List<Employee> prepareReport(HashMap<String, Employee> table, List<String> socSecNums) {
            List<Employee> list = new ArrayList<>();

            for(Map.Entry<String, Employee> row : table.entrySet())
            {
                String keySSN = row.getKey(); 
                Employee e = row.getValue();
                
                if(socSecNums.contains(keySSN) && e.getSalary() > 80000)
                {
                    list.add(e);
                }
            }
            
            CompareEmployee ce = new CompareEmployee();
            
            Collections.sort(list, ce);
            
            return list ;
	}
	
        
        // This is second way solving the problem
        public static List<Employee> prepareReport2(HashMap<String, Employee> table, List<String> socSecNums) {
            List<Employee> result = new ArrayList<>();
            
            for(String s : socSecNums){
                    Employee emp = table.get(s); 
                    if(emp!=null){
                            if(emp.getSalary()>80000){
                            result.add(emp);
                            }

                    }

            }
            Collections.sort(result, new CompareEmployee());
            return result;
        }
}
