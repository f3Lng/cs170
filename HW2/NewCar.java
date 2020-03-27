public class NewCar{
	
// 2. If I were to keep the car for 5 years, I would buy car A, because although 
	// the initial maintenance fee is higher, it increases less each year, and although 
	// it is less fuel efficient, the cost of the actual car brings the total cost after
	// 5 years to an amount lower than car B. If I were to keep the car for 10 years, 
	// I would buy car B, because although the cost of the actual car is higher and the
	// maintenance fee increases faster, the fuel efficiency of car B will make it cheaper
	// in the long term.

// 3. Returning something in the method will store it, and allow it to be used 
	// outside of the method. This can later be printed if the method is called. 
	// If nothing is returned in the method, the value is lost once the method ends.
	// Printing something in the method without returning anything will not actually
	// print it until the method is called in the main method.

	public static String compareCars(int years) {
		String car = "";
		double a = 20000;
		double b = 30000;
		double aMaintenance = 1300;
		double bMaintenance = 1000;
		double miles = 15000;
		double gas = 2.5;

		System.out.println("Year\tCar A\tCar B"); //table header
		System.out.println("0\tCar A\tCar B");

		for (int i = 1; i <= years; i++) {
			a = a + aMaintenance + (miles / 25 * gas); //costs for car a that don't change per year
			aMaintenance += aMaintenance * 0.15; //increase in maintenance cost
			b = b + bMaintenance + (miles / 32 * gas); //costs for car b that don't change per year
			bMaintenance += bMaintenance * 0.1; //increase in maintenance cost
			System.out.println(i + "\t" + a + "\t" + b); //print data
		}


		if (b > a) {
			car = "car A is more economical";
		} else if (b < a) {
			car = "car B is more economical";
		} else {
			car = "car A and car B are equally economical";
		}
		return car;
	}


	public static void main(String[] args) {
		System.out.println(compareCars(5));
		System.out.println(compareCars(10));
	}
}
