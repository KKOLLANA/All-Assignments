package com.cg.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CircleJunitTest {
	Circle c1 = new Circle(2.0, "blue");

	@Test
	public void testGetRadius() {
		assertEquals(c1.getRadius(),2.0);
	}
		
		@Test
		public void testGetColor() {
			assertTrue(c1.getColor().equals("blue"));
		
		
			}

}
