/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mum.mpp.lab10;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Tesfay
 */
public class Quize03 {
    
    
    private static void printNumbers() {
        List<Integer> numbers = Arrays.asList(9, 2, 7, 1, 8);
        numbers.stream().sorted((n1, n2)
            ->{
            System.out.println("comparing " + n1 + " with " + n2);
            return Integer.compare(n1, n2);
        }).collect(Collectors.toList());
    }
    public static void main(String[] args){
        printNumbers();
    }
}
