public class TallyVowels { //DONE
	
	public static int[] tally(String s) {
		String s2 = s.toLowerCase();
		int a = 0;
		int e = 0;
		int i = 0;
		int o = 0;
		int u = 0;
		for (int j = 0; j < s.length(); j++) {
			if (s2.charAt(j) == 'a') {
				a++;
			} else if (s2.charAt(j) == 'e') {
				e++;
			} else if (s2.charAt(j) == 'i') {
				i++;
			} else if (s2.charAt(j) == 'o') {
				o++;
			} else if (s2.charAt(j) == 'u') {
				u++;
			}
		}
		int[] vowels = new int[5];
		vowels[0] = a;
		vowels[1] = e;
		vowels[2] = i;
		vowels[3] = o;
		vowels[4] = u;
		return vowels;
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

	public static void main(String[] args) {
		String y1 = "HEY! Apples and Bananas!"; 
		int[] y2 = tally(y1);
		System.out.println(arrayToString(y2)); //[5, 2, 0, 0, 0]
		String m1 = "LYDIA feng lydia FENG oOo uUu"; //[2, 2, 2, 3, 3]
		int[] m2 = tally(m1);
		System.out.println(arrayToString(m2));
	}

}
