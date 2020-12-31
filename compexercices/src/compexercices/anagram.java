package compexercices;

import java.util.HashSet;
import java.util.Set;

public class anagram {
	
	
//creating a Set to store the anagram of the words	
static Set < String > anagramHashSet = new HashSet <> ();
	
	
	
	
	
	
	//recursive method intakes string input and rest of string
	public static Set<String> anagramWords(String input,String ana) {
		
	//	
		if(input.length()==0) {
			anagramHashSet.add (ana);
			
		}
		
	//
		for(int index=0; index<input.length(); index++) {
			//substring method won't include the last char in the constructor and will stop at the one before
			String temporaryString= input.substring(0,index)+input.substring(index+1);
		//
			char characterMoved=input.charAt(index);
			//
			anagramWords(temporaryString, ana+characterMoved);
		}
		return anagramHashSet;
		
		
		
		
	}
	

	public static void main(String[] args) {
		String str="baby";
		anagramWords(str, "");
		System.out.println(anagramWords(str, ""));

	}

}
