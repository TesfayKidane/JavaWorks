/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mum.mpp.lab08;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

/**
 *
 * @author Tesfay
 */
public class Problem03 {
    
    public static void main(String[] args){
        BiFunction<Double, Double, List<Double>> pow = (x,y) -> {
            List<Double> list = new ArrayList<>();
            list.add(Math.pow(x,y));
            list.add(x*y);
            return list;
        };
        
        System.out.println( pow.apply(2.0, 3.0));
    }
}
