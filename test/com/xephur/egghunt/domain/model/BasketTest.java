package com.xephur.egghunt.domain.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BasketTest {
	
	Basket basket;
	LocationService locationService;
	
	@Before
	public void setUp() {
		locationService = new MockLocationService();
		basket = Basket.withEggsAtLocation(20, locationService.getCurrentLocation());
	}
	
	@Test
	public void testCreateBasketWithEggs() {
		assertTrue(basket.getNumberOfEggs() == 20);
	}
	
	@Test
	public void testMoveBasketToLocation() {
		Location currentLocation = locationService.getCurrentLocation();
		basket.moveTo(currentLocation);
		assertTrue(basket.getLocation() == currentLocation);
	}
	
	@Test
	public void testDropEggFromBasket() {
		Egg egg = basket.dropEgg();
		assertNotNull(egg);
		assertTrue(basket.getNumberOfEggs() == 19);
	}
	
	
	@Test
	public void testDroppedEggHasLocation() {
		Egg egg = basket.dropEgg();
		long eggCoordinate = egg.getLocation().getCoordinate();
		long basketCoordinate = basket.getLocation().getCoordinate();
		assertTrue(eggCoordinate == basketCoordinate);
	}

	/*
	@Test
	public void testGetBasket() {
		basket = Basket.empty();
		assertTrue(basket.isEmpty());
		assertTrue(basket.getNumberOfEggs() == 0);
		basket.addEggs(20);
		assertTrue(basket.getNumberOfEggs() == 20);
	*/
}
