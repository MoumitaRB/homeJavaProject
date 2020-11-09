package practiceProgram;

public class Reverse_A_String_Words {
	
	String newStr="";
	
	public String reverseStringWords(String str)
	{
		String tempArray[]=str.split(" ");
		
		for(int i=tempArray.length-1; i>=0; i--)
		{   
			newStr=newStr+tempArray[i]+" ";
		}
		
		newStr = newStr.trim();
		return newStr;
	}

}
