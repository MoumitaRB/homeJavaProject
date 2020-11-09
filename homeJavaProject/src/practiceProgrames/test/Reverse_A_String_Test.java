package practiceProgrames.test;



import static org.junit.Assert.assertEquals;

import org.junit.Test;

import practiceProgram.Reverse_A_String;

public class Reverse_A_String_Test {
	
	Reverse_A_String tester = new Reverse_A_String();

    @Test
    public void reverseAStringTestCase1()
    {
         // test start
    	String result = tester.reverseAString("Selenium Java");
        // assert statements
        assertEquals(result, "avaJ muineleS");
    }
    
    @Test
    
    public void reverseAStringTestCase2()
    {
    	
    	String result= tester.reverseAString("Selenium");
    	assertEquals(result, "Selenium Java");
    }
    
   
    @Test
    
    public void reverseAStringTestCase3()
    {
    	
    	String result= tester.reverseAString("Selenium");
    	assertEquals(result, "avaj muineles");
    }
    
    @Test
    
    public void reverseAStringTestCase4()
    {
    	
    	String result= tester.reverseAString("Selenium");
    	assertEquals(result, "null");
    }
}
