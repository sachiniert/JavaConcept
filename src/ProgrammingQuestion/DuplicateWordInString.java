package ProgrammingQuestion;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateWordInString {
	
	//  Hey java is java best language is java
	// java is 3 times and "is":2 : ise solve karne ke liye hashmap ka use karna hoga

	public static void main(String[] args) {
	
		//findDuplicateWordWords("Hey java is java best language is java");
		findDuplicateWordWords("Hey python is not java  but best language is python not java");
		findDuplicateWordWords("100  100 200 100 200");
	
	}
	
	public static void findDuplicateWordWords(String inputString) {
		
		// split:
		String words[] = inputString.split(" ");
		
		// create one hashmap:
		Map<String, Integer> wordCount = new HashMap<String, Integer>();
		
		// to check each word in given array:
		for(String word : words) {
			
			// if word is present 
			if(wordCount.containsKey(word)) {
				wordCount.put(word, wordCount.get(word)+1);
			}else {
				wordCount.put(word, 1);
			}
			
		}
		// extracting all the keys of map -- wordCount
		Set<String> wordsInString = wordCount.keySet();
		
		// loop through all the words in wordCount:
		for(String word: wordsInString ) {
			
			if(wordCount.get(word)>1) {
				System.out.println(word + " :" + wordCount.get(word));
			}
			
		}
	}

}
