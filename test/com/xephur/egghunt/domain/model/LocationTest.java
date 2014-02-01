package com.xephur.egghunt.domain.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LocationTest {
	
	Location location;
	
	@Before
	public void setUp() {
		location = new Location(20L);
	}
	
	@Test
	public void testGetCoordinate() {
		assertTrue(location.getCoordinate() == 20L);
	}

}
