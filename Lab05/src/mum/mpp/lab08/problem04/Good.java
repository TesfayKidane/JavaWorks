package mum.mpp.lab08.problem04;
import java.util.List;

public class Good {
	public static void main(final String[] args) {
		Good good = new Good();
                System.out.println(String.format("Friends with names of : %1$d", good.countWords(Folks.friends, 'N', 'B', 4)));
	}
	
	        
        public int countWords(List<String> words, char c, char d, int len)
        {
            return (int)words.stream()
                    .filter(word -> word.length() == len && word.indexOf(c) >=0 && word.indexOf(d) == -1)                    
                    .count();   
        }
}
