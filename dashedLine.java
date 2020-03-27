public class dashedLine {
	public static void main(String[] args) {
		Turtle carl = new Turtle();
		//dashedLine(carl, 400, 7);
		//carl.color("red");
		//carl.backward(400);
		dashedPolygon(carl, 100, 7, 5);
		carl.penup();
		carl.forward(200);
		carl.pendown();
		dashedPolygon(carl, 150, 5, 6);
	}

	// draws dashed line
	public static void dashedLine(Turtle t, double length, int numDashes) {
		for (int i = 0; i < numDashes - 1; i++) {
			t.forward(length / (2 * numDashes - 1));
			t.penup();
			t.forward(length / (2 * numDashes - 1));
			t.pendown();	
		}
		t.forward(length / (2 * numDashes - 1));
	} 

// draws dashed polygon
	public static void dashedPolygon(Turtle t, double length, int numDashes, int numSides) {
		for (int i = 0; i < numSides; i++) {
			dashedLine(t, length, numDashes);
			t.left(360.0 / numSides);
		}
	}

}
