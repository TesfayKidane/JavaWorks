/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mum.mpp.java8interface;

/**
 *
 * @author Tesfay
 */
public class F implements A, B {
    
    @Override public void foo(){
        System.out.println("Called F.foo()");
    }
}
