public class Accumulation {

	public static void main(String[] args) {
		System.out.println("--- Test sumN ---");
		System.out.println(sumN(0)); //expect 0
		System.out.println(sumN(1)); //expect 1
		System.out.println(sumN(2)); //expect 3
		System.out.println(sumN(5)); //expect 15

		System.out.println(multN(3)); //expect 6
		System.out.println(multN(5)); //expect 120
		System.out.println(multN(0)); //expect 1 because you start at 1 and loop doesn't run

		System.out.println("--- Test sumMult5 ---");
		System.out.println(sumMult5(0)); //expect 0
		System.out.println(sumMult5(3)); //expect 0
		System.out.println(sumMult5(5)); //expect 5
		System.out.println(sumMult5(12)); //expect 15
		System.out.println(sumMult5(15)); //expect 30
		System.out.println(sumMult5(16)); //expect 30
		
		System.out.println(multiplyString("hey", 3));
		System.out.println(multiplyString("h", 5));		
		System.out.println(multiplyString("hey", 0));
		System.out.println(multiplyString(" ", 100));

	}

	//sum all the integers between 1 and n (included)
	public static int sumN(int n) {
		int result = 0; 
		for (int i = 1; i <= n; i++) {
			result = result + i; //update result
		}
		return result;
	}


	//multiply all the integers between 1 and n (included)
	public static int multN(int n) {
		int result = 1;
		for (int i = 1; i <= n; i++) { //i++ means i = i + 1
			result = result * i;
		}
		return result;
	}


	//sums all the integer multiples of 5 up to n (included)
	public static int sumMult5 (int n) {
		int result = 0;
		for (int i = 5; i <= n; i += 5) { //i += 5 means i = i + 5
			//result = result + i; means same thing as...
			result += i; //same as result = result + i
		}
		return result;
	}

	//multiply a given string n times
	//example: multiplyString("hey", 3) returns "heyheyhey"
	public static String multiplyString(String s, int n) {
		String result = "";
		for (int i = 0; i < n; i++) {
		result = result + s;
	}
		return result;
	}
}


//accumulation strategy
//1. initialize a variable that will contain the result
//2. update the result inside a loop
//3. after the loop, collect and return the result

