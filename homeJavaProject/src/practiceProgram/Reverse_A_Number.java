package practiceProgram;

public class Reverse_A_Number {
	
	public int reverseNumber(int num)
	{
		int remainder=0;
		int quotient=0;
		int reverseNumber=0;
		
		for(int i=0; num>0; i++)
		{
		  if(num!=0)
		  {
			quotient=num/10;
			remainder=num%10;
			num=quotient;
			
			reverseNumber=(reverseNumber*10)+remainder;
		  }
		  
	  }
		
		
		
		return reverseNumber;
		
	}

}
