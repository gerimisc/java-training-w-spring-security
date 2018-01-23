package com.vulnerable.web.spring.xss;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StoredService {
	private static List<Stored> people = new ArrayList<Stored>();
	private static int counter = 3;

	static {
		people.add(new Stored(1, "Joseph", "Airport Parking Expert "));
		people.add(new Stored(2, "Myo", "Pentester"));
	}
	
	public List<Stored> retrievePeople() {		
		return people;
	}

	public void addPerson(String name, String desc) {
		people.add(new Stored(counter++, name, desc));
	}
	
	public void deletePerson(int id) {
		Iterator<Stored> iterator = people.iterator();
		while (iterator.hasNext()) {
			Stored people = iterator.next();
			if (people.getId() == id) {
				iterator.remove();
			}
		}
	}
}
