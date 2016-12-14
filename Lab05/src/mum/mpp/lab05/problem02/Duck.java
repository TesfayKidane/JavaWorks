package mum.mpp.lab05.problem02;

public abstract class Duck {
	FLyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	protected void quack(){
		quackBehavior.quack();
	}
	
	protected void fly(){
		flyBehavior.fly();
	}
	
	protected void swim(){
		System.out.println("\tswimming");
	}
	
	protected abstract void display();
}
