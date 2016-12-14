package mum.mpp.lab05.problem04.main;

final class PersonAndBirthInfoImpl implements PersonAndBirthInfo {

	Person person;
	BirthInfo birthInfo;

	PersonAndBirthInfoImpl(Person person, BirthInfo birthInfo) {
		this.person = person;
		this.birthInfo = birthInfo;
	}

	@Override
	public Person getPerson() {
		return person;
	}

	@Override
	public BirthInfo getBirthInfo() {
		return birthInfo;
	}

}
