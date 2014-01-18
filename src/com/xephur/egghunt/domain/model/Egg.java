package com.xephur.egghunt.domain.model;

public class Egg {
	private Location location = null;
	
	public Egg(Location location) {
		
		if (location == null) {
			throw new NullPointerException("location cannot be null");
		}
		
		this.location = location;
	}
	
	public Location getLocation() {
		return location;
	}

}
