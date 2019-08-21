package com.kingpra;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DrivingSimApplicationTests {

	Car c = new Car();

	@Test
	void contextLoads() {
	}

	@Test
	void isCarOnOrOff() {
		assertFalse(c.isEngineOn());
		c.startCar();
		assertTrue(c.isEngineOn());
		c.turnOffCar();
		assertFalse(c.isEngineOn());
	}

	@Test
	void shiftingGears() {
		c.setCurrentGear(1);
		assertNotNull(c.getCurrentGear());
		assertEquals(1, c.getCurrentGear());
		c.shiftUp();
		assertEquals(2, c.getCurrentGear());
		c.shiftDown();
		assertEquals(1, c.getCurrentGear());
	}

	@Test
	void changingSpeeds() {
		c.setCurrentSpeed(0);
		assertNotNull(c.getCurrentSpeed());
	}

}
