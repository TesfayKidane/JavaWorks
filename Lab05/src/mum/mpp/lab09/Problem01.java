/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mum.mpp.lab09;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 *
 * @author Tesfay
 */
public class Problem01 {
    
    public static void main(String[] args)
    { 
        // A)
        IntStream ones = IntStream.of(1);
        ones.forEach(System.out::println);
    
        // B)
        System.out.println(Arrays.asList("Bill", "Thomas", "Mary").stream().collect(Collectors.joining(", ")));
        
        // C)
        Stream<Integer> myIntSream = Stream.of(1,2,3,4,5,6,7);
        
        System.out.println(myIntSream.min(Integer::compare).get());
        System.out.println(myIntSream.max(Integer::compare).get());
    }
}