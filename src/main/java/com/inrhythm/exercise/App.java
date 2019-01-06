package com.inrhythm.exercise;

public class App {

	private static final String UNDESIRABLES = "[,.;!?(){}\\[\\]<>%]";
	
	//RETURN AN ARRAY WITH [0] = LENGTH AND [1] = WORD.
	public static Object[] getLongestWord(String text) {
		
		//REMOVE ANY PUNCTUATION THA COULD INTERFERE IN OUR RESULT.
		String[] words = text.replaceAll(UNDESIRABLES, "").split(" ");
		String longest = "";
		
		for (String word : words) {
			if(word.length() > longest.length())
				longest = word;
			
		}
		
		Object[] result = {longest.length(), longest};
		return result;
	}

}
