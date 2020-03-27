public class SomeMath {
	//CHECK POLYSPIRAL
	public static void main(String[] args) {
		System.out.println(sumOfSquares(4)); //30
		System.out.println(sumOfSquares(2)); //5
		System.out.println(sumOfSquares(1)); //1
		System.out.println(product(4, 6)); //24
		System.out.println(product(1, 1)); //1
		System.out.println(product(100, 34)); //3400
		System.out.println(compoundInterest(1000, 0.05, 3)); 
		System.out.println(compoundInterest(1, 0.1, 6));
		System.out.println(compoundInterest(20, 0.01, 10));
		System.out.println(polySpiralLength(3, 20, 3));
		System.out.println(polySpiralLength(4, 10, 1));
		System.out.println(polySpiralLength(6, 4, 10));
	}



	public static int sumOfSquares(int n) {
		int result = 0; 
		for (int i = 1; i <= n; i++) {
			result = result + (i * i); //update result by adding next square
		}
		return result;
	}


	public static int product(int x, int y) {
		int result = 0;
		for (int i = 1; i <= y; i++) { 
			result = result + x; //add x's y number of times so y is the nth time x is added
		}
		return result;
	}


	public static double compoundInterest(double money, double interestRate, int years) {
		double result = money;
		for (int i = 0; i < years; i++) {
			result = result + (result * interestRate); //update result by adding interest rate for last result
		}
		return result;
	}


	public static double polySpiralLength(int n, double base, int rounds) {
		double result = 0.0;
		for (int i = 0; i < (rounds * n); i++) {
			result = result + (base * (i + 1)); //update result by adding new base value
		}
		return result;
	}

}
