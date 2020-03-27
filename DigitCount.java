public class DigitCount {

	public static int digitCount(int number, int digit) {
		number = Math.abs(number); //turn positive so mod will work
		 int count = 0;
		 int length = Integer.toString(number).length(); //loop length number of times
		for (int i = 1; i <= length; i++) {
			if (number % 10 == digit) { //number in ones place == digit
				count += 1;
				number = number / 10; //update number so that next digit will be in ones place
			} else {
				number = number / 10;
		}
	}
	return count;
}

	public static void main(String[] args) {
		System.out.println(digitCount(5623, 4));
		System.out.println(digitCount(1231233, 3));
		System.out.println(digitCount(65, 5));
		System.out.println(digitCount(444444, 4));
		System.out.println(digitCount(456234, 8));
		System.out.println(digitCount(456234, 5));
		System.out.println(digitCount(456234, 4));
		System.out.println(digitCount(-456234, 4));
		System.out.println(digitCount(0, 0));
	}
}