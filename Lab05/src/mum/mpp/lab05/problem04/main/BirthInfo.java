package mum.mpp.lab05.problem04.main;

import java.util.Calendar;

public final class BirthInfo {
	Calendar birthDate;
	Person person;

	BirthInfo(Calendar birthDate) {
		this.birthDate = birthDate;
	}

	public Calendar getBirthDate() {
		return birthDate;
	}

	public Person getPerson() {
		return person;
	}

	void setPerson(Person person) {
		this.person = person;
	}
}
