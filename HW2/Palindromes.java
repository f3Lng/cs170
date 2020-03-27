public class Palindromes {
	
	public static void main(String[] args) {
		System.out.println(isPalindrome("kayak"));
		System.out.println(isPalindrome("lydia"));
		System.out.println(isPalindrome("won ton not now"));
	}

	public static Boolean isPalindrome(String input) {
		String input2 = reverse(input);
		if ((input2).equals(input)) { //comparing two strings with ().equals()
			return true;
		} else {
			return false;
		}
	}

//creates String reverse that is the reverse of String input
	public static String reverse(String input) {
		String reverse = "";
		for (int i = input.length(); i > 0; i--) {
			reverse += input.charAt(i-1); 
		return reverse;
		}
	}
}
