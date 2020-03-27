public class StudentAverages { //DONE

	public static double[] studentAverages(int[][] x) {
		double[] result = new double[x.length];
		int k = 0;
		for (int row = 0; row < x.length; row++) {
			int col = 0;
			while (col < x[0].length) {
				result[k] += x[row][col];
				col++;
			}
			result[k] = result[k] / x[0].length;
			k++;
		}
		return result;
	}

	

	public static String arrayToString(double[] x) {
		String result = "[";
		for (int i = 0; i < x.length - 1; i++) {
			result += x[i] + ", ";
		}
		result += x[x.length - 1] + "]";
		return result;
	}

	public static void main(String[] args) {
		int[][] a = {{50, 100, 0}, {100, 100, 80}};
		double[] a2 = studentAverages(a);
		System.out.println(arrayToString(a2)); //[50.0, 93.3333333333]
		int[][] b = {{10, 10, 11}, {3, 0, 0}};
		double[] b2 = studentAverages(b);
		System.out.println(arrayToString(b2)); //10.333333333, 1.0]

	}

}
