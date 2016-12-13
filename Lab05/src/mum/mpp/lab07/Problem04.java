/*
 * Use the Java 8 forEach method within the main method to print out the list
 * so that all Strings are in upper case. To do this, you will need to define your own implementation of
 * the Consumer interface.
 */
package mum.mpp.lab07;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 *
 * @author 984880
 */
public class Problem04 {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("Tesfay", "Anh", "Ihab", "Hoang", "Pradeep",
                "Someone");
        
        Consumer<String> consumer = s -> System.out.println(s.toUpperCase());

        list.forEach(l -> consumer.accept(l));
    }
}
