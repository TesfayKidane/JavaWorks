package mum.mpp.lab05.problem02;

public class DecoyDuck extends Duck{
	
	
	public DecoyDuck() {
		flyBehavior = new CannotFly();
		quackBehavior = new MuteQuack();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("\tdisplaying");
	}
}
