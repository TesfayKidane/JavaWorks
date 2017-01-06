/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mum.mpp.fetena.fpp.problem01;

import java.util.Comparator;

/**
 *
 * @author Tesfay
 */
public class CompareEmployee implements Comparator<Employee>{

    @Override
    public int compare(Employee o1, Employee o2) {
        int result = o1.getSsn().compareTo(o2.getSsn());
        return result; 
    }
}
