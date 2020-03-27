public class Conditionals {
	
	public static void main(String[] args) {
		System.out.println("-- Test smallestNumber --");
		System.out.println(smallestNumber(5, 2)); //2.0 bc double
		System.out.println(smallestNumber(2, 5)); //2.0
		System.out.println(smallestNumber(5, 5)); //5.0
		System.out.println(longestString("aa", "aaa")); //aa
		System.out.println(longestString("aaa", "bbb")); //bbb
		System.out.println(longestString("lydia", "feng")); //feng
		System.out.println(stateOfWater(56)); //liquid
		System.out.println(stateOfWater(0)); //liquid		TEST EDGE CASES!!
		System.out.println(stateOfWater(100)); //liquid
		System.out.println(letterGrade(750)); //C
		System.out.println(letterGrade(900)); //A
		System.out.println(wrongLetterGrade(950)); //prints "D"
	}

	//returns the smallest of two numbers
	public static double smallestNumber(double x, double y) {
		if (x < y) { //test the if statement. statement must evaluate to a boolean. 
			return x; //depending on result execute different blocks
		} else {
			return y;
		}
	}

	//returns the longest string
	public static String longestString(String s1, String s2) {
		if (s1.length() < s2.length()) {
			return s1;
		} else {
			return s2;
		}
	}


	//write a method named stateOfWater(double temp) 
	//that takes a number temp representing a temperature in celsius
	//returns physical state of water at that temp
	//"solid" if temp is below 0
	//"liquid" if between 0 and 100 (including)
	//"gas" if temp is above 100
	public static String stateOfWater(double temp) {
		String state;
		if (temp < 0) {
			state = "solid";
		//} else if (0 <= temp <= 100) { 
			//SYNTAX ERROR 
			//bc 2 operations... 0 <= temp returns a boolean value. 
			//then boolean <= 100 is an error
		//} else if (0 <= temp && temp <= 100) { //use && to separate two operations (REDUNDANT)
			//can remove 0 <= temp bc the fact that it passed the first "if" statement means its > 0
		} else if (temp <= 100) {
			state = "liquid";
		} else {
				state = "gas";
	}
	return state;
}


	//returns a letter grade given the number of points
	public static String letterGrade(int points) {
		String grade;
		if (points >= 900) {
			grade = "A";
		} else if (points >= 800) {
			grade = "B";
		} else if (points >= 700) {
			grade = "C";
		} else if (points >= 600) {
			grade = "D";
		} else {
			grade = "F";
		}
		return grade;
	}


	//fix wrong
	public static String wrongLetterGrade(int points) {
		String letter;
		if (points >= 900) {
			letter = "A";
		} if (points >= 800) {
			letter = "B";
		} if (points >= 700) {
			letter = "C";
		} if (points >= 600) {
			letter = "D";
		} else {
			letter = "F";
		}
		return letter;
	}
}