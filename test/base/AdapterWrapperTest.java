package base;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AdapterWrapperTest {

	@Test
	void testGetMaxSpeed() {
		AdapterWrapper tester = new AdapterWrapper();
		assertEquals(100, tester.getMaxSpeed(), "Result must be 100");
	}

	@Test
	void testGetfullCarname() {
		AdapterWrapper tester = new AdapterWrapper();
		assertEquals("This vehicle is a 1998 Toyota Corolla.", tester.getfullCarname(), "Result must be: 'This vehicle is a 1998 Toyota Corolla.'");
	}

	@Test
	void testGetCarFuelCap() {
		AdapterWrapper tester = new AdapterWrapper();
		assertEquals(30.3, tester.getCarFuelCap(), "Result must be 30.3");
	}

}
