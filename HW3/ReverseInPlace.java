public class ReverseInPlace { //DONE

	public static void reverse(int[] x) {
		
		int[] result = new int[x.length];
			int j = x.length - 1;
			for (int i = 0; i < x.length; i++) {
					result[i] = x[j];
					j--;
				}
		for (int i = 0; i < x.length; i++) {
			x[i] = result[i];
		}
	}

	public static String arrayToString(int[] x) {
		String result = "[";
		for (int i = 0; i < x.length - 1; i++) {
			result += x[i] + ", ";
		}
		result += x[x.length - 1] + "]";
		return result;
	}

	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5}; 
		reverse(a);
		System.out.println(arrayToString(a)); //[5, 4, 3, 2, 1]
		int[] b = {1};
		reverse(b);
		System.out.println(arrayToString(b)); //[1]
		int[] c = {12, 11, 10};
		reverse(c);
		System.out.println(arrayToString(c)); //[10, 11, 12]
	}

}
