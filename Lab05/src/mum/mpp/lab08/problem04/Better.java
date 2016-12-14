package lesson8.lecture.filter;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import mum.mpp.lab08.problem04.Folks;

//Even more functional approach -- count number of elements 
//using a pure expression -- no auxiliary function calls
//All assignments are atomic.
public class Better {
        final Function<Integer, Predicate<String>> wordWithLengthN = lengthN -> word -> word.length() == lengthN ;
        final Function<String, Predicate<String>> wordWithLetterC = letterC -> word -> word.contains(letterC);
        final Function<String, Predicate<String>> wordWithoutLetterD = letterD -> word -> !word.contains(letterD);

	final List<String> filtered = Folks.friends.stream()
			.filter(wordWithLengthN.apply(4))
                        .filter(wordWithLetterC.apply("N"))
                        .filter(wordWithoutLetterD.apply("B"))                         
			.map(friend -> friend.toUpperCase())
			.collect(Collectors.toList());

	public static void main(String[] args) {
		Better b = new Better();

		System.out.println("Filterd names : " + b.filtered);
	}
        
}
