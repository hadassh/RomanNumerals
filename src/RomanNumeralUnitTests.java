import static org.junit.Assert.*;

import org.junit.Test;


public class RomanNumeralUnitTests {

	private RomanNumerals number = new RomanNumerals();

	@Test
	public void testThat1ReturnsI() {
		assertEquals("I", number.toRoman(1));
		assertEquals("II", number.toRoman(2));
		assertEquals("IV", number.toRoman(4));
		assertEquals("X", number.toRoman(10));
		assertEquals("LI", number.toRoman(51));
		assertEquals("XCIV", number.toRoman(94));
		assertEquals("CD", number.toRoman(400));
		assertEquals("CMI", number.toRoman(901));
		
		
		
	}
	

}
