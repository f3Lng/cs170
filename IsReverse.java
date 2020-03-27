public class IsReverse { //DONE
	
	public static boolean isReverse(String s1, String s2) {
		if (s1.length() == 0 && s2.length() == 0) {
			return true;
		} else {
			return (s1.charAt(0) == s2.charAt(s2.length()-1)) && isReverse(s1.substring(1), s2.substring(0, s2.length()-1));
		} //return true/false depending on whether first char == last char AND true/false depending on isReverse
	}

	public static void main(String[] args) {
		System.out.println(isReverse("happy", "yppah")); //true
		System.out.println(isReverse("cool", "loac")); //false
		System.out.println(isReverse("", "")); //true
		System.out.println(isReverse("lydia", "aidyl")); //true
	}
}