package practiceProgram;

import java.util.HashMap;
import java.util.Map;

public class Occurance_Of_Each_Word_In_A_String {
	
	private Map<String, Integer> wordCountMap = new HashMap<>();

//	public Occurance_Of_Each_Word_In_A_String(String line) {
//		countWordsInLine(line);
//	}
	
	public Integer getWordCount(String word) {
		return wordCountMap.get(word);
	}

//	public static void main(String[] args) {
//		String str="one two three two one five six eight three five three seven six ten one two one two";
//		
//		Occurance_Of_Each_Word_In_A_String myObj = new Occurance_Of_Each_Word_In_A_String(str);
//	    System.out.println(myObj.getWordCount("five"));
//	}

	public void countWordsInLine(String str) {
		String tempArray[]=str.split(" ");	
		
		for(String word:tempArray)
		{
		  if(wordCountMap.containsKey(word))
		  {
			  wordCountMap.put(word, wordCountMap.get(word)+1);
		  }
		  else
		  {
			  wordCountMap.put(word, 1);
		  }
			
			
		}
	}
	
	
}