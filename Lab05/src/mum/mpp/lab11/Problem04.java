/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mum.mpp.lab11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author Tesfay
 */
public class Problem04 {
    public static double sum(Collection<? extends Number> nums){
        double s =0.0;
        for(Number num : nums) s+=num.doubleValue();
        return s;
    }
    
    public static void main(String[] args){
        List<Integer> ints = new ArrayList<>();
        ints.add(1);
        ints.add(2);
        List<? extends Number> nums = ints;
        double dbl = sum(nums);
        
        /*a) Compile error arrises on the next line: The error arises because an attempt was made to 
        insert a value in a parametrized type with extends wildcard parameter. With the extends 
        wildcard, values can be gotten but not inserted. The difficulty is that adding a value 
        to nums makes a commitment to a certain type (Double in this case), whereas nums is 
        defined to be a List that accepts subtypes of Number, but which subtype is not determined.
        The value 3.14 cannot be added because it might not be the right subtype of Number. */
        
         //nums.add(3.14);
         
         List<Object> objs = new ArrayList<Object>();
         objs.add(1);
         objs.add("two");
         List<? super Integer> ints2 = objs;
         ints2.add(2);
         
         /*b) Comile error arrises on the next line : When the super wildcard is used to define a Collection of 
         parametrized type, it is inconvenient to get elements from the Collection; elements can be 
         gotten, but not typed. If we try to assign a type to the return of the get method, we get a 
         compiler error – the compiler has no way of knowing which supertype of Integer is being gotten.*/
         
        // double db1 = sum(ints2);
         
    }
}
