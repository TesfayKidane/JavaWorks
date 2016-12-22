/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mum.mpp.fetena.problem02;

import java.time.LocalDate;

/**
 *
 * @author Tesfay
 */
interface HelperInterface {
    
   default double computeBonus(LocalDate hireDate) {
		int hireYear = hireDate.getYear();
		int thisYear = LocalDate.now().getYear();
		return 400 * (thisYear - hireYear);
	}
}
