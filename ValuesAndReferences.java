public class ValuesAndReferences {
	
	public static void main(String[] args) {
		int a = 5;
		int b = 7;
		System.out.println("a: " + a + ", b: " + b);
		a = b; //doesn't get updated when change b
		System.out.println("a: " + a + ", b: " + b);
		b = 8;
		System.out.println("a: " + a + ", b: " + b); // a: 7, b: 8

		//arays
		int[] x = new int[3]; //create array and assign to variable x
		int[] y = new int[3]; //memory of new array stored in "the heap", not main. 
			//x/y is address of where array is in heap
			//x contains reference to where array is in heap (arrow from x box to array in heap)
		x[0] = 5; //seeing x directs u to line 13 which references the heap
		y[0] = 7; //put 7 in y in line 14 which references the heap
		System.out.println("x[0]: " + x[0] + ", y[0]: " + y[0]);
		x = y; //don't change value, CHANGE THE REFERENCE, array x is now completely lost
				//x isn't the array, x is the arrow that directs the main to the heap
				//therefore, both x and y in the main are referencing the same array in the heap
				//x is now an alias of y (both arrows point to same memory in heap)
				//not copy of array, the SAME array
		System.out.println("x[0]: " + x[0] + ", y[0]: " + y[0]); //print 7 and 7
		y[0] = 8; //changes y[0] in heap, but x[0] also points to that same value
		System.out.println("x[0]: " + x[0] + ", y[0]: " + y[0]); //print 8 and 8


		//Example 2: methods
		int k = 10; //box k in main
		System.out.println("k: " + k); //10
		f(k); //k in method f is not the same k as the one in main, f has its own k, doesn't share variables with main
				//k = 11 bc calls methods
		System.out.println("k: " + k); //print 10 bc calls the variable from main, not use from method


		int[] h = new int[3]; //creates array in heap, put reference into a variable named h
		h[0] = 10;
		System.out.println("h[0]: " + h[0]); //10


		g(h); //new memory space dedicated to execution of method g
				//h in this memory space is not an array, it is a reference to an array
				//calling g(h) creates another arrow into arrow from other memory, 
				//g(h) and int[] h refer to same array in heap
				//h[0] = h[0] + 1 = 10 + 1 = 11, puts 11 in array in heap
		System.out.println("h[0]: " + h[0]); //11 when call h, call that updated number in heap
			//create array inside methods, makes method modify the array permanently

	}


	//Example 2: methods
	public static void f(int k) { //void methods don't return anything
		k = k + 1;
	}

	public static void g(int [] h) {
		h[0] = h[0] + 1;
	}



}