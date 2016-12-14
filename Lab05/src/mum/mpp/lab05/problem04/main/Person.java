package mum.mpp.lab05.problem04.main;

public final class Person {

	public String name;
	BirthInfo birthInfo;

	Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public BirthInfo getBirthInfo() {
		return birthInfo;
	}

	void setBirthInfo(BirthInfo birthInfo) {
		this.birthInfo = birthInfo;
	}

}
