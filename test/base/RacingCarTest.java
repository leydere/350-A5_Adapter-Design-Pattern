package base;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RacingCarTest {

	@Test
	void testGetTopSpeedRacingMode() {
		RacingCar tester = new RacingCar();
		assertEquals(100, tester.getTopSpeedRacingMode(), "Result must be 100");
	}

	@Test
	void testGetTopSpeedNormalMode() {
		RacingCar tester = new RacingCar();
		assertEquals(60, tester.getTopSpeedNormalMode(), "Result must be 60");
	}

	@Test
	void testGetMake() {
		RacingCar tester = new RacingCar();
		assertEquals("Toyota", tester.getMake(), "Result must be: 'Totoyta'");
	}

	@Test
	void testGetModel() {
		RacingCar tester = new RacingCar();
		assertEquals("Corolla", tester.getModel(), "Result must be: 'Corolla'");
	}

	@Test
	void testGetYear() {
		RacingCar tester = new RacingCar();
		assertEquals("1998", tester.getYear(), "Result must be: '1998'");
	}

	@Test
	void testGetCarFuelCapacity() {
		RacingCar tester = new RacingCar();
		assertEquals(30.3, tester.getCarFuelCapacity(), "Result must be 30.3");
	}

}
