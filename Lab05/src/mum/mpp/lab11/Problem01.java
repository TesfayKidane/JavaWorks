/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mum.mpp.lab11;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tesfay
 */
public class Problem01 {
    
    private static void a(){
        List<Integer> ints = new ArrayList<Integer>();
        ints.add(1);
        ints.add(2);
        ints.add(3);
        /* a) Incompatible types : List<Integer> cannot be converted to List<Numbers> */
        //List<Number> nums = ints; 
        //nums.add(3.34); 
        /* b) No suitable method found ofr add(double) */
        List<? extends Number> nums2 = ints; 
        // nums2.add(3.14); 
    }
}
