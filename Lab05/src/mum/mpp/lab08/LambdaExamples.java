/*
* Assign the lambda expressions to a variable of the appropriate type and then express as a
* method reference. Indicate which type of method reference you are using. Assume that the
* Employee and EmployeeNameComparator classes are available. To make it easier, do all this
* inside an Examples class in your workspace. Refer to
* http://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html
* as necessary.
* Example: (String x) -> x.toUpperCase()
* Function<String, String> toUpper1 = (String x) -> x.toUpperCase();
* Function<String, String> toUpper2 = String::toUpperCase;
* Method reference type: Class::instanceMethod
*
*/
package mum.mpp.lab08;

import java.util.function.Function;

/**
 *
 * @author Tesfay
 */
public class LambdaExamples {
    
    public class Employee{
        private String name; 

        public Employee(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
    
    public static void main(String[] args){
        
        Function<Employee,String> func =  (Employee e)->e.getName();
        System.out.println(func);
    }
}
