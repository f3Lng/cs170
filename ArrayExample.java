public class ArrayExample {
//aray is collection of variables all of same type (slots are numbered 0 - n)

	public static void main(String[] args) {
		int[] a; //an array of type int, array called a. haven't created array, just declared it
		a = new int[4]; //creates an array with 4 slots
		a[0] = 7; //assign that slot to 7
		a[1] = 3;
		a[2] = 15;
		a[3] = 9;

		System.out.println(a[2]);
		//System.out.println(a); //not printing content of array, printint label of array
		for (int i = 0; i < a.length; i++) { //a.length is length of a
			System.out.print(a[i]);
		}
		System.out.println(); //empty to just print line break

		int[] b = new int[0]; //useless empty array
		//test sumAll
		System.out.println("Sum: " + sumAll(a));
		System.out.println("Sum: " + sumAll(b));

		//test arrayToString
		System.out.println(arrayToString(a));
		System.out.println(arrayToString(b));

		//test minValue
		System.out.println(minValue(a));

		//test minIndex
		System.out.println(minIndex(a));
	}




	//sum all elements in array x
	public static int sumAll(int[] x) {
		int sum = 0;
		for (int i = 0; i < x.length; i++) {
			sum = sum + x[i];
		}
		return sum;
	}


	//return string representation of an array
	//a[0], a[1], a[2], ...
	//doesn't crash if empty aray
	public static String arrayToString(int[] x) {
		String array = "[";
		for (int i = 0; i < x.length - 1; i++) { //length - 1 bc don't do last loop to not have last ", "
			array += (x[i]) + ", ";
		}

		if (x.length > 0) { //need to guard against 0
		array += (x[x.length-1]); //if array is exmpty, x.length - 1 is -1
		}

		array = array + "]";
		return array;
	}


	//find the minimum element in array x assuming its not empty
	public static int minValue(int[] x) {
		int result = x[0]; //so far, smallest number is first
		for (int i = 1; i < x.length; i++) { //start at 1 bc 0 is in initialization
			if (x[i] < result) {
				result = x[i];
			} 
		}
		return result;
	}


	//find index of the min element
	public static int minIndex(int[] x) {
		int index = 0;
		int result = x[0];
		for (int i = 1; i < x.length; i++) {
			if (x[i] < result) {
				index = i;
			}
		}
		return index;
	}



}