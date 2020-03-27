public class CreditCardChecksum { //DONE

	public static int luhnChecksum(int[] x) {
		int result = 0;
		for (int i = 0; i < x.length; i = i + 2) {
			int n = x[i] * 2;
			if (n >= 10) {
				while (n > 0) {
					result += (n % 10);
					n = n / 10;
				}
			} else {
				result += n;
			}
		}
		for (int j = 1; j < x.length; j = j + 2) {
			result += x[j];
		}
		return result;
	}

	public static void main(String[] args) {
		int[] a = {4, 5, 6, 3, 9, 2};
		System.out.println(luhnChecksum(a));
		int[] b = {4, 9, 9, 1, 6, 5, 7};
		System.out.println(luhnChecksum(b));
	}

}
