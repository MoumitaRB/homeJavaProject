package practiceProgrames.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import practiceProgram.Reverse_A_Number;

public class Reverse_A_NumberTest {
	
	Reverse_A_Number tester=new Reverse_A_Number();
	
	@Test
	
	public void reveseANumberTestCase1()
	{
		int result=tester.reverseNumber(5639);
		assertEquals(result, 9365);
	}
	
  @Test
	
	public void reveseANumberTestCase2()
	{
		int result=tester.reverseNumber(5639);
		assertEquals(result, 5639);
	}
  
  @Test
	
	public void reveseANumberTestCase3()
	{
		int result=tester.reverseNumber(5639);
		assertEquals(result, 0);
	}
   
  @Test
	
	public void reveseANumberTestCase4()
	{
		int result=tester.reverseNumber(5639);
		assertEquals(result, 93657);
	}
  
  @Test
	
	public void reveseANumberTestCase5()
	{
		int result=tester.reverseNumber(5639);
		assertEquals(result, 936);
	}
}
