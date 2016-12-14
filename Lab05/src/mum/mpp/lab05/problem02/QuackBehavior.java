package mum.mpp.lab05.problem02;

public interface QuackBehavior {
    default void quack(){
       System.out.println("\tquacking");
    }
}
