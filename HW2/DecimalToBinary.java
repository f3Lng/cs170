public class DecimalToBinary {
	//DOESN'T PRINT ALL 8 AND WHEN ZERO, PRINTS NOTHING
	public static String decimalToBinary(int n) {
		String binary = " ";
		String binary2 = " ";

		//remainder when n / 2 is either 1 or 0
		for (int i = n; i > 0; i = i / 2) {
			binary += Integer.toString(i % 2);
		}

		//add extra zeros in binary2 (before the reverse) if length of binary is less than 8 digits
		if (binary.length() <= 1) {
			binary2 += "00000000";
		} else if (binary.length() <= 2) {
			binary2 += "0000000";
		} else if (binary.length() <= 3) {
			binary2 += "000000";
		} else if (binary.length() <= 4) {
			binary2 += "00000";
		} else if (binary.length() <= 5) {
			binary2 += "0000";
		} else if (binary.length() <= 6) {
			binary2 += "000";
		} else if (binary.length() <= 7) {
			binary2 += "00";
		} else if (binary.length() <= 8) {
			binary2 += "0";
		} else {
			binary2 = " ";
		}

		//reverses String binary
		for (int i = binary.length() - 1; i >= 0; i--) {
			binary2 = binary2 + binary.charAt(i);
		}
		return binary2;
	}
	
	public static void main(String[] args) {
		System.out.println(decimalToBinary(156)); //10011100
		System.out.println(decimalToBinary(1)); //00000001
		System.out.println(decimalToBinary(255)); //11111111
		System.out.println(decimalToBinary(23)); //00010111
		System.out.println(decimalToBinary(0)); //00000000
	}
}
