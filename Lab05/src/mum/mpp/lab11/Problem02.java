/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mum.mpp.lab11;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Tesfay
 */
public class Problem02<E> {
    
    public List<? super E> reverse(List<? super E> list){
        
        int length = list.size();
        int last = length - 1 ;
        
        for(int i = 0 ; i < length/2; i++){
            E temp = (E) list.get(last-i);
            list.set(last-i, (E)list.get(i));
            list.set(i, temp);
        }
        return list;
    }
    
    public static void main(String[] args){
        
        Problem02<Integer> p = new Problem02<>();
        
        List<? super Integer> ints = Arrays.asList(1,2,3,4.4);
        for(Object o : p.reverse(ints)){
            System.out.println(o+", ");
        }      
    }
}
