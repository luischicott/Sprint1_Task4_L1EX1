package n1exercici1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MonthsTest {

	@Test
	public void testPotiton8() {
	
		String months [] =  Months.months();
		
		String expectedMonth = "August";	
		
		String actualMonth = Months.potition8(months);
		
		assertEquals(expectedMonth, actualMonth);
		
	}
	
	@Test
	public void testArrayLength() {
		String months [] =  Months.months();
		
		int expectedLength = 12; 
		
		int actualLength = Months.arrayLength(months); 
		
		assertEquals(expectedLength, actualLength);
	}
	
	@Test
	public void testArrayNotNull() {
		
		String months [] =  Months.months();
		
		assertTrue(Months.arrayNotNull(months));
		
	}

}
