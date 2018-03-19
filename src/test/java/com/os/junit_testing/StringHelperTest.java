package com.os.junit_testing;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class StringHelperTest
{
	StringHelper helper = new StringHelper();
	
	@Test
	public void testTruncatedAInFirst2Position_AinFirst2Positions() {
		assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
	}
  

}