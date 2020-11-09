package practiceProgram;

public class Reverse_A_String {

	public String reverseAString(String str) {
		
    String newStr="";
    
    for(int i=str.length()-1; i>=0; i--)
    {
    	newStr=newStr+str.charAt(i);
    }
		
		
    return newStr;
		
	}

}
