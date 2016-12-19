/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mum.mpp.lab09.problem07.a;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author Tesfay
 */
public class Main {

	public static void main(String[] args) {
		List<Employee> list = Arrays.asList(new Employee("Joe", "Davis", 120000),
				          new Employee("John", "Sims", 110000),
				          new Employee("Joe", "Stevens", 200000),
		                  new Employee("Andrew", "Reardon", 80000),
		                  new Employee("Joe", "Cummings", 760000),
		                  new Employee("Steven", "Walters", 135000),
		                  new Employee("Thomas", "Blake", 111000),
		                  new Employee("Alice", "Richards", 101000),
		                  new Employee("Donald", "Trump", 100000));
		List<String> employees = list.stream()
                        .filter(l->l.getSalary() > 100000)
                        .filter(n -> charInRange(n.getLastName().charAt(0)))
                        .map(l -> l.getFirstName() + ", "  + l.getLastName())
                        .sorted()
                        .collect(Collectors.toList());
                employees.forEach(System.out::println);
    }
        
    static List<String> a = Arrays.asList("N","O","P","Q","R","S","T","U","V","W","X","Y","Z");
    private static boolean charInRange(char charAt) {
       return a.contains(charAt+"");
    }
}