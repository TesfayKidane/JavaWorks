/*
 * Use the Java 8 forEach method within the main method to print out the list
 * so that all Strings are in upper case. To do this, you will need to define your own implementation of
 * the Consumer interface.
 */
package mum.mpp.lab08.problem05.b;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author 984880
 */
public class Problem04B {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("Tesfay", "Anh", "Ihab", "Hoang", "Pradeep",
                "Someone");

        list.stream().map(s -> s.toUpperCase()).forEach(System.out::println);
    }
}
