public class SumOfDiffs { //DONE
	
	public static int sumOfDiffs(int[] x) {
		int result = 0;
		for (int i = 0; i < x.length - 1; i++) { //go through each slot in array except last one
			result += x[i] - x[i + 1]; //add slot i and slot i + 1
		}
		return result;
	}

	public static void main(String[] args) {
		int[] a = {3, 4, 5};
		int[] b = {4, 1, 19, 6};
		int[] c = {};
		int[] d = {3, 0, -1};
		System.out.println(sumOfDiffs(a)); //-2
		System.out.println(sumOfDiffs(b)); //-2
		System.out.println(sumOfDiffs(c)); //0
		System.out.println(sumOfDiffs(d)); //4
	}
}
