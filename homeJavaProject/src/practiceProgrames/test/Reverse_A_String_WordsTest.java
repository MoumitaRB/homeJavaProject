package practiceProgrames.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import practiceProgram.Reverse_A_String_Words;

public class Reverse_A_String_WordsTest {
	
	Reverse_A_String_Words tester=new Reverse_A_String_Words();
	
	
	@Test
    public void testCase1()
    {
    	String result=tester.reverseStringWords("I love India");
    	assertEquals(result,"India love I");
    	
    }
	
	@Test
    public void testCase2()
    {
    	String result=tester.reverseStringWords("I love India");
    	assertEquals(result,"India love I ");
    	
    }
	
	@Test
    public void testCase3()
    {
    	String result=tester.reverseStringWords("I love India");
    	assertEquals(result,"india love I ");
    	
    }
	
	@Test
    public void testCase4()
    {
    	String result=tester.reverseStringWords("I love India");
    	assertEquals(result,"I love India");
    	
    }
}
