package mum.mpp.lab08.problem04;

import static java.util.Collections.list;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class Advanced {
	final BiFunction<List<String>, String, Integer> wordsWithLetterC 
	    = (list, letterC) -> (int)list.stream()
	                            .filter(name -> name.startsWith(letterC))
	                            .count();    

        final BiFunction<List<String>, String, List<String>> wordsWithLetterD 
	    = (list, letterD) -> list.stream()
	                            .filter(name -> !name.contains(letterD))
	                            .collect(Collectors.toList());  
        
        final BiFunction<List<String>, Integer, List<String>> wordsWithLengthN
	    = (list, lengthN) -> list.stream()
	                            .filter(name -> name.length() == lengthN)
	                            .collect(Collectors.toList());  
        
	int count = wordsWithLetterC.apply(wordsWithLetterD.apply(wordsWithLengthN.apply(Folks.friends, 4), "B"), "N");

	public static void main(String[] args) {
		Advanced adv = new Advanced();

		System.out.println("Filtered result : "
				+ adv.count);
	}
}
