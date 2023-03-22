package it.polito.oop.milliways;

import java.util.List;

public class Hall {

	private Integer ID;

	public Hall(Integer id) {
		this.ID = id;
	}

	public int getId() {
		return this.ID;
	}

	public void addFacility(String facility) throws MilliwaysException {
	}

	public List<String> getFacilities() {
        return null;
	}
	
	int getNumFacilities(){
        return -1;
	}

	public boolean isSuitable(Party party) {
		return false;
	}

}
