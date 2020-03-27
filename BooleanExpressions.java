public class BooleanExpressions {
	public static void main(String[] args) {

		//boolean values
		System.out.println(true);
		System.out.println(false);
		System.out.println("true"); //STRING

		//boolean expressions - expressions that evaluate to a boolean value
		System.out.println(5 < 2); //false
		System.out.println(5 > 2); //true
		//System.out.println(5 = 2); ERROR, not false bc = is an assignment
		System.out.println(5 == 2); //false bc == is a comparison
		System.out.println(5 == 5); //true

		//can store boolean values into variables
		boolean x = true;
		boolean y = 5 < 2; 
		System.out.println(x); //true
		System.out.println(y); //false bc assignment is false

		//relational (comparison) operators 
		// < less than
		// > greater than
		// <= less than or equal to
		// >= greater than or equal to
		// == equals
		// != not equal
		//take 2 numbers and returns boolean

		//boolean (logical operators)
		// && and
		// || or
		// ! not 
		// takes 1 or 2 boolean values and returns boolean

		System.out.println("-- Boolean operators test --");
		//not
		System.out.println(!true); //false
		System.out.println(!false); //true

		//and
		System.out.println(true && true); //true
		System.out.println(true && false); //false
		System.out.println(false && true); //false
		System.out.println(false && false); //false

		//or
		System.out.println(true || true); //true
		System.out.println(true || false); //true
		System.out.println(false || true); //true
		System.out.println(false || false); //false

		//Boolean operator precedence (pemdas)
		// 1) !
		// 2) &&
		// 3) ||
		System.out.println(false || !true && true); //false
		
	}

}