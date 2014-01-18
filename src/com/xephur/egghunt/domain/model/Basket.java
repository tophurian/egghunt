package com.xephur.egghunt.domain.model;

public class Basket {
	
	private int numberOfEggs = 0;
	private Location location = null;
	
	private Basket(int numberOfEggs, Location location) {
		this.numberOfEggs = numberOfEggs;
		this.location = location;
	}
		
	public static Basket withEggsAtLocation(int numberOfEggs, Location location) {
		return new Basket(numberOfEggs, location);
	}
	
	public int getNumberOfEggs() {
		return numberOfEggs;
	}
	
	public void moveTo(Location location) {
		this.location = location;
	}
	
	public Location getLocation() {
		return location;
	}
	
	public Egg dropEgg() {
		if (numberOfEggs == 0) {
			throw new IllegalStateException("basket does not have eggs to drop");
		}
		numberOfEggs--;
		return new Egg(location);
	}
	
	public boolean hasEggs() {
		return numberOfEggs > 0;
	}
}
