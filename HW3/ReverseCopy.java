public class ReverseCopy { //DONE
	
	public static int[] reverseCopy(int[] x) {
		int[] result = new int[x.length];
		int j = x.length - 1;
		for (int i = 0; i < x.length; i++) {
				result[i] = x[j];
				j--;
			}
		return result;
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
		int[] a = {1, 2, 3};
		int[] b = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int[] a2 = reverseCopy(a);
		int[] b2 = reverseCopy(b);
		System.out.println(arrayToString(a2));
		System.out.println(arrayToString(b2));
	}
	
}
