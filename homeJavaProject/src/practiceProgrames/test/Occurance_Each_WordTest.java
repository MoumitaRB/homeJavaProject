package practiceProgrames.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import practiceProgram.Occurance_Of_Each_Word_In_A_String;

public class Occurance_Each_WordTest {
	
	Occurance_Of_Each_Word_In_A_String tester=new Occurance_Of_Each_Word_In_A_String();
	
	@Test
	public void testCase1()
	{
		tester.countWordsInLine("one four three two one four two five one three two one");
		int result=tester.getWordCount("one");
		assertEquals(result, 4);
		
	}
	
	@Test
	public void testCase2()
	{
		tester.countWordsInLine("one four three two one four two five one three two one");
		int result=tester.getWordCount("one");
		assertEquals(result, 3);
		
	}
	
	@Test
	public void testCase3()
	{
		tester.countWordsInLine("one four three two one four two five one three two one");
		int result=tester.getWordCount("one");
		assertEquals(result, 5);
		
	}
	
	@Test
	public void testCase4()
	{
		tester.countWordsInLine("one four three two one four two five one three two one");
		int result=tester.getWordCount("one");
		assertEquals(result, 0);
		
	}

}
