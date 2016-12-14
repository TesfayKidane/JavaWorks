package mum.mpp.lab05.problem02;

public interface FLyBehavior {

        default void fly()
        {
            System.out.println("\tfly with wings");
        }
}
