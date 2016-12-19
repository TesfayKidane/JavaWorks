/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mum.mpp.lab09.problem09;

/**
 *
 * @author Tesfay
 */
@SuppressWarnings("unused")
public class BookCopy {
	private Book book;
	private int copyNum;
	private boolean isAvailable;
	public BookCopy(Book book, int copyNum, boolean isAvailable) {
		this.book = book;
		this.copyNum = copyNum;
		this.isAvailable = isAvailable;
	}
	public boolean isAvailable() {
		return isAvailable;
	}
	public void changeAvailability() {
		isAvailable = !isAvailable;
	}
}