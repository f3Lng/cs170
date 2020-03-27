public class Polygons2 {
	public static void main(String[] args) {
		Turtle carl = new Turtle();
		dashedLine(carl, 400, 7);
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
}
