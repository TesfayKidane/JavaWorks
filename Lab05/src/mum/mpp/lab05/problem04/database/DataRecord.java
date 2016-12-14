package mum.mpp.lab05.problem04.database;

import java.util.Calendar;

public class DataRecord {
	int id;
	String name;
	Calendar dataOfBirth;

	public DataRecord(int id, String name, Calendar dataOfBirth) {
		this.id = id;
		this.name = name;
		this.dataOfBirth = dataOfBirth;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Calendar getDataOfBirth() {
		return dataOfBirth;
	}

}
