package it.polito.oop.milliways;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Restaurant {

	private Map<String, Race> races = new HashMap<>();
	private Map<Integer, Hall> halls = new HashMap<>();
	private List<Party> partyes = new ArrayList<>();
	private List<Hall> order = new ArrayList<>();

	public Restaurant() {
	}
	
	public Race defineRace(String name) throws MilliwaysException{
		Race r = new Race(name);

		if(this.races.get(name) != null) {
			throw new MilliwaysException();
		}

		this.races.put(name, r);

		return r;
	}
	
	public Party createParty() {
		Party p = new Party();

		this.partyes.add(p);

		return p;
	}
	
	public Hall defineHall(int id) throws MilliwaysException{
		if(this.halls.containsKey(id)) {
			throw new MilliwaysException();
		}

		Hall h = new Hall(id);
		this.order.add(h);
		this.halls.put(id, h);

		return h;
	}

	public List<Hall> getHallList() {
		return null;
	}

	public Hall seat(Party party, Hall hall) throws MilliwaysException {
        return null;
	}

	public Hall seat(Party party) throws MilliwaysException {
        return null;
	}

	public Map<Race, Integer> statComposition() {
        return null;
	}

	public List<String> statFacility() {
        return null;
	}
	
	public Map<Integer,List<Integer>> statHalls() {
        return null;
	}

}
