package mum.mpp.lab05.problem04.database;

import java.util.GregorianCalendar;
import java.util.HashMap;

public class Database {
	public static HashMap<String, DataRecord> h = new HashMap<>();

	static {
		h.put("1", new DataRecord(1, "Pradeep", new GregorianCalendar(2013, 1, 1)));
		h.put("2", new DataRecord(2, "Tesfy", new GregorianCalendar(2012, 1, 2)));
		h.put("3", new DataRecord(3, "Anh", new GregorianCalendar(2011, 1, 3)));
		h.put("4", new DataRecord(4, "Hoang", new GregorianCalendar(2010, 1, 4)));
		h.put("5", new DataRecord(5, "Ihab", new GregorianCalendar(2009, 5, 1)));
	}
}
