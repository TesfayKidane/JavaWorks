package mum.mpp.lab05.problem04.main;

import java.util.Calendar;

final class PersonAndBirthDateFactory {
	private PersonAndBirthDateFactory() {
	}

	public static PersonAndBirthInfo createStudentAndBirthInfo(String name, Calendar dob) {
		Person person = new Person(name);
		BirthInfo birthInfo = new BirthInfo(dob);
		person.setBirthInfo(birthInfo);
		birthInfo.setPerson(person);
		return new PersonAndBirthInfoImpl(person, birthInfo);
	}
}
