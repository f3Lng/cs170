public class LetterCount {
	
	public static int letterCount(String s, String c) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) { //i < s.length(), because last character is s.length()-1
			if (s.charAt(i) == 'c') { //compare letter at i to String c, if equals, add 1 to count
				count = count + 1;
			} else {
				count = count;
			}
		}
		return count;
	}


	public static void main(String[] args) {
		System.out.println(letterCount("abc-123-abc-ABC", "b"));
		System.out.println(letterCount("This is interesting!", "z"));
		System.out.println(letterCount("", "q"));
	}
}