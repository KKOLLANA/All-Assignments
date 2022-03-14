package com.cg.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AccountTest {
	Account a1 = new Account("A101", "Tan Ah Teck", 88);

	@Test
public void testGetName() {
	assertTrue(a1.getName().equals("Tan Ah Teck"));
	}

}
