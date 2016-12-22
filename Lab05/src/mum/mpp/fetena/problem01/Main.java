package mum.mpp.fetena.problem01;

import java.time.LocalDate;
import java.time.Month;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        System.out.println("\n Part a.");
        String s = "Tesfay";
        String v = "Esayas";
        System.out.println(equaslLambda.test(s, v));
        System.out.println(equalsAnonymousClass.test(s, v));
        System.out.println(new StaticInnerClass().test(v, s));
        System.out.println("\n Part b.");
        List<Commissioned> commissioneds = TestData.getAllCommissionedEmployees(); 
        
        Comparator<? super Commissioned> comparator = (c1,c2) -> {
            if(c1.getBaseSalary() > c2.getBaseSalary())
                        return 1; 
            else if (c1.getBaseSalary() == c2.getBaseSalary()) {
                return c1.getEmpId().compareTo(c2.getEmpId());
            }
            else
                return -1;
        
        };       
        
        commissioneds.stream().filter(c -> c.getOrders().size() > 3).sorted(comparator).map(c -> c.getEmpId()).collect(Collectors.toList()).forEach(System.out::println);
        commissioneds.stream().filter(c -> c.getOrders().size() > 3).sorted(Comparator.comparing(Commissioned::getBaseSalary).thenComparing((c1,c2)->c1.getEmpId().compareTo(c2.getEmpId()))).map(c -> c.getEmpId()).collect(Collectors.toList()).forEach(System.out::println);
        commissioneds.stream().filter(c -> c.getOrders().size() > 3).sorted(Comparator.comparingDouble(Commissioned::getBaseSalary).reversed()).map(c -> c.getEmpId()).collect(Collectors.toList()).forEach(System.out::println);
        commissioneds.stream().filter(c -> c.getOrders().size() > 3).sorted((c1,c2)->Double.compare(c1.getBaseSalary(), c2.getBaseSalary())).map(c -> c.getEmpId()).collect(Collectors.toList()).forEach(System.out::println);
        
        System.out.println("\n Part c.");
        lambdaLibrary1.apply(commissioneds).forEach(System.out::println);
        System.out.println("\n Part d.");
        System.out.println(lambdaLibrary2.apply(TestData.getAllOrders()));

    }
      static BiPredicate<String, String> equaslLambda = (s1, s2) -> s1.equalsIgnoreCase(s2);
      
      static BiPredicate<String, String> equalsAnonymousClass = new BiPredicate<String, String>() {

            @Override
            public boolean test(String s1, String s2) {
                return s1.toLowerCase().equals(s2.toLowerCase());
            }
        };
      static class StaticInnerClass implements BiPredicate<String, String>{            
            @Override
            public boolean test(String s1, String s2)
            {
                 return s1.toLowerCase().equals(s2.toLowerCase());
            }
            
        }
      
      static Function<List<Commissioned>, List<String>> lambdaLibrary1 = 
              (list) -> list.stream()
              .filter(c -> c.getOrders().size() > 3)
              .sorted(Comparator
                      .comparingDouble(Commissioned::getBaseSalary)
                      .reversed())
              .map(c -> c.getEmpId())
              .collect(Collectors.toList());
      
      static Function<List<Order>, String> lambdaLibrary2 = 
              (list) -> list.stream()
                            .filter(o -> o.getOrderDate().isAfter(LocalDate.of(2016,Month.AUGUST,1)))
                            .map(o -> o.getOrderNo()).collect(Collectors.joining(", "));
}
