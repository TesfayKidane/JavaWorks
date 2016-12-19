/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mum.mpp.lab09.problem09;

import java.util.List;

/**
 *
 * @author Tesfay
 */
public class Main {
    
    public static void main(String[] args){
        Book book = new Book("test",3);
        List<BookCopy> copies = book.getCopies();
        copies.forEach(copy -> copy.changeAvailability());
        
        //test
        System.out.println(book.isAvailable());
    }
            
}
