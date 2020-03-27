public class WordCount {
	
	public static int wordCount(String s) {
		int result = 0;
		
		//if string is just one word
		if (s.length() > 0 && s.charAt(0) != ' ') { //first character of string is not a space (is a letter), add to count
			result++;
		}

		//if end of string is space
		if (s.length() > 0 && s.charAt(s.length()-1) == ' ') { //last character of string is a space, dont count
			result--;
		}

		//counts number of times a loop of spaces is ended by a character
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') { //when a character at i is a space
				while ((i < s.length()) && (s.charAt(i) == ' ')) { //until the character is no longer a space, THEN add to count
					i++;
				}
				result++;
		}
	}
	return result;
}



	public static void main(String[] args) {
		System.out.print(wordCount("This is a test"));
		System.out.print(wordCount("This      is      a      test"));
		System.out.println(wordCount(" "));
		System.out.println(wordCount("Wahoo42?!?!?!?!?"));
	}
}