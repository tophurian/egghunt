package com.xephur.egghunt.domain.model;

public class MockLocationService implements LocationService {

	@Override
	public Location getCurrentLocation() {
		return new Location(1);
	}

}
