package mum.mpp.lab05.problem04.main;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.List;
import mum.mpp.lab05.problem04.database.DataRecord;
import mum.mpp.lab05.problem04.database.Database;

public class Main {

	public static void main(String[] args) {
		Collection<DataRecord> data = Database.h.values();
		List<BirthInfo> birthInfoCollection = new ArrayList<>();
		List<Person> persons = new ArrayList<>();
		
		for(DataRecord d : data){
			PersonAndBirthInfo personAndBirthInfo = PersonAndBirthDateFactory.createStudentAndBirthInfo(d.getName(), d.getDataOfBirth());
			persons.add(personAndBirthInfo.getPerson());
			birthInfoCollection.add(personAndBirthInfo.getBirthInfo());
		}
		
		for(Person person: persons){
			System.out.println(person.getName());
		}
		
		for(BirthInfo birthInfo : birthInfoCollection){
			System.out.println(birthInfo.getBirthDate().get(Calendar.YEAR)+ 
					" "+birthInfo.getBirthDate().get(Calendar.MONTH) + 
					" " + birthInfo.getBirthDate().get(Calendar.DAY_OF_MONTH));
		}
	}

}
