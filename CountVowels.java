public class CountVowels {

	public static void main(String[] args) {
		System.out.println(countVowels("AeIoU"));
		System.out.println(countVowels("ccccccccccc"));
		System.out.println(countVowels("Lydia Feng"));
	}


	public static int countVowels(String s) {
		int result = 0;
		String s2 = s.toLowerCase(); //standardize string as all lowercase so only need to check against lowercase vowels
		for (int i = 0; i < s.length(); i++) { //check letter at i place against all vowels
		if (s2.charAt(i) == 'a' || s2.charAt(i) == 'e' || s2.charAt(i) == 'i' || s2.charAt(i) == 'o' || s2.charAt(i) == 'u') {
			result += 1; //add one if character at i is any of the vowels
		} else {
			result = result;
		}
	}
	return result;
	}

}