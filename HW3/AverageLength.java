public class AverageLength { //DONE
	
	public static double avgLength(String[] x) {
		double result = 0.0;
		for (int i = 0; i < x.length; i++) {
			result += x[i].length(); //sums total characters in array
		}
		result = result / x.length; //divide total by number of strings
		return result;
	}

	public static void main(String[] args) {
		String[] a = {"hello", "q"}; //3.0
		String[] b = {""}; //0.0
		String[] c = {"hello", "goodbye"}; //6.0
		String[] d = {"hey", "hi", "hello"}; //3.333333
		System.out.println(avgLength(a));
		System.out.println(avgLength(b));
		System.out.println(avgLength(c));
		System.out.println(avgLength(d));
	}

}
