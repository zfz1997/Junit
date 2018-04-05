package com.iotek.calculate;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotSame;

import org.junit.Test;
public class CalculatorTest {
   
	@Test
     public void add() {
    	 
    	 assertEquals(6,new Calculator().add(1,5));
     }
	@Test
	public void  substract() {
		assertEquals(7,new Calculator().subtract(9,1));
	}
	 @Test
	  public void testAssertArrayEquals() {
	    byte[] expected = "trial".getBytes();
	    byte[] actual = "trial".getBytes();
	    assertArrayEquals("failure - byte arrays not same", expected, actual);
	  }
	 @Test
	  public void testAssertFalse() {
	    assertFalse("failure - should be false", false);
	  }
	  
	 @Test
	  public void testAssertNotSame() {
	    assertNotSame("should not be same Object", new String(), new Calculator());
	  }
	 
}
