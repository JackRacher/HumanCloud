package Round1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
 
public class TestClass {
 
@Test
public void addStringsTest() {
	String strings = SumOfTwoBigNumbers.add("99999", "1");
	assertEquals("1,00,000",strings);
}
	
}