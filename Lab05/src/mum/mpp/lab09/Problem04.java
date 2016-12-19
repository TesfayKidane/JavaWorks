/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mum.mpp.lab09;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 *
 * @author Tesfay
 */
public class Problem04 {
    
    public static void main(String[] args){
        printSquares(4);
    }
    
    public static void printSquares(int num)
    {
       List<Integer> squareStreams = IntStream.iterate(1,n->n+1).limit(num).boxed().collect(Collectors.toList());
       squareStreams.forEach(x -> System.out.println(x*x));       
    }
}