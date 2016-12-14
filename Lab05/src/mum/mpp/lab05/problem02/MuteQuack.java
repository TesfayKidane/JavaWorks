package mum.mpp.lab05.problem02;

public class MuteQuack implements QuackBehavior{

	@Override
	public void quack() {
		System.out.println("\tcannot quack");
	}
	
}
