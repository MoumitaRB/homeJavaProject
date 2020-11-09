package practiceProgrames.test;

import static org.junit.Assert.assertTrue;


import org.junit.Test;

import junit.framework.Assert;
import practiceProgram.Assending_Elements;

public class Assending_ElementsTest {
	
	Assending_Elements tester =new Assending_Elements();
	
	@Test
	public void testCase1()
	{
		boolean result=tester.assendingElements();
		assertTrue(result);
	   
		
	}

	

}
