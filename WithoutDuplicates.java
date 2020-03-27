public class WithoutDuplicates { //DONE

	public static int[] withoutDuplicates(int[] x) {

	//to see how many slots in resulting array
		int count = 0;
		for (int i = x.length - 1; i >= 0; i--) {
			boolean a = true;
				for (int j = i - 1; j >= 0; j--) {
					if (x[i] == x[j]) {
						a = false;
					} 
				}
				if (a) {
					count++;
			}
		}


	//to place into resulting array
		int[] result = new int[count];
		int k = count - 1;
			for (int i = x.length - 1; i >= 0; i--) {
				boolean b = true;
				for (int j = i - 1; j >= 0; j--) {
					if (x[i] == x[j]) {
						b = false;
					}
				}
				if (b) {
					result[k] = x[i];
					k--;
				}
			
			}
			return result; 
		}

	//to print array
	public static String arrayToString(int[] x) {
		String result = "[";
		for (int i = 0; i < x.length - 1; i++) {
			result += x[i] + ", ";
		}
		result += x[x.length - 1] + "]";
		return result;
	}

	public static void main (String[] args) {
		int[] a = {1, 2, 3};
		int[] b = {1, 2, 1, 1, 3, 2, 3};
		int[] c = {1, 2, 3, 4, 5, 5};
		int[] a2 = withoutDuplicates(a);
		int[] b2 = withoutDuplicates(b);
		int[] c2 = withoutDuplicates(c);
		System.out.println(arrayToString(a2)); //[1, 2, 3]
		System.out.println(arrayToString(b2)); //[1, 2, 3]
		System.out.println(arrayToString(c2)); //[1, 2, 3, 4, 5]
	}
}
