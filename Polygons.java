public class Polygons {
	public static void main(String[] args) {
		Turtle carl = new Turtle();
		square(carl, 100);
		square(carl, 200);
		carl.left(30);
		square(carl, 150);
		carl.right(30);
		carl.color("blue");
		triangle(carl, 250);
		carl.color("red");
		pentagon(carl, 150);
		carl.color("green");
		polygon(carl, 70, 7);
	}

	//draws square
	public static void square(Turtle t, double size) {
		for (int i = 0; i < 4; i++) {
			t.forward(size);
			t.left(90);

	}
}

	//draws a triangle
	public static void triangle(Turtle t, double size) {
		for (int i = 0; i < 3; i++) {
			t.forward(size);
			t.left(120);
		}
	}

	// draws a pentagon
	public static void pentagon(Turtle t, double size) {
		for (int i = 0; i < 5; i++) {
			t.forward(size);
			t.left(72);
		}
	}

// draws polygon
	public static void polygon(Turtle t, double size, int numSides) {
		for (int i = 0; i < numSides; i++) {
			t.forward(size);
			t.left(360.0 / numSides);
		}
	}
}